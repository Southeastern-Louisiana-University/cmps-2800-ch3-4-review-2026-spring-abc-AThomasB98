import java.util.Scanner;

public class Gatekeeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        int age;
        int code;
        int clearance;

        System.out.print("Enter Age: ");
        age = input.nextInt();

        System.out.print("Enter Security Code: ");
        code = input.nextInt();

        System.out.print("Enter Clearance Level: ");
        clearance = input.nextInt();

        // Boolean Pre-Checks
        boolean ageValid = (age >= 18 && age <= 65);
        boolean codeValid = ((code % 5 == 0 || code % 7 == 0) && code % 10 !=0);

        // Control Flow Decisions
        switch (clearance) {
            case 1:
            case 2:
            case 3:
                if (!ageValid) {
                    System.out.println("Access denied: Invalid age.");
                } else if (!codeValid) {
                    System.out.println("Access denied: Invalid code.");
                } else {
                    System.out.println("Access granted.");
                }
                break;
            default:
                System.out.println("Access denied: Invalid clearance");
                break;
        }
        // Risk Assessment Based on Age?
        String riskLevel = (age < 25) ? "High Risk" : (age <= 50 ? "Medium Risk" : "Low Risk");

        System.out.println("Risk Level: " + riskLevel);






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