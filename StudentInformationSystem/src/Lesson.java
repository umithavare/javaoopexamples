public class Lesson {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Lesson(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Teacher and branch does not match.\n");
        }
    }

    void printTeacher(){
        this.teacher.getInfo();
    }
}
