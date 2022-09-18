public class Person
{
    private String firstName; 
    private String lastName; 
    private int age; 
    private String ssn; 
    private String address;
    private String gender; 
    private double weight; 
    
    public Person()
    {
        this.firstName = "empty"; 
        this.lastName = "empty"; 
        this.age = -1; 
        this.ssn = "empty"; 
        this.address = "empty";
        this.gender = "empty";
        this.weight = -1; 
    }
    
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.age = -1; 
        this.ssn = "empty"; 
        this.address = "empty";
        this.gender = "empty";
        this.weight = -1; 
    }
    
    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight; 
    }
    
    public String getFirstName()
    {
        return this.firstName; 
    }
    
    public String getLastName()
    {
        return this.lastName; 
    }
    
    public int getAge()
    {
        return this.age; 
    }
    
    public String getSSN()
    {
        return this.ssn; 
    }
    
    public String getAddress()
    {
        return this.address; 
    }
    
    public String getGender()
    {
        return this.gender; 
    }
    
    public double getWeight()
    {
        return this.weight; 
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName; 
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName; 
    }
    
    public void setAge(int age)
    {
        this.age = age;  
    }
    
    public void setSSN(String ssn)
    {
        this.ssn = ssn; 
    }
    
    public void setAddress(String address)
    {
        this.address = address; 
    }
    
    public void setGender(String gender)
    {
        this.gender = gender; 
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight; 
    }
    
    public String toString()
    {
        return getFirstName() + " " + getLastName() + ": \nAge: " + getAge() + "\nSSN: " + getSSN() + "\nAddress: " + getAddress() + "\nGender: " + getGender() + "\nWeight: " + getWeight() + "\n";       
    }
    
    public void introduce()
    {
        System.out.println(toString()); 
    }
}
  


