package payroll.data.employee;

import java.util.ArrayList;
import java.util.List;

public class Hourly extends Employee{
    
    private Double timeRate;

    private List<Timecard> cards;

    public Hourly(Double tR){
        this.timeRate = tR;
        this.cards = new ArrayList<Timecard>();
    }

    public void setRate(Double tR){
        this.timeRate = tR;
    }

    public Double getRate(){
        return this.timeRate;
    }

    public void setCards(List<Timecard> c){
        this.cards = c;
    }

    public List<Timecard> getCards(){
        return this.cards;
    }

    //cálculo do pagamento
}
