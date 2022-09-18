public class Employee extends Person
{
    private int id;
    private String status;
    private double payRate;
    
    public Employee()
    {
        this.id = -1;
        this.status = "empty";
        this.payRate = -1;
    }
    
    public Employee(int id, String status, double payRate)
    {
        this.id = id;
        this.status = status; 
        this.payRate = payRate;
    }
    
    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender, double weight, int id, String status, double payRate)
    {
        super(firstName, lastName, age, ssn, address, gender,weight);
        this.id = id;
        this.status = status; 
        this.payRate = payRate; 
    }
    
    public int getID()
    {
        return this.id; 
    }
    
    public String getStatus()
    {
        return this.status; 
    }
    
    public double getPayRate()
    {
        return this.payRate; 
    }
    
    public void setID(int id)
    {
        this.id = id; 
    }
    
    public void setStatus(String status)
    {
        this.status = status; 
    }
    
    public void setPayRate(double payRate)
    {
        this.payRate = payRate; 
    }
    
    public void introduce()
    {
         System.out.println(toString() + "ID: " + getID() + "\nEmployee Status: " + getStatus() + "\nPayRate: " + getPayRate()); 
    }
    
    public double calculatePay(int units)
    {
        if(getStatus().equals("full time"))
        {
            return units * ((double)1/52) * getPayRate(); 
        }
        else
        {
            return units * getPayRate();
        }
    }
}