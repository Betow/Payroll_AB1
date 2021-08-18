package payroll.data.remuneration;

import java.time.DayOfWeek;

public class Payday {
    private String days = new String();
    private DayOfWeek dayWeek;
    private Integer dayMonth;

    public void setDays(String d){
        this.days = d;
    }

    public String getDays(){
        return this.days;
    }

    public void setDayWeek(DayOfWeek dW){
        this.dayWeek = dW;
    }

    public DayOfWeek getDayOfWeek(){
        return this.dayWeek;
    }

    public void setDayMonth(Integer dM){
        this.dayMonth = dM;
    }

    public Integer getDayMonth(){
        return this.dayMonth;
    }
}
