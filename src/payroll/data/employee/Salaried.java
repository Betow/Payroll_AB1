package payroll.data.employee;

public class Salaried extends Employee{

    private Double salary;

    public Salaried(Double s){
        this.salary = s;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return this.salary;
    }

    //cálculo do pagamento
    
}
