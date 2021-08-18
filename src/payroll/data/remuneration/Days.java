package payroll.data.remuneration;

import java.util.ArrayList;
import java.util.List;

public class Days {
    private List<String> days = new ArrayList<String>();

    public void setDaysDefault(){
        this.days.add("Weekly");
        this.days.add("BiWeekly");
        this.days.add("Monthly");
    }

    public String getDaysDefault(int index){
        return this.days.get(index);
    }

    public void setDays(String day){
        this.days.add(day);
    }

    public List<String> getDays(){
        return this.days;
    }
}
