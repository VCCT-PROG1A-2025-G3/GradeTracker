
package studentgrdaetracker;

import java.util.ArrayList;
import java.util.Scanner;

class StudentGrdaeTracker {
    
    
    //created two array lists to store student names and grades 
    static ArrayList< String> studentsNames = new ArrayList<>();
     static ArrayList<Integer> studentGrades= new ArrayList<>() ;
     
     static Scanner input  = new Scanner(System.in);
     
public static void main(String[] args) {
    System.out.println("Welcome to the Student Grade ");
    
    boolean running = true;
    
    // this is the main loop.
    while (running ){
        System.out.println("What would you like to do ?");
         System.out.println("1.Add a new student and grade ");
         System.out.println("2. Display list of students and their grade ");
          System.out.println("3. Calculate average grade for the subject ");
           System.out.println("4. Search  for a stuent and display their grade");
          System.out.println("5. EXIT");
          
          
          System.out.println("Please enter your  choice ");
        int userChoice = input.nextInt();
         input.nextLine();
         
        System.out.println("Thank  you for GradeMate ");
          input.close();
        // building out method calls  AKA.SWITCH AND BREAK
       // 
       switch (userChoice){
           case 1:
               addStudent();
               break;
               
           case 2 :
               displayList();
               break;
               
           case 3:
               avergaeGrade();
               break;
               
           case 4 :
               searchStudent();
               break;
               
           case 5 :
               System.out.println("Other features will be available soon");
           running = false;
            break;   
           default:
               System.out.println("Invalid choice please try again!");
               
               

       }
       
    }
     System.out.println("Thank  you for GradeMate ");
          input.close();
}       

//creating methods  for addStudent

public static void addStudent(){
    System.out.println("Enter student's name");
    String name = input.nextLine();
    
    System.out.print("Enter" + name + "'s grade:"); 
    int grade = input.nextInt();
    input.nextLine();
    
    studentsNames.add(name);
    studentGrades.add(grade);
    
    System.out.println(name + "was added succesfully!");
    
    
}

public static void displayList(){
 if (studentsNames.isEmpty()){
     System.out.println("No student has been added yet,Please enter a student");
 }
 else{
System.out.println("\n--- Student List ---");
        for (int i = 0; i < studentsNames.size(); i++) {
        System.out.println(studentsNames.get(i) + " - Grade: " + studentGrades.get(i));
    
}
} 
}

    private static void avergaeGrade() {
       if (studentGrades.isEmpty()) {
           System.out.println("No grades  have been added yet,Please enter a grade.");
       }
       else{
           int sum = 0;
           
           //Add grades
           for (int grade: studentGrades){
               sum+=grade;
               
               double  average  = (double) sum/studentGrades.size();
               System.out.println("Average Grade:" + average);
               
        }
    }
        }

   public  static void searchStudent() {
        System.out.println("Enter the students name to search");
        String searchName = input.nextLine();
        int index =studentsNames.indexOf(searchName);
        
        if(index != -1){
        int grade =studentGrades.get(index);
        System.out.println(searchName + "'s grade is:" + grade );
    }
        else {
                System.out.println("Student not found , please enter a valid name ");
        
    }
}
}