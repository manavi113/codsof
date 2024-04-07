 import java.util.*;
 class Studgrade {
    int maths;
    int evs;
    int eng;
    int hindi;
    int socialsci;
     double avgpercent;
    //  calculating total marks by adding marks of each subject
    int totalmarks(int maths, int evs, int eng, int hindi, int socialsci){

        int result = maths+evs+eng+hindi+socialsci;
        return result;

    }
    // calculating average percentage 
    double percentage(int maths, int evs, int eng, int hindi, int socialsci){

        double avgpercent = (double)(maths+evs+eng+hindi+socialsci)/(5);
        return avgpercent;
    }
    // alloting grades according to the percentage obtained
    void gradecalculate(double avgpercent){
        if (avgpercent < 30.0){
            System.out.println("Grade obtained is 'F'");
        } else if(avgpercent>=30.0 && avgpercent < 50.0){
          System.out.println("Grade obtained is 'E'");
        } else if(avgpercent >= 50.0 && avgpercent <60.0 ){
            System.out.println("Grade obtained is 'D'");
        } else if(avgpercent >=60.0 && avgpercent <70.0){
            System.out.println("Grade obtained is 'C'");
        } else if(avgpercent >=70.0 && avgpercent <80.0){
              System.out.println("Grade obtained is 'B'");
        } else if(avgpercent >=80.0 && avgpercent <90.0){
            System.out.println("Grade obtained is 'A'");
        } else if(avgpercent >=90.0 && avgpercent <=100.0){
            System.out.println("Grade obtained is 'A +'");
        }

    }

    

public static void main(String[] args){
    // creating an object named child1
    Studgrade child1 = new Studgrade();  
    Scanner sc = new Scanner(System.in);
    // Taking input from the user - marks obtained in each subject
    System.out.println("Enter the marks in maths out of 100");
    int m = sc.nextInt();
    System.out.println("Enter the marks in evs out of 100");
    int e = sc.nextInt();
    System.out.println("Enter the marks in english out of 100");
    int en = sc.nextInt();
    System.out.println("Enter the marks in hindi out of 100");
   int h = sc.nextInt();
   System.out.println("Enter the marks in socialscience out of 100");
   int ss = sc.nextInt();
//    now showing total marks obtained to the user
   int marksobtained = child1.totalmarks(m,e,en,h,ss);
   System.out.println("Total marks obtained by student: " +  marksobtained);
//    showing average percentage obtained to the user
   double percentobtained = child1.percentage(m,e,en,h,ss);
   System.out.println("Percentage obtained: " + percentobtained);
//    showing grades according to the percentage obtained
    child1.gradecalculate(percentobtained);

    
}
}