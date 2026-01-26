# CMPS-2800C-Spring-2025-Ch3_4
Review Exercises for Chapters 3 and 4
# Chapter 3
Here are the formal problem specifications for the Chapter 3 exercise ("The Logic Gatekeeper"), formatted as a standalone Markdown file.

---

# Problem: The Logic Gatekeeper

**Time Limit:** 30 Minutes
**Chapter Focus:** Chapter 3 (Selections, Boolean Logic, Switch Statements)
**Deliverable:** `Gatekeeper.java`

### 1. Objective

Write a Java program that simulates a security access system. You must validate a user based on overlapping logical rules involving their age, a mathematical property of their security code, and their clearance level.

**Constraint:** You must use a single `main` method. No custom classes or methods are allowed.

### 2. Input Specifications

The program must prompt the user to enter three specific values in this exact order:

1. **Age:** An integer representing the user's age.
2. **Security Code:** An integer.
3. **Clearance Level:** An integer (expected to be 1, 2, or 3).

* **Prompt Example:**
```text
Enter Age: [input]
Enter Security Code: [input]
Enter Clearance Level (1-3): [input]

```



### 3. Processing Logic

You must perform the logic in the following order:

#### A. Boolean Validation (Pre-Check)

Before writing any `if` statements, you must calculate and store the following statuses in **boolean variables**:

1. **`isValidAge`**: True if Age is between **18** and **65** (inclusive).
2. **`isValidCode`**: True if the Security Code meets **all** of the following criteria:
* It is divisible by **5** OR divisible by **7**.
* AND... it is NOT divisible by **10**.


3. **`isBlocked`**: True if the Clearance Level is **NOT** 1, 2, or 3.

#### B. Access Decision (Control Flow)

Use a specific structure of nested selections:

1. **Priority Check 1:** If `isBlocked` is true, immediately print `"ACCESS DENIED: Invalid Level"`.
2. **Priority Check 2:** Else, if `isValidAge` is false, print `"ACCESS DENIED: Age Restriction"`.
3. **Final Validation:** Else, check `isValidCode`.
* If the code is invalid, print `"ACCESS DENIED: Invalid Code"`.
* If the code is valid, use a **Switch Statement** on the **Clearance Level** to print the success message:
* Level 1: `"Guest Access Granted"`
* Level 2: `"User Access Granted"`
* Level 3: `"Admin Access Granted"`





#### C. Risk Assessment (Ternary Operator)

At the very end of the program (regardless of whether access was granted or denied), print a risk assessment line.

* **Condition:** If `Age < 25` OR `Security Code > 1000`.
* **True Result:** `"High Risk"`
* **False Result:** `"Low Risk"`
* **Requirement:** You must use the **Conditional (Ternary) Operator** (`? :`) to generate this string in one line.

### 4. Output Specifications

* The output must consist of exactly one "Access" message followed by one "Risk Assessment" message.

### 5. Sample Runs

**Run 1 (Success - High Risk):**

```text
Enter Age: 20
Enter Security Code: 35
Enter Clearance Level (1-3): 2

User Access Granted
Risk Assessment: High Risk

```

*(Explanation: Access granted because age 20 is valid, code 35 is div by 5 but not 10. High Risk because age < 25.)*

**Run 2 (Success - Low Risk):**

```text
Enter Age: 40
Enter Security Code: 7
Enter Clearance Level (1-3): 3

Admin Access Granted
Risk Assessment: Low Risk

```

**Run 3 (Failure - Bad Code):**

```text
Enter Age: 30
Enter Security Code: 50
Enter Clearance Level (1-3): 1

ACCESS DENIED: Invalid Code
Risk Assessment: Low Risk

```

*(Explanation: 50 is divisible by 5, but it is also divisible by 10, which is forbidden.)*

### 6. Hints

* **Logic:** Be careful with parentheses when combining OR (`||`) and AND (`&&`) operators.
* *Wrong:* `code % 5 == 0 || code % 7 == 0 && code % 10 != 0`
* *Right:* `(code % 5 == 0 || code % 7 == 0) && code % 10 != 0`


* **Switch:** Don't forget the `break;` statements inside your switch cases to prevent "fall-through."
---

# Problem: The Cryptographic Formatter

**Time Limit:** 30 Minutes
**Chapter Focus:** Chapter 4 (Mathematical Functions, Characters, Strings, Formatting)
**Deliverable:** `CryptoFormatter.java`

### 1. Objective

Write a Java program that accepts a coded security string, extracts specific data components using `String` and `Character` methods, performs mathematical calculations, and displays a strictly formatted report using `printf`.

**Constraint:** You must use a single `main` method. No custom classes or methods are allowed.

### 2. Input Specifications

The program must prompt the user to enter a single string code.

* **Prompt Text:** `Enter Code (format: pre-num-suffix): `
* **Input Format:** The user will enter a string in the format `prefix-number-suffix`.
* *Example:* `"  tx-2491-alpha  "`
* The input may contain leading or trailing whitespace which must be removed.
* The input is guaranteed to contain two hyphens (`-`).



### 3. Processing Logic

1. **Sanitization:**
* Remove all leading and trailing whitespace from the input string.


2. **Extraction:**
* Isolate the **Prefix** (substring before the first hyphen).
* Isolate the **ID Number** (substring between the first and second hyphen).
* Isolate the **Suffix** (substring after the second hyphen).


3. **Character Analysis:**
* Extract the **first character** of the **Prefix**.
* Validate that this character is a letter (using `Character.isLetter`).
* *If not a letter:* Print `"Error: Prefix must start with a letter."` and exit the program.


* Convert this character to **Uppercase**. This will be the "Code Group".


4. **Mathematical Calculation:**
* Parse the **ID Number** string into an integer.
* Calculate the **Checksum** using the following formula:


* Use `Math.pow()` and `Math.sqrt()` to solve this.



### 4. Output Specifications

The program must generate a formatted report using `System.out.printf`.

* **Columns:** Two columns: "CATEGORY" and "VALUE".
* **Alignment:** Text in the VALUE column must be **Left-Aligned**.
* **Precision:** The Checksum must be displayed with exactly **3 decimal places**.
* **Layout:** See the Sample Run below for exact spacing requirements.

### 5. Sample Run

**Run 1 (Standard Input):**

```text
Enter Code (format: pre-num-suffix):   tx-2491-alpha  

--- DATA REPORT ---
CATEGORY       VALUE     
-------------------------
Code Group:    T         
ID Number:     2491      
Security Key:  alpha     
Checksum:      12355.239 
-------------------------

```

**Run 2 (Invalid Input):**

```text
Enter Code (format: pre-num-suffix): 9x-500-beta
Error: Prefix must start with a letter.

```

### 6. Hints

* **Indices:** Remember that `substring(start, end)` includes the start index but *excludes* the end index.
* **Parsing:** Use `Integer.parseInt(String)` to convert the numeric part of the string into an `int`.
* **Formatting:** The flag `%-10s` in `printf` will left-align a string within a 10-character width.
