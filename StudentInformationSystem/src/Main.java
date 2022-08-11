public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("hasan", "0544555478", "Mth");
        Teacher t2 = new Teacher("Bill Gates","0554","Mzk");
        Teacher t3 = new Teacher("Alex De Souza","5452","Bio");

        Lesson math = new Lesson("Math","101","Mth");
        Lesson biology = new Lesson("Biology","101","Bio");
        Lesson music = new Lesson("Music","101","Mzk");

        math.addTeacher(t1);
        biology.addTeacher(t3);
        music.addTeacher(t2);
        Student s1 = new Student("Elon Musk","0931","4",math,biology,music);
        s1.addBulkExam(54,87,35);
        s1.addBulkOpinionNote(10,100,100);
        s1.isPass();
        Student s2 = new Student("Arda Guler","1010","1",math,biology,music);
        s2.addBulkExam(60,75,85);
        s2.addBulkOpinionNote(100,100,50);
        s2.isPass();
    }
}
