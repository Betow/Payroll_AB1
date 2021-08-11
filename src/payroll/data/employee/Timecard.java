package payroll.data.employee;

import java.time.LocalDate;
import java.time.LocalTime;

public class Timecard {
    private LocalDate date;
    private LocalTime in;
    private LocalTime out;

    public Timecard(LocalDate d, LocalTime i, LocalTime o){
        this.date = d;
        this.in = i;
        this.out = o;
    }

    public void setDate(LocalDate d){
        this.date = d;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setIn(LocalTime i){
        this.in = i;
    }

    public LocalTime getIn(){
        return this.in;
    }

    public void setOut(LocalTime o){
        this.out = o;
    }

    public LocalTime getOut(){
        return this.out;
    }
}
