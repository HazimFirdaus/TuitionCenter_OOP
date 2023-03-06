import java.util.ArrayList;

public class TuitionCenter {
    private String centerName;
    private String physicalAddress;
    private String headMaster;
    private ArrayList<Tutor> tutors;

    public TuitionCenter (String centerName, String physicalAddress, String headMaster){
        this.centerName = centerName;
        this.physicalAddress = physicalAddress;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<Tutor>();
    }

    //Get and Set Method
    public String getCenterName(){
        return centerName;
    }
    public void setCenterName(String centerName){
        this.centerName = centerName;
    }

    public String getPhysicalAddress(){
        return physicalAddress;
    }
    public void setPhysicalAddress(){
        this.physicalAddress = physicalAddress;
    }

    public String getHeadMaster(){
        return headMaster;
    }
    public void setHeadMaster(){
        this.headMaster = headMaster;
    }

    public void addTutor(Tutor tutor){
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor){
      tutors.remove(tutor);
    }

    public ArrayList<Tutor> getTutors(){
        return tutors;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tuition Center Name: ").append(centerName).append("\n");
        builder.append("Address: ").append(physicalAddress).append("\n");
        builder.append("Head Master: ").append(headMaster).append("\n");
        builder.append("Tutors: \n");
        for(Tutor tutor: tutors){
            builder.append(tutor.toString_tutor()).append("\n");
        }
        return builder.toString();
    }
}
