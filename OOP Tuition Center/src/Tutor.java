import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Tutor {

    Scanner Input = new Scanner(System.in);
    private
    String name, IC, Address, Qualification, yearExp, dateJoined, yearInCentre;

    public String toString_tutor(){
        return getTutorName() + "\n" + getTutorIC() + "\n" + getTutorAddress() +"\n" + getTutorQualifi() + "\n" + getYearExp() + "\n" + getDateJoined() + "\n" + getYearsInCentre();
    }


    public Tutor(String tutorName, String tutorIC, String tutorAdd, String tutorQualification, String yearExp, String dateJoined, String yearInCentre){
        setTutoName(tutorName);
        setTutorIC(tutorIC);
        setTutorAddress(tutorAdd);
        setTutorQualifi(tutorQualification);
        setYearExp(yearExp);
        setDateJoined(dateJoined);
        setYearsInCentre(yearInCentre);
    }

    public void setTutoName(String tutorName){
        name = tutorName;
    }

    public void setTutorIC(String tutorIC){
        IC = tutorIC;
    }

    public void setTutorAddress(String tutoAdd){
        Address = tutoAdd;
    }

    public void setTutorQualifi(String tutorQualifi){
        Qualification = tutorQualifi;
    }

    public void setYearExp(String YearExp){
        yearExp = YearExp;
    }

    public void setDateJoined(String DateJoined){
        dateJoined = DateJoined;
    }

    public void setYearsInCentre(String YearsIn){
        yearInCentre = YearsIn;
    }

    //Get from user
    public String getTutorName(){
        System.out.print("Tutor Name: ");
        name = Input.nextLine();
        return name;
    }

    public String getTutorIC(){
        System.out.print("Tutor IC: ");
        IC = Input.nextLine();
        return IC;
    }

    public String getTutorAddress(){
        System.out.print("Tutor Address: ");
        Address = Input.nextLine();
        return Address;
    }

    public String getTutorQualifi(){
        System.out.print("Tutor Qualification: ");
        Qualification = Input.nextLine();
        return Qualification;
    }

    public String getYearExp(){
        System.out.print("Year Experience: ");
        yearExp = Input.nextLine();
        return yearExp;
    }

    String getDateJoined(){
        System.out.print("Date Join the Centre: ");
        dateJoined = Input.nextLine();
        return dateJoined;
    }

    String getYearsInCentre(){
        System.out.print("Years In Centre: ");
        yearInCentre = Input.nextLine();
        return yearInCentre;
    }

}
