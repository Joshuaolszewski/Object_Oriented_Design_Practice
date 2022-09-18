public class AnimalTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Husky", "Dash", 12, "Male", "Home", 14);
        System.out.println(dog.toString());
        dog.move();
        dog.sound();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.walk();
        dog.greetHuman(); 
        System.out.println();
        
        Cat cat = new Cat("Taby", "Whiskers", 3, "Male", "Home", 8);
        System.out.println(cat.toString());
        cat.move();
        cat.sound();
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.greetHuman(); 
        cat.scratch(); 
        System.out.println();
        
        Racoon racoon = new Racoon("Campeche", "Beefy", 7, "Male", "Junkyard", 3);
        System.out.println(racoon.toString());
        racoon.move();
        racoon.sound();
        racoon.eat();
        racoon.sleep(); 
        racoon.scratch(); 
        System.out.println();
        
        Whale whale = new Whale("Blue", "Boombastic", 107, "Male", "Ocean", 4);
        System.out.println(whale.toString());
        whale.move();
        whale.sound();
        whale.eat();
        whale.sleep();
        whale.swim();
        System.out.println();
    }
}