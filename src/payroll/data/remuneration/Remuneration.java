package payroll.data.remuneration;

public class Remuneration {
    private Banks bank;
    private RemMethod method;
    private Payday payday;
    private int bankBranch;
    private int bankAccount;

    public void setBank(Banks b){
        this.bank = b;
    }

    public Banks getBank(){
        return this.bank;
    }

    public void setMethod(RemMethod m){
        this.method = m;
    }

    public RemMethod getMethod(){
        return this.method;
    }

    public void setPayday(Payday d){
        this.payday = d;
    }

    public Payday getPayday(){
        return this.payday;
    }

    public void setRemuneration(int bB, int bA){
        this.bankBranch = bB;
        this.bankAccount = bA;
    }

    public void setBankBranch(int bB){
        this.bankBranch = bB;
    }

    public int getBankBranch(){
        return this.bankBranch;
    }

    public void setBankAccount(int bA){
        this.bankAccount = bA;
    }

    public int getBankAccount(){
        return this.bankAccount;
    }
}
