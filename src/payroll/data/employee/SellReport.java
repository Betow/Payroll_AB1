package payroll.data.employee;

import java.time.LocalDate;

public class SellReport {
    
    private LocalDate sellDate;
    private Double saleValue;

    public SellReport(LocalDate d, Double v){
        this.sellDate = d;
        this. saleValue = v;
    }

    public void setSell(LocalDate d){
        this.sellDate = d;
    }

    public LocalDate getSell(){
        return this.sellDate;
    }

    public void setValue(Double v){
        this.saleValue = v;
    }

    public Double getValue(){
        return this.saleValue;
    }

    //data e valor de cada venda
}
