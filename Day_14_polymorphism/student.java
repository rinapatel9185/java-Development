public class student {

    void info(){
     System.out.println("HELLO RIYA");
    }
    void info(String msg){

        System.out.println("WELCOME TO INDIA");
    }
    void info(int riya){
        System.out.println("THANK YOU SO MUCH");
    }
    
    public static void main(String[] args) {
        student std= new student();
        std.info();
        std.info(null);
        std.info(0);
    }
}
