public class Teacher
{
    
    //instance variables of Teacher Class with private access modifiers (concept of encapsulation)
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private double workingHours;
    
    //constructor for the class Teacher with 5 paramaters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = -1;//workingHours is a non-negative value. So, it will be '-1' if no value is assigned.
    }
    
    //accessor methods getXXX() for each attributes
    //accessor method for teacherId
    public int getTeacherId()
    {
        return this.teacherId;
    }
    
    //accesor method for teacherName
    public String getTeacherName()
    {
        return this.teacherName;
    }
    
    //accessor method for address
    public String getAddress()
    {
        return this.address;
    }
    
    //accessor method for workingType
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    //accessor method for employmentStatus
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    
    //accessor method for workingHours
    public double getWorkingHours()
    {
        return this.workingHours;
    }
    
    
    //setter method setXXX() for setting workingHours
    public void setWorkingHours(double workingHours)
    {
        //working hour is a non-negative entry
        if(workingHours < 0) {
            System.out.println("Invalid entry for working hour");
        }
        else {
            this.workingHours = workingHours;
        }
    }
    
    //method for displaying the obtained attribute values through accessor methods
    public void display()
    {
        System.out.println("Teacher ID --------------> " + getTeacherId());
        System.out.println("Teacher Name ------------> " + getTeacherName());
        System.out.println("Address -----------------> " + getAddress());
        System.out.println("Working Type ------------> " + getWorkingType());
        System.out.println("Employment Status -------> " + getEmploymentStatus());
        
        //since the workingHours has been set to -1 at the beginning, so if the value is not yet assigned
        if(getWorkingHours() == -1) {
            System.out.println("The working hours has not been assigned!!");
        }
        else {
            System.out.println("Working Hours -----------> " + getWorkingHours() + " hrs");
        }
    }
}