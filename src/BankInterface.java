public interface BankInterface {
    public int getBalance();
    public String deposit(int amount);
    public String withdraw(int amount, String password);
    public double rateOfInterest(int amount, int time);
}
