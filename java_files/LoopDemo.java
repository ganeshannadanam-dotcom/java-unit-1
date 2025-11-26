public class LoopDemo {
    public static void main(String[] args) {
        
        System.out.println("=== While Loop ===");
        int i = 1;
        while (i <= 3) {
            System.out.println("Count: " + i);
            i++;
        }
        
        System.out.println("\n=== Do-While Loop ===");
        int j = 1;
        do {
            System.out.println("Count: " + j);
            j++;
        } while (j <= 3);
        
        System.out.println("\n=== For Loop ===");
        for (int k = 1; k <= 3; k++) {
            System.out.println("Count: " + k);
        }
    }
}