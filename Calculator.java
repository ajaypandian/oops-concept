class Calculator
{
public static void main(String[] args)
{
Calculator calculatorobj = new Calculator();
calculatorobj.add(100,200);
calculatorobj.add(100,200.5f);
calculatorobj.add(100,200,"Karthick");
}
void add(int num1, int num2, String name)
{
System.out.println(num1+num2);
}
void add(int num1, float num2)
}
