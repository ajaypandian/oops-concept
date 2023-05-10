package tamilnadu.chennai;
class Employee
{ //javac -d . Employee.java
//java tamilnadu.chennai.Employee
String name; 
public static void main(String[] args)
{
Employee employee1 = new Employee(); 
employee1.name = "Raja";
System.out.println(employee1.name); 

Office office = new Office(); 
office.work();
}

}

