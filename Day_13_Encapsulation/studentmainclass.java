public class studentmainclass {
    
    public static void main(String[] args) {
        student std= new student("Siya","Mumbai",98764,21);
        System.out.println("Student name is :"+std.get_name());
        System.out.println("Student city is "+std.get_city());
        System.out.println("Student rollno. is :"+std.get_rollno());
        System.out.println("Student age is :"+std.get_age());
        std.set_rollno(25);
        std.set_age(22);
        std.set_name("Priya");
        System.out.println("Student name is :"+std.get_name());
        System.out.println("Student city is "+std.get_city());
        System.out.println("Student rollno. is :"+std.get_rollno());
        System.out.println("Student age is :"+std.get_age());
       
    }
}
