import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


/**
 * The TeacherGUI class provides a graphical user interface for managing teachers.
 * It includes methods for setting up the GUI components, handling user actions,
 * and managing teacher data.
 */

public class TeacherGUI
{
    public static void main(String[] args)
    {   
        // Creating an ArrayList to store teacher objects
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        
        // Creating the main frame for the GUI
        JFrame body = new JFrame("23048667 Pawan Pokhrel");
        
        // Creating font styles for labels and text fields
        Font titleFont = new Font("Century Gothic", Font.BOLD, 28);
        Font textFont = new Font("Roboto",Font.PLAIN, 16);
        Font labelFont = new Font("Roboto", Font.BOLD, 20);
        
        JFrame welcomePage = new JFrame("23048667 Pawan Pokhrel");
        JLabel welcomeTitle = new JLabel("Welcome To Teacher Management Console");
        welcomeTitle.setFont(titleFont);
        JPanel titlePanel = new JPanel();
        JTextArea welcomeText = new JTextArea("\t\t\tWelcome to the Teacher Management Console! 🍎✏\n\n\tThis intuitive platform empowers you to effortlessly manage your educational faculty with precision and ease. From\n\ttracking teacher details to grading assignments and setting salaries, our system streamlines the entire process, \n\tensuring smooth operations for your institution.Experience the efficiency and effectiveness of our Teacher Management \n\tConsole today! \n\n\tGet started and unlock a world of educational administration made simple. 📚💻");
        welcomeText.setFont(labelFont);
        JPanel welcomePanel = new JPanel();
        welcomeText.setEditable(false);
        
        // Creating panels for different sections of the GUI
        JPanel navBar = new JPanel();
        JPanel lecturerBody = new JPanel();
        JPanel lecturerLeftBody = new JPanel();
        JPanel lecturerRightBody = new JPanel();
        JPanel gradeAssignmentBody = new JPanel();
        JPanel tutorBody = new JPanel();
        JPanel tutorLeftBody = new JPanel();
        JPanel tutorRightBody = new JPanel();
        JPanel setSalaryBody = new JPanel();
        JPanel eastGap = new JPanel();
        JPanel westGap = new JPanel();
        JPanel southGap = new JPanel();
        
        // Creating labels for headers and text fields for user input
        JLabel headerLabel = new JLabel("Teacher Management Console");
        headerLabel.setFont(titleFont);
        JLabel gradeAssignmentTitle = new JLabel("Grade the Assignments");
        gradeAssignmentTitle.setFont(titleFont);
        JLabel setSalaryTitle = new JLabel("Set Salary");
        setSalaryTitle.setFont(titleFont);
        JLabel teacherIdLabel = new JLabel("Teacher ID: ");
        JTextField teacherIdField = new JTextField(20);
        JLabel teacherNameLabel = new JLabel("Teacher Name: ");
        JTextField teacherNameField = new JTextField(20);
        JLabel addressLabel = new JLabel("Address: ");
        JTextField addressField = new JTextField(20);
        JLabel workingTypeLabel = new JLabel("Working Type: ");
        JTextField workingTypeField = new JTextField(20);
        JLabel employmentStatusLabel = new JLabel("Employment Status: ");
        JTextField employmentStatusField = new JTextField(20);
        JLabel workingHoursLabel = new JLabel("Working Hours: ");
        JTextField workingHoursField = new JTextField(20);
        JLabel departmentLabel = new JLabel("Department: ");
        JTextField departmentField = new JTextField(20);
        JLabel yearsOfExperienceLabel = new JLabel("Years of Experience: ");
        JTextField yearsOfExperienceField = new JTextField(20);
        JLabel gradedScoreLabel = new JLabel("Graded Score: ");
        JTextField gradedScoreField = new JTextField(20);
        JLabel salaryLabel = new JLabel("Salary: ");
        JTextField salaryField = new JTextField(20);
        JLabel specializationLabel = new JLabel("Specialization: ");
        JTextField specializationField = new JTextField(20);
        JLabel academicQualificationsLabel = new JLabel("Academic Qualifications: ");
        JTextField academicQualificationsField = new JTextField(20);
        JLabel performanceIndexLabel = new JLabel("Performance Index: ");
        JTextField performanceIndexField = new JTextField(20);
        
        // Setting font styles for labels and text fields
        teacherIdLabel.setFont(labelFont);
        teacherNameLabel.setFont(labelFont);
        addressLabel.setFont(labelFont);
        workingTypeLabel.setFont(labelFont);
        employmentStatusLabel.setFont(labelFont);
        workingHoursLabel.setFont(labelFont);
        departmentLabel.setFont(labelFont);
        yearsOfExperienceLabel.setFont(labelFont);
        gradedScoreLabel.setFont(labelFont);
        salaryLabel.setFont(labelFont);
        specializationLabel.setFont(labelFont);
        academicQualificationsLabel.setFont(labelFont);
        performanceIndexLabel.setFont(labelFont);
        welcomeText.setFont(textFont);
        
        teacherIdField.setFont(textFont);
        teacherNameField.setFont(textFont);
        addressField.setFont(textFont);
        workingTypeField.setFont(textFont);
        employmentStatusField.setFont(textFont);
        workingHoursField.setFont(textFont);
        departmentField.setFont(textFont);
        yearsOfExperienceField.setFont(textFont);
        gradedScoreField.setFont(textFont);
        salaryField.setFont(textFont);
        specializationField.setFont(textFont);
        academicQualificationsField.setFont(textFont);
        performanceIndexField.setFont(textFont);
        
        // Creating panels for each section of the GUI
        JPanel headerPanel = new JPanel();
        JPanel teacherIdPanel = new JPanel();
        JPanel teacherNamePanel = new JPanel();
        JPanel addressPanel = new JPanel();
        JPanel workingTypePanel = new JPanel();
        JPanel employmentStatusPanel = new JPanel();
        JPanel workingHoursPanel = new JPanel();
        JPanel departmentPanel = new JPanel();
        JPanel yearsOfExperiencePanel = new JPanel();
        JPanel gradedScorePanel = new JPanel();
        JPanel salaryPanel = new JPanel();
        JPanel specializationPanel = new JPanel();
        JPanel academicQualificationsPanel = new JPanel();
        JPanel performanceIndexPanel = new JPanel();
        JPanel welcomeNav = new JPanel();
        JPanel welcomeButtons = new JPanel();
        
        // Creating buttons for navigation and actions
        JButton directToLecturerPage = new JButton("Lecturer");
        JButton directToTutorPage = new JButton("Tutor");
        JButton addLecturer = new JButton("Add a Lecturer");
        JButton addTutor = new JButton("Add a Tutor");
        JButton goToGradeAssignments = new JButton("Grade the Assignments");
        JButton goToSetSalary = new JButton("Set the salary of Tutor");
        JButton removeTutor = new JButton("Remove the Tutor");
        JButton displayLecturer = new JButton("Display");
        JButton displayTutor = new JButton("Display");
        JButton clear = new JButton("Clear");
        JButton welcomeToLecturer = new JButton("Lecturer");
        JButton welcomeToTutor = new JButton("Tutor");
        JButton gradeAssignments = new JButton("Grade");
        JButton setSalary = new JButton("Set");
        JButton backToLecturerPage = new JButton("Lecturer");
        JButton backToTutorPage = new JButton("Tutor");
        
        // Setting font styles for buttons
        directToLecturerPage.setFont(titleFont);
        directToTutorPage.setFont(titleFont);
        addLecturer.setFont(textFont);
        addTutor.setFont(textFont);
        goToGradeAssignments.setFont(textFont);
        goToSetSalary.setFont(textFont);
        gradeAssignments.setFont(textFont);
        setSalary.setFont(textFont);
        removeTutor.setFont(textFont);
        displayLecturer.setFont(textFont);
        displayTutor.setFont(textFont);
        clear.setFont(textFont);
        
        // Creating panels for buttons
        JPanel lecturerButtons = new JPanel();
        JPanel tutorButtons = new JPanel();
        JPanel commonButtons = new JPanel();
        JPanel gradeButtons = new JPanel();
        JPanel setButtons = new JPanel();
        
        // Making the welcome frame visible and maximizing it
        welcomePage.setVisible(true);
        welcomePage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        welcomePage.setLayout(null);
        
        // Adding the title panel to the navigation bar
        welcomeNav.setBackground(new Color(54, 80, 107));
        
        // Creating and setting up the title panel
        titlePanel.setBackground(new Color(54, 80, 107));
        
        // Setting up the welcome panel
        welcomePanel.setBackground(new Color(112, 154, 191));
        welcomeText.setPreferredSize(new Dimension(800, 150)); // Adjust dimensions as needed
        welcomeText.setLineWrap(true); // Enable line wrapping
        welcomeText.setWrapStyleWord(true); // Wrap at word boundaries
        
        // Adding components to the welcome frame
        welcomePage.add(welcomeNav);
        welcomeNav.setBounds(0,0,1463,120);
        welcomeNav.setLayout(new FlowLayout(FlowLayout.CENTER));
        welcomeNav.add(titlePanel);
        titlePanel.add(welcomeTitle);
        welcomePage.add(welcomePanel);
        welcomePanel.setBounds(250,140,900,400);
        welcomePanel.add(welcomeText);
        welcomePanel.setLayout(new GridLayout(2,1,0,50));
        welcomePanel.add(welcomeButtons);
        welcomeButtons.setPreferredSize(new Dimension(1000,100));
        welcomeButtons.add(welcomeToLecturer);
        welcomeButtons.add(welcomeToTutor);
        welcomeToLecturer.setPreferredSize(new Dimension(100,50));
        welcomeToTutor.setPreferredSize(new Dimension(100,50));

        
        // Setting the layout of the main frame and adding panels to it
        body.setLayout(new BorderLayout());
        body.add(navBar, BorderLayout.NORTH);
        body.add(eastGap, BorderLayout.EAST);
        body.add(westGap, BorderLayout.WEST);
        navBar.setLayout(new FlowLayout(FlowLayout.CENTER));
        navBar.add(directToLecturerPage);
        navBar.add(directToTutorPage);
        
        goToGradeAssignments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(gradeAssignmentBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(true);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(false);
                tutorBody.setVisible(false);
                
                gradeAssignmentBody.setLayout(new GridLayout(5,1,0,50));
                gradeAssignmentBody.add(teacherIdPanel);
                gradeAssignmentBody.add(gradedScorePanel);
                gradeAssignmentBody.add(departmentPanel);
                gradeAssignmentBody.add(yearsOfExperiencePanel);
                gradeAssignmentBody.add(gradeButtons);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                gradeButtons.setLayout(GapFlowLayout);
                gradeButtons.add(backToLecturerPage);
                backToLecturerPage.setFont(textFont);
                gradeButtons.add(gradeAssignments);
                gradeButtons.setBackground(new Color(54,80,107));
                
                gradeAssignmentBody.setPreferredSize(new Dimension(500, 700));
                gradeAssignmentBody.setBackground(new Color(161,200,242));
            }
        });
        
        goToSetSalary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(setSalaryBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(true);
                lecturerBody.setVisible(false);
                tutorBody.setVisible(false);
                
                setSalaryBody.setLayout(new GridLayout(4,1,0,50));
                setSalaryBody.add(teacherIdPanel);
                setSalaryBody.add(salaryPanel);
                setSalaryBody.add(performanceIndexPanel);
                setSalaryBody.add(setButtons);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                setButtons.setLayout(GapFlowLayout);
                setButtons.add(backToTutorPage);
                backToTutorPage.setFont(textFont);
                setButtons.add(setSalary);
                setButtons.setBackground(new Color(54,80,107));
                
                setSalaryBody.setPreferredSize(new Dimension(500, 700));
                setSalaryBody.setBackground(new Color(161,200,242));
            }
        });
        
        backToLecturerPage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {   
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(lecturerBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(true);
                tutorBody.setVisible(false);
                
                lecturerBody.setLayout(new FlowLayout());
                lecturerBody.add(lecturerLeftBody);
                lecturerBody.add(lecturerRightBody);
                
                lecturerLeftBody.setLayout(new GridLayout(5,1,0,50));
                lecturerLeftBody.add(teacherIdPanel);
                lecturerLeftBody.add(teacherNamePanel);
                lecturerLeftBody.add(addressPanel);
                lecturerLeftBody.add(workingTypePanel);
                lecturerLeftBody.add(lecturerButtons);
                
                lecturerRightBody.setLayout(new GridLayout(5,1,0,50));
                lecturerRightBody.add(employmentStatusPanel);
                lecturerRightBody.add(workingHoursPanel);
                lecturerRightBody.add(departmentPanel);
                lecturerRightBody.add(yearsOfExperiencePanel);
                lecturerRightBody.add(commonButtons);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                lecturerButtons.setLayout(GapFlowLayout);
                lecturerButtons.add(addLecturer);
                lecturerButtons.add(goToGradeAssignments);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayLecturer);
                displayTutor.setVisible(false);
                commonButtons.add(clear);
                lecturerButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
                
                
                lecturerBody.setPreferredSize(new Dimension(1200, 700));
                lecturerBody.setBackground(new Color(112,154,191));
                lecturerLeftBody.setPreferredSize(new Dimension(600, 700));
                lecturerRightBody.setPreferredSize(new Dimension(600, 700));
                lecturerLeftBody.setBackground(new Color(161,200,242));
                lecturerRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        welcomeToLecturer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {   
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(lecturerBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(true);
                tutorBody.setVisible(false);
                
                lecturerBody.setLayout(new FlowLayout());
                lecturerBody.add(lecturerLeftBody);
                lecturerBody.add(lecturerRightBody);
                
                lecturerLeftBody.setLayout(new GridLayout(5,1,0,50));
                lecturerLeftBody.add(teacherIdPanel);
                lecturerLeftBody.add(teacherNamePanel);
                lecturerLeftBody.add(addressPanel);
                lecturerLeftBody.add(workingTypePanel);
                lecturerLeftBody.add(lecturerButtons);
                
                lecturerRightBody.setLayout(new GridLayout(5,1,0,50));
                lecturerRightBody.add(employmentStatusPanel);
                lecturerRightBody.add(workingHoursPanel);
                lecturerRightBody.add(departmentPanel);
                lecturerRightBody.add(yearsOfExperiencePanel);
                lecturerRightBody.add(commonButtons);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                lecturerButtons.setLayout(GapFlowLayout);
                lecturerButtons.add(addLecturer);
                lecturerButtons.add(goToGradeAssignments);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayLecturer);
                displayTutor.setVisible(false);
                commonButtons.add(clear);
                lecturerButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
                
                
                lecturerBody.setPreferredSize(new Dimension(1200, 700));
                lecturerBody.setBackground(new Color(112,154,191));
                lecturerLeftBody.setPreferredSize(new Dimension(600, 700));
                lecturerRightBody.setPreferredSize(new Dimension(600, 700));
                lecturerLeftBody.setBackground(new Color(161,200,242));
                lecturerRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        backToTutorPage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(tutorBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(false);
                tutorBody.setVisible(true);
                
                tutorBody.setLayout(new FlowLayout());
                tutorBody.add(tutorLeftBody);
                tutorBody.add(tutorRightBody);
                
                tutorLeftBody.setLayout(new GridLayout(6,1,0,50));
                tutorLeftBody.add(teacherIdPanel);
                tutorLeftBody.add(teacherNamePanel);
                tutorLeftBody.add(addressPanel);
                tutorLeftBody.add(workingTypePanel);
                tutorLeftBody.add(specializationPanel);
                tutorLeftBody.add(tutorButtons);
                
                tutorRightBody.setLayout(new GridLayout(6,1,0,50));
                tutorRightBody.add(employmentStatusPanel);
                tutorRightBody.add(workingHoursPanel);
                tutorRightBody.add(salaryPanel);
                tutorRightBody.add(academicQualificationsPanel);
                tutorRightBody.add(performanceIndexPanel);
                tutorRightBody.add(commonButtons);
                
                tutorButtons.setLayout(new FlowLayout());
                tutorButtons.add(addTutor);
                tutorButtons.add(goToSetSalary);
                tutorButtons.add(removeTutor);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayTutor);
                displayLecturer.setVisible(false);
                commonButtons.add(clear);
                
                tutorButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
        
                tutorBody.setPreferredSize(new Dimension(1200, 700));
                tutorBody.setBackground(new Color(112,154,191));
                tutorLeftBody.setPreferredSize(new Dimension(600, 700));
                tutorRightBody.setPreferredSize(new Dimension(600, 700));
                tutorLeftBody.setBackground(new Color(161,200,242));
                tutorRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        welcomeToTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(tutorBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(false);
                tutorBody.setVisible(true);
                
                tutorBody.setLayout(new FlowLayout());
                tutorBody.add(tutorLeftBody);
                tutorBody.add(tutorRightBody);
                
                tutorLeftBody.setLayout(new GridLayout(6,1,0,50));
                tutorLeftBody.add(teacherIdPanel);
                tutorLeftBody.add(teacherNamePanel);
                tutorLeftBody.add(addressPanel);
                tutorLeftBody.add(workingTypePanel);
                tutorLeftBody.add(specializationPanel);
                tutorLeftBody.add(tutorButtons);
                
                tutorRightBody.setLayout(new GridLayout(6,1,0,50));
                tutorRightBody.add(employmentStatusPanel);
                tutorRightBody.add(workingHoursPanel);
                tutorRightBody.add(salaryPanel);
                tutorRightBody.add(academicQualificationsPanel);
                tutorRightBody.add(performanceIndexPanel);
                tutorRightBody.add(commonButtons);
                
                tutorButtons.setLayout(new FlowLayout());
                tutorButtons.add(addTutor);
                tutorButtons.add(goToSetSalary);
                tutorButtons.add(removeTutor);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayTutor);
                displayLecturer.setVisible(false);
                commonButtons.add(clear);
                
                tutorButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
        
                tutorBody.setPreferredSize(new Dimension(1200, 700));
                tutorBody.setBackground(new Color(112,154,191));
                tutorLeftBody.setPreferredSize(new Dimension(600, 700));
                tutorRightBody.setPreferredSize(new Dimension(600, 700));
                tutorLeftBody.setBackground(new Color(161,200,242));
                tutorRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        directToLecturerPage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {   
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(lecturerBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(true);
                tutorBody.setVisible(false);
                
                lecturerBody.setLayout(new FlowLayout());
                lecturerBody.add(lecturerLeftBody);
                lecturerBody.add(lecturerRightBody);
                
                lecturerLeftBody.setLayout(new GridLayout(5,1,0,50));
                lecturerLeftBody.add(teacherIdPanel);
                lecturerLeftBody.add(teacherNamePanel);
                lecturerLeftBody.add(addressPanel);
                lecturerLeftBody.add(workingTypePanel);
                lecturerLeftBody.add(lecturerButtons);
                
                lecturerRightBody.setLayout(new GridLayout(5,1,0,50));
                lecturerRightBody.add(employmentStatusPanel);
                lecturerRightBody.add(workingHoursPanel);
                lecturerRightBody.add(departmentPanel);
                lecturerRightBody.add(yearsOfExperiencePanel);
                lecturerRightBody.add(commonButtons);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                lecturerButtons.setLayout(GapFlowLayout);
                lecturerButtons.add(addLecturer);
                lecturerButtons.add(goToGradeAssignments);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayLecturer);
                displayTutor.setVisible(false);
                commonButtons.add(clear);
                lecturerButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
                
                
                lecturerBody.setPreferredSize(new Dimension(1200, 700));
                lecturerBody.setBackground(new Color(112,154,191));
                lecturerLeftBody.setPreferredSize(new Dimension(600, 700));
                lecturerRightBody.setPreferredSize(new Dimension(600, 700));
                lecturerLeftBody.setBackground(new Color(161,200,242));
                lecturerRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        directToTutorPage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                body.setVisible(true);
                welcomePage.setVisible(false);
                body.setExtendedState(JFrame.MAXIMIZED_BOTH);
                body.add(tutorBody, BorderLayout.CENTER);
                
                navBar.add(headerPanel);
                headerPanel.add(headerLabel);
                headerPanel.setBackground(new Color(112,146,190));
                headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
                headerPanel.setPreferredSize(new Dimension(1463,60));
                
                gradeAssignmentBody.setVisible(false);
                setSalaryBody.setVisible(false);
                lecturerBody.setVisible(false);
                tutorBody.setVisible(true);
                
                tutorBody.setLayout(new FlowLayout());
                tutorBody.add(tutorLeftBody);
                tutorBody.add(tutorRightBody);
                
                tutorLeftBody.setLayout(new GridLayout(6,1,0,50));
                tutorLeftBody.add(teacherIdPanel);
                tutorLeftBody.add(teacherNamePanel);
                tutorLeftBody.add(addressPanel);
                tutorLeftBody.add(workingTypePanel);
                tutorLeftBody.add(specializationPanel);
                tutorLeftBody.add(tutorButtons);
                
                tutorRightBody.setLayout(new GridLayout(6,1,0,50));
                tutorRightBody.add(employmentStatusPanel);
                tutorRightBody.add(workingHoursPanel);
                tutorRightBody.add(salaryPanel);
                tutorRightBody.add(academicQualificationsPanel);
                tutorRightBody.add(performanceIndexPanel);
                tutorRightBody.add(commonButtons);
                
                tutorButtons.setLayout(new FlowLayout());
                tutorButtons.add(addTutor);
                tutorButtons.add(goToSetSalary);
                tutorButtons.add(removeTutor);
                
                FlowLayout GapFlowLayout = new FlowLayout();
                GapFlowLayout.setHgap(86);
                
                commonButtons.setLayout(GapFlowLayout);
                commonButtons.add(displayTutor);
                commonButtons.add(clear);
                
                tutorButtons.setBackground(new Color(54,80,107));
                commonButtons.setBackground(new Color(54,80,107));
        
                tutorBody.setPreferredSize(new Dimension(1200, 700));
                tutorBody.setBackground(new Color(112,154,191));
                tutorLeftBody.setPreferredSize(new Dimension(600, 700));
                tutorRightBody.setPreferredSize(new Dimension(600, 700));
                tutorLeftBody.setBackground(new Color(161,200,242));
                tutorRightBody.setBackground(new Color(161,200,242));
            }
        });
        
        
        
        
        eastGap.setPreferredSize(new Dimension(100,914));
        westGap.setPreferredSize(new Dimension(100,914));
        southGap.setPreferredSize(new Dimension(1463,100));
        
        
        
        teacherIdPanel.add(teacherIdLabel);
        teacherIdPanel.add(teacherIdField);
        teacherNamePanel.add(teacherNameLabel);
        teacherNamePanel.add(teacherNameField);
        addressPanel.add(addressLabel);
        addressPanel.add(addressField);
        workingTypePanel.add(workingTypeLabel);
        workingTypePanel.add(workingTypeField);
        employmentStatusPanel.add(employmentStatusLabel);
        employmentStatusPanel.add(employmentStatusField);
        workingHoursPanel.add(workingHoursLabel);
        workingHoursPanel.add(workingHoursField);
        departmentPanel.add(departmentLabel);
        departmentPanel.add(departmentField);
        yearsOfExperiencePanel.add(yearsOfExperienceLabel);
        yearsOfExperiencePanel.add(yearsOfExperienceField);
        gradedScorePanel.add(gradedScoreLabel);
        gradedScorePanel.add(gradedScoreField);
        salaryPanel.add(salaryLabel);
        salaryPanel.add(salaryField);
        specializationPanel.add(specializationLabel);
        specializationPanel.add(specializationField);
        academicQualificationsPanel.add(academicQualificationsLabel);
        academicQualificationsPanel.add(academicQualificationsField);
        performanceIndexPanel.add(performanceIndexLabel);
        performanceIndexPanel.add(performanceIndexField);
        
        teacherIdLabel.setPreferredSize(new Dimension(300,50));
        teacherIdField.setPreferredSize(new Dimension(300,50));
        teacherNameLabel.setPreferredSize(new Dimension(300,50));
        teacherNameField.setPreferredSize(new Dimension(300,50));
        addressLabel.setPreferredSize(new Dimension(300,50));
        addressField.setPreferredSize(new Dimension(300,50));
        workingTypeLabel.setPreferredSize(new Dimension(300,50));
        workingTypeField.setPreferredSize(new Dimension(300,50));
        employmentStatusLabel.setPreferredSize(new Dimension(300,50));
        employmentStatusField.setPreferredSize(new Dimension(300,50));
        workingHoursLabel.setPreferredSize(new Dimension(300,50));
        workingHoursField.setPreferredSize(new Dimension(300,50));
        departmentLabel.setPreferredSize(new Dimension(300,50));
        departmentField.setPreferredSize(new Dimension(300,50));
        yearsOfExperienceLabel.setPreferredSize(new Dimension(300,50));
        yearsOfExperienceField.setPreferredSize(new Dimension(300,50));
        gradedScoreLabel.setPreferredSize(new Dimension(300,50));
        gradedScoreField.setPreferredSize(new Dimension(300,50));
        salaryLabel.setPreferredSize(new Dimension(300,50));
        salaryField.setPreferredSize(new Dimension(300,50));
        specializationLabel.setPreferredSize(new Dimension(300,50));
        specializationField.setPreferredSize(new Dimension(300,50));
        academicQualificationsLabel.setPreferredSize(new Dimension(300,50));
        academicQualificationsField.setPreferredSize(new Dimension(300,50));
        performanceIndexLabel.setPreferredSize(new Dimension(300,50));
        performanceIndexField.setPreferredSize(new Dimension(300,50));
        
        teacherIdPanel.setOpaque(false);
        teacherNamePanel.setOpaque(false);
        addressPanel.setOpaque(false);
        workingTypePanel.setOpaque(false);
        employmentStatusPanel.setOpaque(false);
        workingHoursPanel.setOpaque(false);
        departmentPanel.setOpaque(false);
        yearsOfExperiencePanel.setOpaque(false);
        gradedScorePanel.setOpaque(false);
        salaryPanel.setOpaque(false);
        specializationPanel.setOpaque(false);
        academicQualificationsPanel.setOpaque(false);
        performanceIndexPanel.setOpaque(false);
        eastGap.setOpaque(false);
        westGap.setOpaque(false);
        southGap.setOpaque(false);
        lecturerBody.setOpaque(false);
        tutorBody.setOpaque(false);
        
        body.setPreferredSize(new Dimension(1463, 914));
        
        addLecturer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if (teacherIdField.getText() == "" || teacherNameField.getText() == "" || addressField.getText() == "" || workingTypeField.getText() == "" || employmentStatusField.getText() == "" || departmentField.getText() == "" || workingHoursField.getText() == "" || yearsOfExperienceField.getText() == "") {
                        JOptionPane.showMessageDialog(body, "Please, fill out the empty fields!!!", "Empty Fields !!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        String teacherName = teacherNameField.getText();
                        String address = addressField.getText();
                        String workingType = workingTypeField.getText();
                        String employmentStatus = employmentStatusField.getText();
                        double workingHours = Double.parseDouble(workingHoursField.getText());
                        String department = departmentField.getText();
                        int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                        
                        if(teachers.isEmpty()) {
                            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, workingHours, department, yearsOfExperience);
                            teachers.add(lecturer);
                            JOptionPane.showMessageDialog(body, "Lecturer has been added successfully", "Lecture Added", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            for (Teacher teacher: teachers) {
                                if (teacher.getTeacherId() == teacherId) {
                                    if (teacher instanceof Lecturer) {
                                        JOptionPane.showMessageDialog(body, "A lecturer with same id has been detected!", "Duplication Error", JOptionPane.WARNING_MESSAGE);
                                        return;
                                    }
                                }
                                else {
                                    Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, workingHours, department, yearsOfExperience);
                                    teachers.add(lecturer);
                                    JOptionPane.showMessageDialog(body, "Lecturer has been added successfully", "Lecture Added", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Invalid inputs", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        addTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if (teacherIdField.getText() == "" || teacherNameField.getText() == "" || addressField.getText() == "" || workingTypeField.getText() == "" || employmentStatusField.getText() == "" || departmentField.getText() == "" || workingHoursField.getText() == "" || yearsOfExperienceField.getText() == "" || salaryField.getText() == "" || specializationField.getText() == "" || academicQualificationsField.getText() == "" || performanceIndexField.getText() == "") {
                        JOptionPane.showMessageDialog(body, "Please, fill out the empty fields!!!", "Empty Fields !!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        String teacherName = teacherNameField.getText();
                        String address = addressField.getText();
                        String workingType = workingTypeField.getText();
                        String employmentStatus = employmentStatusField.getText();
                        double workingHours = Double.parseDouble(workingHoursField.getText());
                        double salary = Double.parseDouble(salaryField.getText());
                        String specialization = specializationField.getText();
                        String academicQualifications = academicQualificationsField.getText();
                        int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                        
                        if(teachers.isEmpty()) {
                            Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                            teachers.add(tutor);
                            JOptionPane.showMessageDialog(body, "Tutor has been added successfully", "Tutor Added", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            for (Teacher teacher: teachers) {
                                if (teacher.getTeacherId() == teacherId) {
                                    if (teacher instanceof Tutor) {
                                        JOptionPane.showMessageDialog(body, "A tutor with same id has been detected!", "Duplication Error", JOptionPane.WARNING_MESSAGE);
                                        return;
                                    }
                                }
                                else {
                                    Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                                    teachers.add(tutor);
                                    JOptionPane.showMessageDialog(body, "Tutor has been added successfully", "Tutor added", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Invalid Inputs !!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        gradeAssignments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    
                    if (teacherIdField.getText() == "" || teacherNameField.getText() == "" || addressField.getText() == "" || workingTypeField.getText() == "" || employmentStatusField.getText() == "" || departmentField.getText() == "" || workingHoursField.getText() == "" || yearsOfExperienceField.getText() == "" || salaryField.getText() == "" || specializationField.getText() == "" || academicQualificationsField.getText() == "" || performanceIndexField.getText() == "") {
                        JOptionPane.showMessageDialog(body, "Please, fill out the empty fields!!!", "Empty Fields !!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else
                    {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        int gradedScore = Integer.parseInt(gradedScoreField.getText());
                        String department = departmentField.getText();
                        int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                        boolean validityCheck = false;
                        if(gradedScore > 100) {
                            JOptionPane.showMessageDialog(body, "Marking limit exceeded. Cannot be above 100!!", "Marking Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else if(gradedScore < 0) {
                            JOptionPane.showMessageDialog(body, "Marking limit subceeded. Cannot be below 0!!", "Marking Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else if(yearsOfExperience <= 5) {
                            JOptionPane.showMessageDialog(body, "Experience Requirement not fulfilled. Must be 5 years or above!!", "Criteria Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else {
                            if(!teachers.isEmpty()) {
                                for(Teacher teacher: teachers) {
                                    if(teacher.getTeacherId() == teacherId) {
                                        if(teacher instanceof Lecturer) {
                                            Lecturer lecturer = (Lecturer)teacher;
                                            lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                                            if(lecturer.hasGraded() == false) {
                                                JOptionPane.showMessageDialog(body, "Assignment graded successfully!!", "Marks graded", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            else {
                                                JOptionPane.showMessageDialog(body,"The assignment has not been graded. Error!!", "Grade Error!!", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        else {
                                            JOptionPane.showMessageDialog(body,"The assignment couldn't be graded. Teacher Not Found Error!!", "Grade Error!!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(body,"The assignment couldn't be graded. Teacher Not Found Error!!", "Grade Error!!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Empty Fields !!", JOptionPane.WARNING_MESSAGE);
                }

            }
        });
        
        setSalary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if(teacherIdField.getText() == "" || salaryField.getText() == "" || performanceIndexField.getText() == "") {
                        JOptionPane.showMessageDialog(body, "Please, fill out the empty fields!!!", "Empty Fields!!", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                        double salary = Double.parseDouble(salaryField.getText());
                        int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                        
                        if(performanceIndex > 10) {
                            JOptionPane.showMessageDialog(body, "Performance Index limit exceeded. Cannot be above 10!!", "Index Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else if(performanceIndex < 0) {
                            JOptionPane.showMessageDialog(body," Performance Index limit subceeded. Cannot be below 0!!", "Index Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else {
                            if(!teachers.isEmpty()){
                                for(Teacher teacher: teachers) {
                                    if(teacher.getTeacherId() == teacherId) {
                                        if(teacher instanceof Tutor) {
                                            
                                            Tutor tutor = (Tutor) teacher;
                                            tutor.setSalary(salary,performanceIndex);
                                            salary = tutor.getSalary();
                                            if(performanceIndex < 5 && tutor.getWorkingHours() < 20) {
                                                JOptionPane.showMessageDialog(body, "New Salary Requirements not fulfilled.\nPerformance Index must be above 5 or Working Hours must be abpve 20 hours!!", "Salary Not Approved", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            else {
                                                JOptionPane.showMessageDialog(body,"Salary set successfull with salary being " + salary + "!", "Setting Salary", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(body,"The salary couldn't be set. Teacher Not Found Error!!", "Grade Error!!", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Empty Fields !!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        removeTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if(teacherIdField.getText() == "") {
                        JOptionPane.showMessageDialog(body,"Please, fill out the empty Teacher Id field!!!", "Empty Fields!!",JOptionPane.WARNING_MESSAGE);
                        return;
                    }    
                    else {
                        int teacherId = Integer.parseInt(teacherIdField.getText());
           
                        for(Teacher teacher: teachers) {
                            if(teacher.getTeacherId() == teacherId) {
                                if(teacher instanceof Tutor) {
                                    
                                    Tutor tutor = (Tutor) teacher;
                                    boolean isCertified = tutor.isCertified();
                                    if(isCertified == false) {
                                        tutor.removeTutor();
                                        JOptionPane.showMessageDialog(body, "The tutor has been successfully removed", "Tutor Removed", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(body, "Certified tutors cannot be removed","Remove Tutor Error",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }
               
                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Invalid ID",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        displayLecturer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    String teacherName = teacherNameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    int workingHours = Integer.parseInt(workingHoursField.getText());
                    String department = departmentField.getText();
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                    
                    JOptionPane.showMessageDialog(body,"Teacher ID: "+ teacherId + "\nTeacher Name:" + teacherName + "\nAddress:" + address + "\nWorking Type: "+ workingType + "\nEmployment Status: " + employmentStatus + "\nWorking Hours: " + workingHours + "\nDepartment: " + department + "\nYears of Experience: " + yearsOfExperience);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Invalid ID",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        displayTutor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    String teacherName = teacherNameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    int workingHours = Integer.parseInt(workingHoursField.getText());
                    double salary = Double.parseDouble(salaryField.getText());
                    String specialization = specializationField.getText();
                    String academicQualifications = academicQualificationsField.getText();
                    int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                    
                    JOptionPane.showMessageDialog(body,"Teacher ID: "+ teacherId + "\nTeacher Name:" + teacherName + "\nAddress:" + address + "\nWorking Type: "+ workingType + "\nEmployment Status: " + employmentStatus + "\nWorking Hours: " + "\nSalary: "+ salary + "\nSpecialization: "+ specialization + "\nAcademic Qualification: " + academicQualifications + "\nPerformance Index: " + performanceIndex);
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(body, "Please fill data according to the fields!", "Invalid ID",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        // ActionListener for the clear button
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clearing the text fields
                teacherIdField.setText("");
                teacherNameField.setText("");
                addressField.setText("");
                workingTypeField.setText("");
                employmentStatusField.setText("");
                workingHoursField.setText("");
                departmentField.setText("");
                yearsOfExperienceField.setText("");
                gradedScoreField.setText("");
                salaryField.setText("");
                specializationField.setText("");
                academicQualificationsField.setText("");
                performanceIndexField.setText("");
            }
        });
    }
    
}