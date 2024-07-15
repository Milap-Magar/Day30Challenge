package src;

    public class CurrentAccount extends BankAccount {
        private double overdraftLimit;

        public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
            super(accountNumber, accountHolderName, initialBalance);
            this.overdraftLimit = overdraftLimit;
        }
        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid withdraw amount or exceeds overdraft limit");
            }
        }
        @Override
        public void displayAccountInfo() {
            super.displayAccountInfo();
            System.out.println("Overdraft Limit: " + overdraftLimit);
        }
    }

