//Tutor class inherits the properties of Teacher class (concept of inheritance)
public class Tutor extends Teacher
{
    
    //instance variables of Tutor Class with private access modifier (concept of encapsulation)
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //constructor for the class Tutor with 10 paramaters
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, double workingHours, double salary, String specialization, String academicQualifications, int performanceIndex)
    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    
    //accessor methods getXXX() for each attributes
    //accessor method for salary
    public double getSalary()
    {
        return this.salary;
    }
    
    //accessor method for specialization
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    //accessor method for academicQualifications
    public String getAcademicQualifications()
    {
        return this.academicQualifications;
    }
    
    //accessor method for performanceIndex
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }
    
    //accessor method for isCertified
    public boolean isCertified()
    {
        return this.isCertified;
    }
    
    //setter method setXXX() for setting the salary of tutor
    public void setSalary(double salary, int performanceIndex)
    {
        //a variable to store the appraisal% 
        double appraisal;
        
        //to check if the tutor is already certified or not
        if(isCertified() == false) {
            if(performanceIndex > 5 && getWorkingHours() > 20) {
                if(performanceIndex <= 7) {
                    appraisal = 5;
                }
                else if(performanceIndex <= 9) {
                    appraisal = 10;
                }
                else {
                    appraisal = 20;
                }
                this.salary = salary + (appraisal / 100) * salary;
                this.performanceIndex = performanceIndex;
                this.isCertified = true;
                System.out.println("Salary is set with " + appraisal + "% appraisal");
            }
            else {
                System.out.println("Salary cannot be approved as per the criteria");
            }
        }
        else {
            System.out.println("The tutor is already certified with an approved salary");
        }
    }
    
    //method to remove the tutors that are not certified
    public void removeTutor()
    {
        if(isCertified() == false) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
        else {
            System.out.println("Tutor is certified; cannot be removed.");
        }
    }
    
    //display method overriding
    @Override
    //method to display the details of the tutor
    public void display()
    {
        //since the display method of super class is called in both the conditions of tutor being certified and not being certified
        super.display();
        
        //displaying the information of the tutor only if the tutor is certified
        if(isCertified() == true) {
            System.out.println("Salary ------------------> " + getSalary());
            System.out.println("Specialization ----------> " + getSpecialization());
            System.out.println("Academic Qualification --> " + getAcademicQualifications());
            System.out.println("Performance Index -------> " + getPerformanceIndex());
        }
    }
}
