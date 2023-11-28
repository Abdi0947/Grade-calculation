
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// GRADE CALCULATION IT ACCEPTS FROM 100% AND CALULATE THE GRADE AND THE GPA,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        String result;
        ArrayList<String> arr = new ArrayList();
        Scanner scanner= new Scanner(System.in);
        System.out.println("****HELLO******");
        System.out.println("WEL COME TO CALCULATE GRADE PLEASE ENTER YOUR MARK\n" +
                "\n" +
                "PLEASE ENTER YOUR MARK OUT OF 100%.");
        System.out.print("ENTER YOUR OBJECT ORIENTED MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        System.out.print("ENTER YOUR STATISTIC MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        System.out.print("ENTER YOUR COMPUTER ORGANIZATION MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        System.out.print("ENTER YOUR OPERATING SYSTEM MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        System.out.print("ENTER YOUR NETWORKING MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        System.out.print("ENTER YOUR DATA STRUCTURE MARK: ");
        result=scanner.nextLine();
        arr.add(result);
        Grade(arr);
    }
    private static void CGPA(ArrayList<String> v ) {
         System.out.print("========YOUR GRADE IS ======\n");
         System.out.println("|Course----------------------------------------|ECTS|-----------|cr.hr.|---------|Grade");
         System.out.println("|OBJECT ORIENTED..............................| 5  |...........|  3   |.........|" + v.get(0));
         System.out.println("|STATISTIC GRADE..............................| 5  |...........|  3   |.........|" + v.get(1));
         System.out.println("|COMPUTER ORGANIZATION........................| 5  |...........|  3   |.........|" + v.get(2));
         System.out.println("|OPERATING SYSTEM.............................| 7  |...........|  4   |.........|" + v.get(3));
         System.out.println("|NETWORKING...................................| 7  |...........|  4   |.........|" + v.get(4));
         System.out.println("|DATA STRUCTURE...............................| 5  |...........|  3   |.........|" + v.get(5));
         System.out.println(" ");
     }
     private static void studentResult(ArrayList<Double>  o ) {
        Double Total=3*o.get(0)+3*o.get(1)+3*o.get(2)+4*o.get(3)+4*o.get(4)+3*o.get(5);
        int credit_hour=20;
        Double StudentCGPA=Total/credit_hour;
         System.out.println("**$$$**$$**YOUR GPA OUT OF  4 IS = "+StudentCGPA);


     }

    public static void Grade(ArrayList<String> a) {
        ArrayList<String> GPA = new ArrayList();
        ArrayList<Double> values = new ArrayList();
        String grade;
        double gpa;
        for(int i=0; i<6; i++) {
            String m = (a.get(i));
            Double value = Double.parseDouble(m);
            if (value >= 90) {
                grade = "A+";
                gpa=4;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 85) {
                grade = "A";
                gpa=4;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 80) {
                grade = "A-";
                gpa=3.75;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 75) {
                grade = "B+";
                gpa=3.5;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 70) {
                grade = "B";
                gpa=3.25;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 65) {
                grade = "B-";
                gpa=3;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 60) {
                grade = "C+";
                gpa=2.75;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 55) {
                grade = "C";
                gpa=2.5;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 50) {
                grade = "C-";
                gpa=2;
                GPA.add(grade);
                values.add(gpa);
            } else if (value >= 40) {
                grade = "D";
                gpa=1;
                GPA.add(grade);
                values.add(gpa);
            } else {
                grade = "F";
                GPA.add(grade);
                gpa=0;
                values.add(gpa);
            }
        }
        CGPA(GPA);
        studentResult(values);}}


