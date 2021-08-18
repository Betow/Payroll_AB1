package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banks {
    private List<String> banks = new ArrayList<String>();

    public void setBanksDefault(){
        this.banks.add("Federal Savings Bank");
        this.banks.add("Bank of Brazil");
        this.banks.add("Bank Itau");
        this.banks.add("Bradesco Bank");
        this.banks.add("Santander Bank");
    }

    public String getBanksDefault(int index){
        return this.banks.get(index);
    }

    public void setBanks(String newBank){
        this.banks.add(newBank);
    }

    public List<String> getBanks(){
        return this.banks;
    }

    public String chooseBank(Scanner input){
        int i = 1, index = 0;
        System.out.println("Choose one of the banks bellow:");
        for(String b: this.banks){
            System.out.println("[" + i + "]" + b);
            i++;
        }
        index = input.nextInt();
        if(index > 0 && index<= 5){
            index --;
        }
        else{
            System.out.println("The choice was wrong. By default the bank selected is Federal Savings Bank");
            index = 0;
        }
        return this.banks.get(index);
    }
}
