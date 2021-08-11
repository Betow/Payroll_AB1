package payroll.data.employee;

import java.util.UUID;

public class Employee {

    private String firstName = new String();
    private String lastName = new String();
    private String address = new String();
    //model: "City, street, number"
    private String function = new String();
    //model: "Hourly", "Salaried", "Comissioned"
    private UUID id;
    //unique id
    


    public void setName(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getName(){
        return this.firstName + this.lastName;
    }

    public void setId(UUID identity){
        this.id = identity;
    }

    public UUID getId(){
        return this.id;
    }

    public void setAddress(String ad){
        this.address = ad;
    }

    public String getAddress(){
        return this.address;
    }
}
