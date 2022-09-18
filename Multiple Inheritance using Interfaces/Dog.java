public class Dog extends Animal implements Domesticated 
{
    public Dog(String type, String name, int age, String gender, String environment, int speed)
    {
        super(type, name, age, gender, environment, speed);
    }
    
    public void bark()
    {
        System.out.println("Barking"); 
    }
    
    public void walk()
    {
        System.out.println("Walking");
    }
    
    public void greetHuman()
    {
        System.out.println("Greeting human");
    }
    
}