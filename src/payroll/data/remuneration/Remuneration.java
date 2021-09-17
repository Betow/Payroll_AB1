package payroll.data.remuneration;

import java.time.DayOfWeek;

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

    public String getSelectedBank(){
        return this.bank.getBanksSelected();
    }

    public void setMethod(RemMethod m){
        this.method = m;
    }

    public RemMethod getMethod(){
        return this.method;
    }

    public String getSelectedMethod(){
        return this.method.getremuMethodSelected();
    }

    public void setPayday(Payday d){
        this.payday = d;
    }

    public Payday getPayday(){
        return this.payday;
    }

    public String getDays(){
        return this.payday.getDays();
    }

    public DayOfWeek getDWeek(){
        return this.payday.getDayOfWeek();
    }

    public Integer getDMonth(){
        return this.payday.getDayMonth();
    }
    

    public void setRemuneration(int bB, int bA){
        this.bankBranch = bB;
        this.bankAccount = bA;
    }

    public int getBankBranch(){
        return this.bankBranch;
    }

    public int getBankAccount(){
        return this.bankAccount;
    }
}
