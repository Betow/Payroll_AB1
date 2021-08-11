package payroll.menu;

import java.util.Scanner;
import java.util.UUID;

import payroll.data.employee.Employee;
import payroll.menu.utils.InputUtils;

public class EmpMenu {
    
    public static Employee addEmployee(){
        Employee newEmp = new Employee();
        //Payment info
        //payment schedule
        //union member

        Scanner input = new Scanner(System.in);

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

        return newEmp;
    }
}
