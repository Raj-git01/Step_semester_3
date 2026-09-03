package java_basics.assigment_problems;

/**
 * Week 1 - Assignment Problem 4 : The Warehouse Inventory Balancer.
 * Compares the stock totals of two sections and locates the single largest item.
 */
public class WarehouseInventoryBalancer {

    /** Prints section totals, the balance status and the highest quantity with its location. */
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Invalid input: both sections must hold the same number of categories");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
                totalA, totalB, status, highest, highestSection, highestIndex + 1);
    }

    public static void main(String[] args) {
        analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
        analyzeInventory(new int[]{40, 12, 8}, new int[]{10, 10, 10});
    }
}
