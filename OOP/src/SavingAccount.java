package src;

public class SavingAccount {
    public class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
            super(accountNumber, accountHolderName, initialBalance);
            this.interestRate = interestRate;
        }

        public void addInterest() {
            double interest = balance * interestRate / 100;
            deposit(interest);
            System.out.println("Interest added: " + interest);
        }

        @Override
        public void displayAccountInfo() {
            super.displayAccountInfo();
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }

}
