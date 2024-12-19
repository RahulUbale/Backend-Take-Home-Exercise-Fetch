package edu.p565.demo1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.p565.demo1.model.Receipt;

@Service
public class ReceiptService {
    private final Map<UUID, Integer> receiptStorage = new HashMap<>();

    public UUID processReceipt(Receipt receipt) {
        UUID id = UUID.randomUUID();
        int points = calculatePoints(receipt);
        receiptStorage.put(id, points);
        return id;
    }

    public Integer getPoints(UUID id) {
        return receiptStorage.get(id);
    }

    private int calculatePoints(Receipt receipt) {
        int points = 0;
    
        // Points for retailer name length (alphanumeric only)
        points += receipt.getRetailer().replaceAll("[^a-zA-Z0-9]", "").length();
    
        // Points based on total
        double total = receipt.getTotal(); // No need to parse
        if (total == Math.floor(total)) points += 50; // Whole number
        if (total % 0.25 == 0) points += 25; // Multiple of 0.25
    
        // Points for number of items
        points += 5 * (receipt.getItems().size() / 2);
    
        // Points for items with description length multiple of 3
        points += receipt.getItems().stream()
            .filter(item -> item.getShortDescription().trim().length() % 3 == 0)
            .mapToInt(item -> (int) Math.ceil(item.getPrice() * 0.2)) // No need to parse
            .sum();
    
        // Points for odd purchase day
        String[] dateParts = receipt.getPurchaseDate().split("-");
        int day = Integer.parseInt(dateParts[2]);
        if (day % 2 == 1) points += 6;
    
        // Points for purchase time between 2:00 PM and 4:00 PM
        String[] timeParts = receipt.getPurchaseTime().split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        if (hour == 14 || (hour == 15 && minute < 60)) points += 10;
    
        return points;
    }
    
    
}
