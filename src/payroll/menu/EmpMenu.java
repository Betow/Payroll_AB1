package payroll.menu;

import java.util.Scanner;
import java.util.UUID;

import payroll.data.employee.Employee;
import payroll.data.employee.Hourly;
import payroll.data.employee.Salaried;
import payroll.menu.utils.InputUtils;

public class EmpMenu {
    
    public static Employee addEmployee(){
        Employee newEmp = new Employee();
        //Payment info
        //payment schedule
        //union member

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter employee's first name:");
        String fName = InputUtils.strIn(input);
        System.out.println("Enter employee's last name:");
        String lName = InputUtils.strIn(input);
        System.out.println("\nEnter employee's address:");
        System.out.println("    ### Use 'City, Street, House Number' as standard ###");
        String address = InputUtils.strIn(input);
        UUID id = UUID.randomUUID();

        newEmp.setName(fName, lName);
        newEmp.setAddress(address);
        newEmp.setId(id);

        System.out.println("Choose the function of the employee:");
        System.out.println("[1] - Hourly\n[2] - Salaried\n[3] - Comissioned");
        int choice = input.nextInt();

        if(choice == 1){
            System.out.println("Enter the Hourly Rate:");
            Double timeValue = InputUtils.dbIn(scanner);
            newEmp = new Hourly(timeValue);
            //agenda de pagamento - horista
        }
        else if(choice == 2){
            System.out.println("Enter the salary:");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
            //agenda de pagamento - assalariado
        }
        else if(choice == 3){
            System.out.println("Enter the salary:");
            Double salaryComissioned = InputUtils.dbIn(scanner);
            Double percentage = InputUtils.dbIn(scanner);
            newEmp = new Comissioned(salaryComissioned, percentage);
        }

        else{
            System.out.println("Sorry, we couldn't recognize your choice. By default Salaried is chosen\n");
            System.out.println("Enter the salary:");
            Double salary = InputUtils.dbIn(scanner);
            newEmp = new Salaried(salary);
        }

        input.close();
        scanner.close();
        return newEmp;
    }
}
