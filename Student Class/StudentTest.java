public class StudentTest
{
    public static void main(String[] args)
    {
        Student student = new Student("John", "Smith", 20, 3.6F, "Computer Science major", "School of Computer Science department"); 
        Student.Course test = student.new Course(); 
        test.printSchedule(); 
    }
}