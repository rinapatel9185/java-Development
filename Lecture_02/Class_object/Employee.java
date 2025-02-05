class Employee{

    // Instance variables
    
    String name = "Nishant";
    int salary = 10000;

    // Instance methods

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        // Creating object of Employee class

        // className objectName = new className();
        Employee emp = new Employee();
        emp.display();

    }

}