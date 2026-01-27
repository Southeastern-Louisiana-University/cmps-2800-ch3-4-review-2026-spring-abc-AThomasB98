import java.util.Scanner;

public class Gatekeeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- 1. INPUTS ---
        System.out.println("Enter Age: ");
        int age = input.nextInt();

        System.out.println("Enter Security Code: ");
        int code = input.nextInt();

        System.out.println("Clearence Level (1-3): ");
        int clearence = input.nextInt();








        // --- 2. BOOLEAN PRE-CHECKS (Chapter 3.10) ---

        // Rule: Age must be between 18 and 65 inclusive


        // Rule: (Divisible by 5 OR 7) AND (NOT divisible by 10)
        // We use parentheses to ensure the OR happens before the AND


        // Rule: Level must be 1, 2, or 3. If not, they are blocked.


        // --- 3. CONTROL FLOW DECISIONS (Chapter 3.3 & 3.13) ---

        // Priority 1: Check if the level is totally invalid



        // Priority 2: Check Age



        // Priority 3: Check Code


        // If code is valid, we check the specific level using Switch
















        // --- 4. RISK ASSESSMENT (Ternary Operator - Chapter 3.14) ---
        // Syntax: (condition) ? value_if_true : value_if_false






    }
}