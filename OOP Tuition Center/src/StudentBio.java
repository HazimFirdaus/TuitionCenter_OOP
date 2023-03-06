public class StudentBio {

    String name;
    public StudentName  NAME = new StudentName();
    String ic;
    String address;
    String schoolname;
    float mark[] = new float[3];


    void setMark(float stuMark, int i) throws Exception{
        if (stuMark < 0){
            throw new Exception("Error in Mark Detected");
        }
        mark[i] = stuMark;
    }

    public void displayMark(){
        for (int i =0; i< mark.length; i++){
            System.out.println("Marks index " + i + " for student : " + mark[i]);
        }
    }
    float calcAvg(){
        float avg, sum=0;

        for (int i=0; i<mark.length; i++){
            sum += mark[i];
        }
        avg = sum/mark.length;
        return avg;
    }

    public float calcMin(){
        float minimum = 500;

        for (int i =0; i<mark.length; i++){
            if (mark[i] < minimum){
                minimum = mark[i];
            }
        }
        return minimum;
    }

    public void setName(String name){
        String[] splitName = name.split(" ");

        NAME.setFirstName(splitName[0]);
        NAME.setMidName(splitName[1]);
        NAME.setLastName(splitName[2]);
    }

    public String getName(){
        return NAME.toString();
    }

}
