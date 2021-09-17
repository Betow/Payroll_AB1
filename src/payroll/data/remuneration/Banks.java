package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.List;

public class Banks {
    private List<String> banks = new ArrayList<String>();
    private String banksSelected;

    public void setBanksDefault(){
        this.banks.add("Federal Savings Bank");
        this.banks.add("Bank of Brazil");
        this.banks.add("Bank Itau");
        this.banks.add("Bradesco Bank");
        this.banks.add("Santander Bank");
    }

    public void selectedBank(int index){
        banksSelected = getBanksDefault(index);
    }

    public String getBanksSelected(){
        return banksSelected;
    }

    public String getBanksDefault(int index){
        return this.banks.get(index);
    }

    public void setBanks(String newBank){
        this.banks.add(newBank);
    }

    public void getBank(){
        int i = 1;
        for(String b: this.banks){
            System.out.println("[" + i + "]" + b);
            i++;
        }
    }
}