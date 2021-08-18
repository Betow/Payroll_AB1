package payroll.data.employee;

import java.util.UUID;

import payroll.data.remuneration.Remuneration;

public class Employee {

    private String firstName;
    private String lastName;
    private String address;
    //model: "City, street, number"
    private UUID id;
    //unique id
    private TradeUnion Member = null;
    private Remuneration remuneration;
    


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

    public void setMember(TradeUnion m){
        this.Member = m;
    }

    public TradeUnion getMember(){
        return this.Member;
    }

    public void setRemuneration(Remuneration r){
        this.remuneration = r;
    }

    public Remuneration getRemuneration(){
        return this.remuneration;
    }
}
