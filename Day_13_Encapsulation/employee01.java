public class employee01 {
    
    String name;
    int salary;
    String city;
    
    employee01(String Name, int Salary , String City){
        name=Name;
        salary=Salary;
        city=City;
    }
    void set_name(String Name){
        name=Name;

    }
    // argument function //
    void set_salary(int Salary){
        salary=Salary;

    }
    void set_city(String City){
        city=City;
    }

    String get_name(){
        return name;
    }
    int get_salary(){
        return salary;

    }
    String get_city(){
        return city;
    }

}