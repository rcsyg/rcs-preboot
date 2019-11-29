package lv.accenture.preboot.collections;

import java.util.HashMap;
import java.util.Map;

public class SaleStatistics {

    public static void main(String[] args) {

        HashMap<String, Integer> clientCategoryDiscount = new HashMap<>();
        clientCategoryDiscount.put("food", 5);
        clientCategoryDiscount.put("toys", 10);
        clientCategoryDiscount.put("clothes", 20);

        CheckEntry[] checkEntries = {
                new CheckEntry("Santa's suit", "clothes", 49.99, 1),
                new CheckEntry("Deer sweater", "clothes", 24.99, 1),
                new CheckEntry("False beard", "clothes", 1.99, 1),
                new CheckEntry("Moet & Chandon Imperial", "beverages", 12.99, 2),
                new CheckEntry("Tangerines 1KG", "food", 2.49, 3),
                new CheckEntry("Kinder SUrprise", "food", 0.99, 12),
                new CheckEntry("Parmigiano Reggiano 100g", "food", 4.99, 1),
                new CheckEntry("Foie gras 50g", "food", 19.99, 1),
                new CheckEntry("Fentimans Rose Lemonade 0.75L", "beverages", 2.99, 1),
                new CheckEntry("Red caviar 250g", "food", 29.99, 1),
                new CheckEntry("Piparkukas 150g", "food", 3.49, 2),
                new CheckEntry("Teddy bear", "toys", 29.99, 1),
                new CheckEntry("LEGO The Death Star", "toys", 499.99, 1),
                new CheckEntry("Radio-controlled helicopter", "toys", 199.99, 1),
                new CheckEntry("Olivie salad 1KG", "food", 4.99, 5),
        };

        // 1) Collect & print sum by each category
        Map<String, Double> sumByCategories = new HashMap<>();
        for(CheckEntry item : checkEntries) {
            String category = item.getCategory();
            double sum = item.getPrice() * item.getQuantity();
            if (sumByCategories.containsKey(category)) {
                double existingSum = sumByCategories.get(category);
                existingSum = existingSum + sum;
                sumByCategories.put(category, existingSum);
            } else {
                sumByCategories.put(category, sum);
            }
        }

        System.out.println(sumByCategories);

        // 2) Calculate purchase sum, adjusted by discounts

        Double finalSum = 0d;
        for (String key : sumByCategories.keySet()) {
            Double value = sumByCategories.get(key);
            if (clientCategoryDiscount.containsKey(key)) {
                Integer discount = clientCategoryDiscount.get(key);
                value = (value * (1 - discount * 0.01));
            }
            System.out.println("Sum by category " + key + " (with discount) : " + value);
            finalSum = finalSum + value;
        }

        System.out.println("Final sum : " + finalSum);
    }

}
