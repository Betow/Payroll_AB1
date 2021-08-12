package payroll.data.employee;

import java.time.LocalDate;

public class Charge {
    
    private LocalDate date;
    private Double charge;

    public Charge(LocalDate d, Double c){
        this.date = d;
        this.charge = c;
    }

    public void setDate(LocalDate d){
        this.date = d;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setCharge(Double c){
        this.charge = c;
    }

    public Double getCharge(){
        return this.charge;
    }
}
