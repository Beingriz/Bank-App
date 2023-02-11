import java.util.UUID;

public class SBIBank implements BankInterface{

    private String nmme;
    private int balance;
    private String accNo;
    private double roi;
    private String password;

    public SBIBank(String nmme, int balance, String password) {
        this.nmme = nmme;
        this.balance = balance;
        this.password = password;
        this.roi = 6.5;
        this.accNo = String.valueOf(UUID.randomUUID());
    }

    public String getNmme() {
        return nmme;
    }

    public void setNmme(String nmme) {
        this.nmme = nmme;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String deposit(int amount) {
        this.balance +=amount;
        System.out.println("Money hsa been credited to "+this.nmme + " Account Successfully!");
        return "Available Balance :  "+this.balance+"/-";

    }

    @Override
    public String withdraw(int amount, String password) {
        if(this.password.equals(password)){
            if(this.balance > amount){
                this.balance -= amount;
            }else{
                return "Insufficient Fund";
            }
        }else{
            return "Incorrect Password";
        }
        return "Money has been Debited. Updated Balance : "+this.balance + "/-";
    }

    @Override
    public double rateOfInterest(int amount, int time) {
        return (double) (amount*this.roi*time)/100.0;
    }
}
