package payroll.menu;

import java.util.Scanner;

import payroll.data.*;

public class PayMenu {
    public static void main(String[] args) {
        int choice;
        boolean running = true;

        Scanner input = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);

        DataEmp dataEmp = new DataEmp();

        //Stack<String> undo = new Stack<>();
        //Stack<String> redo = new Stack<>();

        while(running){
            System.out.println("===========================================================================\n");
            System.out.println("Enter the number for:");
            System.out.println("[1] - Add employee");
            System.out.println("[2] - Remove employee");
            System.out.println("[3] - Set timecard");
            System.out.println("[4] - Set sale report");
            System.out.println("[5] - Set service tax");
            System.out.println("[6] - Edit employee");
            System.out.println("[7] - Run payments");
            System.out.println("[8] - Undo/Redo");
            System.out.println("[9] - Edit payment schedule");
            System.out.println("[10] - New payment schedule");
            System.out.println("[11] - Search employee");
            System.out.println("[ 0] - Close\n");

            choice = input.nextInt();
            input.nextLine();

            switch(choice){

                case 1:
                dataEmp.setEmployee(EmpMenu.addEmployee());
                break;
                
                case 0:
                System.out.println("The Program is closing\n");
                running = false;
                try 
                {
                    Thread.sleep(100);
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("...\n");
                try 
                {
                    Thread.sleep(100);
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("..\n");
                try 
                {
                    Thread.sleep(100);
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println(".\n");
                try 
                {
                    Thread.sleep(100);
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                break;

                default:
                System.out.println("Sorry, we couldn't recognize your choice, choose again please");             
            }
        }
        input.close();
    }
    
}