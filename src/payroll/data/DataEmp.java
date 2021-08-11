package payroll.data;

import java.util.ArrayList;
import java.util.List;

import payroll.data.employee.*;

public class Database {

    List<Employee> employees;

    public Database(){
        this.employees = new ArrayList<Employee>();
    }

    public void setEmployees(List<Employee> emp){
        this.employees = emp;
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public void setEmployee(Employee emp){
        this.employees.add(emp);
    }

    public void remEmployee(int index){
        this.employees.remove(index);
        System.out.println("Employee removed with success!\n");
    }

    public boolean isEmptyEmployee(){
        return this.employees.isEmpty();
    }
}
