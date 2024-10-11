Bank Application

**Overview**
A simple Banking Application in Java that allows users to perform basic operations like checking balance, withdrawing and depositing funds, and viewing transaction history. It follows an MVC architecture.

**Features**
1.Check Balance
2.Withdraw Funds
3.Deposit Funds
4.View Transaction History
5.Secure Login

**Project Structure**
com.zsgs.bankapplication.dto
**User.java**: Represents a bank account holder with fields like account number, name, age, email, password, Aadhaar number, address, and balance. Includes constructors and getter/setter methods.
**Transaction.java**: Represents a user transaction with details like account number, transaction amount, type, date, and balance after the transaction.
com.zsgs.bankapplication.banking
**BankAccount.java**: 
Contains methods to:
1.Check balance
2.Withdraw funds
3.Deposit funds
4.View transaction history

**Future Enhancements**
1.Adding more detailed error handling for incorrect account numbers or insufficient funds.
2.Implementing a database for persisting user and transaction data.
3.Secure password encryption.
4.User-friendly command-line interface or GUI for better interaction.
