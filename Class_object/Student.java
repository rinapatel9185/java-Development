public class Student {

    String name;
    int rollNo;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nishant";
        s1.rollNo = 101;
        s1.display();
    }
    
}
