import java.util.*;
public class MarksString {
    public static void main(String args[])
    {
        int selection, studentID, SubjectID, StudentNo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        StudentNo = input.nextInt();

        int[][] marks = new int[StudentNo][3];
        
        while (true) 
        {
            selection = menu(input);
            
            switch (selection) {
                case 1:
                {
                    System.out.println("Adding student marks");
                    do  
                    {
                        System.out.print("Enter the student ID number: ");
                        studentID = input.nextInt();
                        if(studentID < 1 || studentID > StudentNo)
                        {
                            System.out.println("Invalid student ID. Please enter a number between 1 and " + StudentNo + ".");
                        }
                    } while (studentID < 1 || studentID > StudentNo);

                    System.out.println("Enter the marks");
                    System.out.print("Mathematics: ");
                    marks[studentID - 1][0] = input.nextInt();
                    System.out.print("Physics: ");
                    marks[studentID - 1][1] = input.nextInt();
                    System.out.print("Chemistry: ");
                    marks[studentID - 1][2] = input.nextInt();
                    
                    // Printing the marks
                    System.out.println("Student ID  Mathematics  Physics  Chemistry");
                    for(int i = 0; i < marks.length; i++)
                    {
                        System.out.print("    " + (i+1) + "      -\t");
                        for(int j = 0; j < marks[i].length; j++)
                        {
                            System.out.print(marks[i][j]+"         ");
                        }
                        System.out.println(" ");
                    }
                }
                break;

                case 2:
                {
                    do  
                    {
                        System.out.print("Enter the student ID number: ");
                        studentID = input.nextInt();
                        if(studentID < 1 || studentID > StudentNo)
                        {
                            System.out.println("Invalid student ID. Please enter a number between 1 and " + StudentNo + ".");
                        }
                    } while (studentID < 1 || studentID > StudentNo);
                    do 
                    {
                        System.out.println("Select the subject ID");
                        System.out.println("Mathematics - 1");
                        System.out.println("Physics - 2");
                        System.out.println("Chemistry - 3");
                        SubjectID = input.nextInt();
                        if(SubjectID < 1 || SubjectID > 3)
                        {
                            System.out.println("Invalid subject ID. Please enter a number between 1 and 3.\n");
                        }
                    } 
                    while (SubjectID < 1 || SubjectID > 3);
                    
                    
                    System.out.print("Enter the marks for the selected subject: ");
                    marks[studentID - 1][SubjectID - 1] = input.nextInt();

                    // Printing the marks
                    System.out.println("Student ID  Mathematics  Physics  Chemistry");
                    for(int i = 0; i < marks.length; i++)
                    {
                        System.out.print("    " + (i+1) + "      -\t");
                        for(int j = 0; j < marks[i].length; j++)
                        {
                            System.out.print(marks[i][j]+"         ");
                        }
                        System.out.println(" ");
                    }
                }
                break;

                case 3:
                {
                    do 
                    {
                        System.out.println("Enter the subject ID to calculate the average");
                        System.out.println("Mathematics - 1");
                        System.out.println("Physics - 2");
                        System.out.println("Chemistry - 3");
                        SubjectID = input.nextInt();
                        if(SubjectID < 1 || SubjectID > 3)
                        {
                            System.out.println("Invalid subject ID. Please enter a number between 1 and 3.\n");
                        }
                    } 
                    while (SubjectID < 1 || SubjectID > 3);
                    
                    int total_s = 0;
                    for(int i = 0; i < marks.length; i++)
                    {
                        total_s = total_s + marks[i][SubjectID]; 
                    }
                    int average_s = total_s / marks.length;

                    StringBuilder AverageSub = new StringBuilder();
                    AverageSub.append("\nAverage marks for the selected subject is ");
                    AverageSub.append(average_s);
                    AverageSub.append(".\n");
                    String AverageSubMsg = AverageSub.toString();
                    System.out.println(AverageSubMsg);
                }
                break;

                case 4:
                {
                    do  
                    {
                        System.out.print("Enter the student ID number: ");
                        studentID = input.nextInt();
                        if(studentID < 1 || studentID > StudentNo)
                        {
                            System.out.println("Invalid student ID. Please enter a number between 1 and " + StudentNo + ".");
                        }
                    } while (studentID < 1 || studentID > StudentNo);

                    int Total_m = 0;
                    Total_m = marks[studentID - 1][0] + marks[studentID - 1][1] + marks[studentID - 1][2];
                    int average_m = Total_m / 3;

                    StringBuilder Average = new StringBuilder();
                    Average.append("\nAverage mark of the selected student is");
                    Average.append(" ");
                    Average.append(average_m);
                    Average.append(".\n");
                    String AverageMsg = Average.toString();

                    System.out.println(AverageMsg);
                }
                break;

                case 5:
                {
                    do  
                    {
                        System.out.print("Enter the student ID number: ");
                        studentID = input.nextInt();
                        if(studentID < 1 || studentID > StudentNo)
                        {
                            System.out.println("Invalid student ID. Please enter a number between 1 and " + StudentNo + ".");
                        }
                    } while (studentID < 1 || studentID > StudentNo);

                    int total_m = 0;
                    total_m = marks[studentID - 1][0] + marks[studentID - 1][1] + marks[studentID - 1][2];

                    StringBuilder TotalMark = new StringBuilder();
                    TotalMark.append("\nTotal mark of the selected student is ");
                    TotalMark.append(total_m);
                    TotalMark.append(".\n");
                    String TotalMarks = TotalMark.toString();

                    System.out.println(TotalMarks);
                }
                break;

                case 6:
                    System.out.println("Exiting...");
                    input.close();
                return;
                
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    public static int menu(Scanner input) {
        String menuTitle = "Select the command to be executed";
        String option1 = "1. Add student marks";
        String option2 = "2. Update student marks";
        String option3 = "3. Calculate the average for a subject";
        String option4 = "4. Calculate the average of a student";
        String option5 = "5. Calculate the total mark of a student";
        String option6 = "6. Exit";

        System.out.println(menuTitle);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
        System.out.println(option5);
        System.out.println(option6);

        System.out.print("Enter the command number: ");
        return input.nextInt();
    }
}

