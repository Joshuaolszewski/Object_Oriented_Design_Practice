public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee empOne = new Employee("Joe", "Smith", 25, "123123343", "245 sjsu lane San Jose Ca", "Man", 180.3, 345, "contractor", 60.0); 
        empOne.introduce();
        System.out.println(empOne.calculatePay(30)); 
        System.out.println();
        
        Employee empTwo = new Employee("Lisa", "Gray", 45, "987364475", "bibidy body boo", "Woman", 120.3, 145, "full time", 110000.0); 
        empTwo.introduce();
        System.out.println(empTwo.calculatePay(2)); 
        System.out.println();
        
        Employee empThree = new Employee("Timothy", "Briggs", 45, "987364475", "bibidy body boo", "Man", 120.3, 145, "full time", 80000.0); 
        empThree.introduce();
        System.out.println(empThree.calculatePay(4));
        System.out.println();
        
        Employee empFour = new Employee("George", "Wallace", 45, "987364475", "bibidy body boo", "Man", 120.3, 145, "part time", 20.0); 
        empFour.introduce();
        System.out.println(empFour.calculatePay(25));
        System.out.println();
        
        Employee empFive = new Employee("Amy", "Student", 45, "987364475", "bibidy body boo", "Man", 120.3, 145, "contractor", 45.0); 
        empFive.introduce();
        System.out.println(empFive.calculatePay(45));
    }
}