public class student {

    String stdname;
    String city;
    int rollno;
    int age;



    student(String Stdname,String City,int Rollno,int Age){
    stdname =Stdname;
    city=City;
    rollno=Rollno;
    age=Age;

    }
   Void set_stdname(){
    stdname=Stdname;
   }
 
   void set_city(){
   city=City();

   }
   void set_rollno(){
    rollno=Rollno;
   }

   void set_age(){
    age=Age;
   }
 
   String get_stdname(){
    return stdname;

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
