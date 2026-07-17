class Employee{
    String name;
    int age;
    public void Emplinfo (){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Employee(){
        System.out.println("Employee Info");
    }
}
public class OOPS {
    public static void main (String args[]){
        Employee e1=new Employee();
        e1.name="aravi";
        e1.age=23;
        e1.Emplinfo();
    }
}
