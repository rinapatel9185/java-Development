public class student {

    String name;
    String city;
    int rollno;
    int age;



    student(String Name,String City,int Rollno,int Age){
    name = Name;
    city=City;
    rollno=Rollno;
    age=Age;

    }
   void set_name(String Name){
    name =Name;
   }
 
   void set_city(String City){
   city=City;

   }
   void set_rollno(int Rollno){
    rollno=Rollno;
   }

   void set_age(int Age){
    age=Age;
   }
 
   String get_name(){
    return name;

   }

   String get_city(){
    return city;
   }
   int get_rollno(){
    return rollno;
   }

    int get_age(){
        return age;
    }

}
