public class Student 
{
    private String firstName;
    private String lastName; 
    private int age; 
    private float gpa; 
    private String major; 
    private String department; 
    
    public Student()
    {    
    }
    public Student(String firstName, String lastName, int age)
    {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = age; 
    }
    public Student(String firstName, String lastName, int age, float gpa, String major, String department)
    {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = age; 
        this.gpa = gpa;
        this.major = major;
        this.department = department; 
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
    
    public void setGPA(int gpa)
    {
        this.gpa = gpa;
    }
    
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    public void setDepartment(String department)
    {
        this.department = department;
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
    
    public float getGPA()
    {
        return this.gpa;
    }
    
    public String setMajor()
    {
        return this.major; 
    }
    
    public String setDepartment()
    {
        return this.department;
    }

    public class Course
    {
        public void printSchedule()
        {
            System.out.println("CS151 Tue/Thur 6-7:15\n Eng101 Mon/Wed 10-11:15\n Hist100 Tue/Thur 1:30-2:45");
        }
        
    }
}