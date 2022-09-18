public class Cat extends Animal implements Domesticated, Scratcher
{
    public Cat(String type, String name, int age, String gender, String environment, int speed)
    {
        super(type, name, age, gender, environment, speed);
    }
    
    public void walk()
    {
        System.out.println("Walking");
    }
    
    public void greetHuman()
    {
        System.out.println("Greeting human");
    }
    
    public void scratch()
    {
        System.out.println("Scratch"); 
    }
}