public class StudentName {

    //atributes
    private String firstName;
    private String midName;
    private String lastName;


    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public void setMidName(String mName){
        this.midName = mName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public String toString(){
        return firstName + " " + midName + " " + lastName;
    }




}
