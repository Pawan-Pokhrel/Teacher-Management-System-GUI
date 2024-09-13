//Lecturer class inherits the properties of Teacher class (concept of inheritance)
public class Lecturer extends Teacher
{

    //instance variables of Lecturer Class with private access modifiers (concept of encapsulation)
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    //a variable grade to store the grade according to the gradedScore and then later print if required
    String grade;

    //constructor for the class Tutor with 8 paramaters
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, double workingHours, String department, int yearsOfExperience)
    {
        //call to the super class constructor
        super(teacherId, teacherName, address, workingType, employmentStatus);
        
        //call to the setter method for workingHours in the super class
        super.setWorkingHours(workingHours);
        
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    //accessor methods getXXX() for each attributes
    //accessor method for department
    public String getDepartment()
    {
        return this.department;
    }

    //accessor method for yearsOfExperience
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    
    //accessor method for gradedScore
    public int getGradedScore()
    {
        return this.gradedScore;
    }
    
    //accessor method for hasGraded
    public boolean hasGraded()
    {
        return this.hasGraded;
    }

    //accessor method for grade
    public String getGrade()
    {
        return this.grade;
    }

    //mutator method setXXX() for gradedScore to set the value
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }

    //mehtod for grading assignment
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience)
    {
        //for checking whether the assignment is previously graded or not
        if(hasGraded() == false) {
            if(yearsOfExperience >= 5 && department == this.department) {
                if(gradedScore >= 70) {
                    this.grade = "A";
                }
                else if(gradedScore >= 60) {
                    this.grade = "B";
                }
                else if(gradedScore >= 50) {
                    this.grade = "C";
                }
                else if(gradedScore >= 40) {
                    this.grade = "D";
                }
                else {
                    this.grade = "E";
                }
                setGradedScore(gradedScore);
                this.hasGraded = true;
                System.out.println("Assignment graded successfully!! \nGrade --> " + getGrade());
            }

            else {
                System.out.println("You are not eligible for grading this assignment!!");
            }
        }

        else {
            System.out.println("This assignment has already been graded!!");
        }
    }

    //display method overriding 
    @Override
    //method for displaying details of lecturer
    public void display()
    {
        super.display();
        System.out.println("Department --------------> " + getDepartment());
        System.out.println("Years of Experience -----> " + getYearsOfExperience());

        if(hasGraded() == false) {
            System.out.println("The grade has not been graded yet!!");
        }
        else {
            System.out.println("Graded Score ------------> " + getGradedScore() + "\nGrade -------------------> "+ getGrade());
        }
    }
}