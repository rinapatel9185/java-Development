public class student02 {

    void info(){
     System.out.println("HELLO RIYA");
    }
    void info(String msg){

        System.out.println("WELCOME TO INDIA");
    }
    void info(int rina){
        System.out.println("THANK YOU SO MUCH");
    }
    
    public static void main(String[] args) {
        student02 std= new student02();
        std.info();
        std.info("hello ");
        std.info(25);
    }
}
