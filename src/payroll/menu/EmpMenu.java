package payroll.menu;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;
import java.util.UUID;

import payroll.data.employee.Comissioned;
import payroll.data.employee.Employee;
import payroll.data.employee.Hourly;
import payroll.data.employee.Salaried;
import payroll.data.employee.TradeUnion;
import payroll.data.remuneration.Payday;
import payroll.data.remuneration.RemMethod;
import payroll.data.remuneration.Remuneration;
import payroll.data.remuneration.Banks;
import payroll.data.remuneration.Days;
import payroll.menu.utils.InputUtils;

public class EmpMenu {
    
    public static Employee addEmployee(){   //Function 01
        Employee newEmp = new Employee();
        TradeUnion newUn;
        Payday newPay = new Payday();
        Days day = new Days();
        day.setDaysDefault();
        RemMethod met = new RemMethod();
        met.setDefaultMethod();
        Banks b = new Banks();
        b.setBanksDefault();

        Calendar cal = Calendar.getInstance();
        Remuneration remuneration = new Remuneration();


        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nEnter employee's first name:   ");
        String fName = InputUtils.strIn(input);
        System.out.printf("Enter employee's last name:  ");
        String lName = InputUtils.strIn(input);
        System.out.printf("Enter employee's address:");
        System.out.println("        # Use 'City, Street, House Number' as standard #       ");
        String address = InputUtils.strIn(input);

        System.out.println("Choose the function of the employee:");
        System.out.println("[1] - Hourly\n[2] - Salaried\n[3] - Comissioned");
        int choice = scanner.nextInt();
        System.out.println();

        if(choice == 1){
            System.out.printf("Enter the Hourly Rate:   ");
            Double timeValue = InputUtils.dbIn(scanner);
            newEmp = new Hourly(timeValue);
            newPay.setDayWeek(DayOfWeek.FRIDAY);
            newPay.setDays(day.getDaysDefault(0));
        }
        else if(choice == 2){
            System.out.printf("Enter the salary:    ");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
            if(dayOfMonth == 31) dayOfMonth = 30;
            newPay.setDayMonth(dayOfMonth);
            newPay.setDays(day.getDaysDefault(2));
        }
        else if(choice == 3){
            System.out.printf("Enter the salary:    ");
            Double salaryComissioned = InputUtils.dbIn(scanner);
            System.out.printf("Enter the sell rate:    ");
            Double percentage = InputUtils.dbIn(scanner);
            newEmp = new Comissioned(salaryComissioned, percentage);
            newPay.setDayWeek(DayOfWeek.FRIDAY);
            newPay.setDays(day.getDaysDefault(1));
        }
        else{
            System.out.println("Sorry, we couldn't recognize your choice. By default Salaried is chosen");
            System.out.printf("Enter the salary:");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
            newPay.setDays(day.getDaysDefault(2));
        }

        System.out.println("Please enter remuneration method:");
        met.getMethod();
        choice = -1;
        choice = scanner.nextInt();
        if(choice > 0 && choice <= 3){
            choice --;
            met.selectedMethod(choice);
            System.out.println("Remuneration " + met.getMethodDefault(choice) +
            " is selected");
        }
        else{
            choice = 2;
            met.selectedMethod(choice);
            System.out.println("We couldn't select your choice. By default, remuneration "
             + met.getMethodDefault(choice) + " is selected");
        }

        System.out.println("\nChoose one of the banks bellow:");
        b.getBank();
        choice = -1;
        choice = scanner.nextInt();
        if(choice > 0 && choice <= 5){
            choice --;
            b.selectedBank(choice);
            System.out.println("The " + b.getBanksDefault(choice) + " is selected");
        }
        else{
            choice = 0;
            System.out.println("We couldn't select your choice. By default the bank "
            + b.getBanksDefault(choice) + " is selected");
        }
        System.out.printf("\nPlease enter your Bank Branch:    ");
        int bB = input.nextInt();
        System.out.printf("\nPlease enter your Bank Account:    ");
        int bA = input.nextInt();
        remuneration.setBank(b);
        remuneration.setMethod(met);
        remuneration.setPayday(newPay);
        remuneration.setRemuneration(bB, bA);

        newEmp.setName(fName, lName);
        newEmp.setAddress(address);
        newEmp.setId(UUID.randomUUID());
        newEmp.setRemuneration(remuneration);

        System.out.println("\nIs the employee a union member?    [Y] or [N]");
        input.nextLine();
        String trade = InputUtils.strIn(input);
        if(trade.equalsIgnoreCase("Y") || trade.equalsIgnoreCase("y")){
            System.out.printf("Enter the Trade Union tax:    ");
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
        newEmp.employeeInfo();
        return newEmp;
    }
}
