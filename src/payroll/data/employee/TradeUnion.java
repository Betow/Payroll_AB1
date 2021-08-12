package payroll.data.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TradeUnion {
    
    private UUID idU;
    private Double tax;
    private List<Charge> charge;

    public TradeUnion(UUID unique, Double t){
        this.idU = unique;
        this.tax = t;
        this.charge = new ArrayList<Charge>();
    }
    
    public void setidU(UUID i){
        this.idU = i;
    }

    public UUID getidU(){
        return this.idU;
    }

    public void setTax(Double t){
        this.tax = t;
    }

    public Double getTax(){
        return this.tax;
    }

    public void setCharge(List<Charge> c){
        this.charge = c;
    }

    public List<Charge> getCharge(){
        return this.charge;
    }
}
