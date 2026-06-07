# 🏧 **ATM Machine – Java Console Application**

A simple and fully functional **ATM simulation system** built using **Core Java**.
This project improves logical thinking and helps beginners understand important Java concepts like:

✔ Classes & Objects
✔ File Handling
✔ OOP Concepts
✔ Loops & Conditionals
✔ User Input Handling
✔ Encapsulation

---

## 🚀 **Features**

### ✅ **1. User Authentication (PIN Login)**

* User must enter correct PIN to access ATM.
* Incorrect attempts are handled safely.

---

### ✅ **2. Check Balance**

* Shows current available balance.

---

### ✅ **3. Deposit Money**

* User can deposit any amount.
* Updates balance and records transaction.

---

### ✅ **4. Withdraw Money**

* Checks minimum balance.
* Updates account balance.
* Saves transaction in mini statement.

---

### ✅ **5. Change PIN**

* Securely update to new PIN.
* Prevents same PIN repetition.

---

### ✅ **6. Mini Statement (Last 5 Transactions)**

Shows:

* Deposits
* Withdrawals
* Date & Time

---

### ✅ **7. Show Account Details**

* Account Holder Name
* Account Number
* Account Type
* Account Balance

---

### ✅ **8. File-Based User Data Storage**

User details are saved inside a file (Example):

```
UserData.txt
```

Stored data includes:

* Username
* Account number
* Account type
* Current balance
* PIN

This makes the app act like a **real ATM system**.

---

## 🧠 **Tech Used**

| Component    | Technology               |
| ------------ | ------------------------ |
| Language     | Java 20                  |
| IDE          | IntelliJ IDEA            |
| Data Storage | File Handling (Java I/O) |
| Build Type   | Console Application      |

---

## 📂 **Project Structure**

```
ATM-Machine/
│── src/
│    ├── ATM.java
│    ├── ATMOperations.java
│    ├── UserAccount.java
│    ├── ATMMain.java
│
│── user_data/
│    └── account.txt
│
└── README.md
```

---

## ▶️ **How to Run the Project**

1. Clone the repo:

```bash
git clone https://github.com/dhilip2103/ATM-Machine.git
```

2. Open in **IntelliJ IDEA**

3. Run the file:

```bash
ATMMain.java
```

## 🎯 **Output Screen in Console :**

![ATM Output_Screen.png](ATM%20Output_Screen.png)



## 🎯 **Future Enhancements**

* Multiple user accounts
* Admin dashboard
* Database (MySQL) integration
* ATM card lock after 3 wrong attempts
* GUI version (JavaFX or Swing)

---
