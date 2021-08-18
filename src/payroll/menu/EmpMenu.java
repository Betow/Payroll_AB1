package payroll.menu;

import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import payroll.data.employee.Comissioned;
import payroll.data.employee.Employee;
import payroll.data.employee.Hourly;
import payroll.data.employee.Salaried;
import payroll.data.employee.TradeUnion;
import payroll.data.remuneration.Payday;
import payroll.data.remuneration.RemMethod;
import payroll.data.remuneration.Days;
import payroll.menu.utils.InputUtils;

public class EmpMenu {
    
    public static Employee addEmployee(){   //Function 01
        Employee newEmp = new Employee();
        TradeUnion newUn;
        Payday newPay = new Payday();
        Days day = new Days();
        RemMethod met = new RemMethod();


        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter employee's first name:");
        String fName = InputUtils.strIn(input);
        System.out.println("Enter employee's last name:");
        String lName = InputUtils.strIn(input);
        System.out.println("\nEnter employee's address:");
        System.out.println("    ### Use 'City, Street, House Number' as standard ###");
        String address = InputUtils.strIn(input);

        newEmp.setName(fName, lName);
        newEmp.setAddress(address);
        newEmp.setId(UUID.randomUUID());

        System.out.println("Choose the function of the employee:");
        System.out.println("[1] - Hourly\n[2] - Salaried\n[3] - Comissioned");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the Hourly Rate:");
            Double timeValue = InputUtils.dbIn(scanner);
            newEmp = new Hourly(timeValue);
            newPay.setDayWeek(DayOfWeek.FRIDAY);
            newPay.setDays(day.getDaysDefault(0));
        }
        else if(choice == 2){
            System.out.println("Enter the salary:");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
            newPay.setDays(day.getDaysDefault(2));
        }
        else if(choice == 3){
            System.out.println("Enter the salary:");
            Double salaryComissioned = InputUtils.dbIn(scanner);
            System.out.println("Enter the sell rate:");
            Double percentage = InputUtils.dbIn(scanner);
            newEmp = new Comissioned(salaryComissioned, percentage);
            newPay.setDayWeek(DayOfWeek.FRIDAY);
            newPay.setDays(day.getDaysDefault(1));
        }
        else{
            System.out.println("Sorry, we couldn't recognize your choice. By default Salaried is chosen\n");
            System.out.println("Enter the salary:");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
            newPay.setDays(day.getDaysDefault(2));
        }

        System.out.println("Please enter remuneration method:");
        List<String> rm = met.getMethod();
        int i = 1;
        for(String a : rm){
            System.out.println("[" + i + "]" + a);
            i++;
        }
        choice = -1;
        choice = scanner.nextInt();
        if(choice == 1){
            
        }

        System.out.println("Is the employee a union member?\n[Y] or [N]");
        String trade = InputUtils.strIn(input);
        if(trade.equalsIgnoreCase("Y") || trade.equalsIgnoreCase("y")){
            System.out.println("Enter the Trade Union tax:");
            Double taxUnion = InputUtils.dbIn(scanner);
            newUn = new TradeUnion(UUID.randomUUID(), taxUnion);
            newEmp.setMember(newUn);
        }
        else if(trade.equalsIgnoreCase("N") || trade.equalsIgnoreCase("n")){
            newUn = null;
            newEmp.setMember(newUn);
        }
        else{
            System.out.println("By default, the employee isn't a union member");
            newUn = null;
            newEmp.setMember(newUn);
        }
        return newEmp;
    }
}
