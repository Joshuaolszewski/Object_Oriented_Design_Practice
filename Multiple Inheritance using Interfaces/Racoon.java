public class Racoon extends Animal implements Scratcher
{
    public Racoon(String type, String name, int age, String gender, String environment, int speed)
    {
        super(type, name, age, gender, environment, speed);
    }
    
    public void scratch()
    {
        System.out.println("Scratch"); 
    }
}