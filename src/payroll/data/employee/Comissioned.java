package payroll.data.employee;

import java.util.ArrayList;
import java.util.List;

public class Comissioned extends Employee{
    
    private Double basePayment;
    private Double sellRate;

    private List<SellReport> sellReport;

    public Comissioned(Double bP, Double sR){
        this.basePayment = bP;
        this.sellRate = sR;
        this.sellReport = new ArrayList<SellReport>();
    }

    public void setBase(Double bP){
        this.basePayment = bP;
    }

    public Double getBase(){
        return this.basePayment;
    }

    public void setPercentage(Double sR){
        this.sellRate = sR;
    }

    public Double getPercentage(){
        return this.sellRate;
    }

    public void setReport(List<SellReport> sellReport){
        this.sellReport = sellReport;
    }

    public List<SellReport> getReport(){
        return this.sellReport;
    }

    //Cálculo do pagamento
}
