public class Teacher {
    String name;
    String mobilePhone;
    String branch;
    Teacher(String name, String mobilePhone, String branch){
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.branch = branch;
    }

    void getInfo(){
        System.out.println("Teacher's name : " + this.name);
        System.out.println("Teacher's branch : " + this.branch);
        System.out.println("Teacher's mobile phone number : " + this.mobilePhone);
    }
}
