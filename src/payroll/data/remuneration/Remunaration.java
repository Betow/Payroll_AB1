package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.Scanner;

public class Remunaration {
    private ArrayList<String> bank;
    private int bankBranch;
    private int bankAccount;

    //meio de pagamento
    //agenda de pagamento

    private void setBankList(){
        this.bank = new ArrayList<String>();
        this.bank.add("Federal Savings Bank");
        this.bank.add("Bank of Brazil");
        this.bank.add("Bank Itau");
        this.bank.add("Bradesco Bank");
        this.bank.add("Santander Bank");
    }

    public ArrayList<String> getBankList(){
        return this.bank;
    }

    public String chooseBank(Scanner input){
        int i = 1, index = 0;
        System.out.println("Choose one of the banks bellow:");
        for(String b: bank){
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
        return this.bank.get(index);
    }

    public Remunaration(int bB, int bA){
        this.bankBranch = bB;
        this.bankAccount = bA;
        setBankList();
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
