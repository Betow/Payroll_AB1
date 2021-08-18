package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.List;

public class RemMethod {
    private List<String> remuMethod = new ArrayList<String>();

    public void Method(){
        
    }
    
    public void setMethodDefault(){
        this.remuMethod.add("Check in hand");
        this.remuMethod.add("Check by post");
        this.remuMethod.add("Bank account deposit");
    }

    public String getMethodDefault(int index){
        return this.remuMethod.get(index);
    }

    public void setMethod(String newMethod){
        this.remuMethod.add(newMethod);
    }

    public List<String> getMethod(){
        return this.remuMethod;
    }
}
