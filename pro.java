import java.util.Scanner;
public class pro {
    public static void main(String[] args){
        //student grade management System

        Scanner obj=new Scanner(System.in);

        System.out.println(" Enter the name of the student: ");
        String name=obj.nextLine();

        System.out.println("Enter the marks for subject 1: ");
        double s1=obj.nextDouble();

        System.out.println("Enter the marks for subject 1: ");
        double s2=obj.nextDouble();

        System.out.println("Enter the marks for subject 1: ");
        double s3=obj.nextDouble();

        double total=s1+s2+s3;
        double avg=total/3;

        String grade = Grade(avg);

        System.out.println("Student report : ");
        System.out.println("Name of the Student: "+name);
        System.out.println("marks of the Subject 1: "+s1);
        System.out.println("marks of the subject 2: "+s2);
        System.out.println("marks of the subject 3: "+s3);
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);


    }
 public static String Grade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 55) {
            return "D";
        } else if (avg >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}
