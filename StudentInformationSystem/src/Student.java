public class Student {
    Lesson lesson1;
    Lesson lesson2;
    Lesson lesson3;

    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String classes, Lesson lesson1, Lesson lesson2, Lesson lesson3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.lesson1 = lesson1;
        this.lesson2 = lesson2;
        this.lesson3 = lesson3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExam(int note1, int note2, int note3){
        if (note1 <= 100 && note1 >= 0){
            this.lesson1.note = note1;
        }
        if (note2 <= 100 && note2 >= 0){
            this.lesson2.note = note2;
        }
        if (note3 <= 100 && note3 >= 0){
            this.lesson3.note = note3;
        }
    }
    void isPass(){
        this.average = (this.lesson1.note + this.lesson2.note + this.lesson3.note) / 3.0 ;
        if (this.average < 55){
            System.out.println("You are not succesfull");
            this.isPass = true;
        }
        else {
            System.out.println("You are succesfull");
            this.isPass = false;
        }

        printNote();
    }

    void printNote(){

        System.out.println(lesson1.name + " Note: " + lesson1.note );
        System.out.println(lesson2.name + " Note: " + lesson2.note );
        System.out.println(lesson3.name + " Note: " + lesson3.note );
        System.out.println("Your avarage : " + this.average);
        System.out.println("********************");
    }
}
