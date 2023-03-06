public class StudentBatch {

    //Student Batch is a list of students
    StudentBio students[] = new StudentBio[10];
    int currsz = 0;


    void AddStudent (StudentBio s){
        students[currsz++] = s;
    }


    //find a particular students
    Boolean find(String name){
        for(int i=0; i<currsz; i++){
            if (students[i].name == name);
            return true;
        }
        return false;
    }
}
