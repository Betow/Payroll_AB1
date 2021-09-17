package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.List;

public class RemMethod {
    private List<String> remuMethod = new ArrayList<String>();
    private String remuMethodSelected;

    public void setDefaultMethod(){
        this.remuMethod.add("Check in hand");
        this.remuMethod.add("Check by post");
        this.remuMethod.add("Bank account deposit");
    }

    public void selectedMethod(int index){
        remuMethodSelected = getMethodDefault(index);
    }

    public String getremuMethodSelected(){
        return remuMethodSelected;
    }

    public String getMethodDefault(int index){
        return this.remuMethod.get(index);
    }

    public void setMethod(String newMethod){
        this.remuMethod.add(newMethod);
    }

    public void getMethod(){
        int i = 1;
        for(String r: this.remuMethod){
            System.out.println("[" + i + "]" + r);
            i++;
        }
    }
}
