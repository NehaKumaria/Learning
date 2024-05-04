package CoreJava;

public class StudentMarks {

   void Grade()
    {
        int Avg;
        int math = 90;
        int eng= 80;
        int hindi=70;
        int comp =60;
        int science=50;

        Avg = (math + eng + hindi + comp + science) / 5;
        if (Avg>=90)
        {
            System.out.println("The Grade is A+");

        }
        else if(Avg>=80 && Avg<90)
        {
            System.out.println("The Grade is A");
        }
        else if(Avg>=70 && Avg<80)
        {
            System.out.println("The Grade is B+");
        }
        else if(Avg>= 60 && Avg<70)
        {
            System.out.println("The Grade is B");
        }
        else if(Avg>=50 && Avg <60)
        {
            System.out.println("The Grade is C+");
        }
        else if(Avg>=40 && Avg<50)
        {
            System.out.println("The Grade is C");
        }
        else {System.out.println("The Student is Fail");}
    }
 public static void main(String[] strs)
    {
        StudentMarks sm = new StudentMarks();
        sm.Grade();
    }
}
