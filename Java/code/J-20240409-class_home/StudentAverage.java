package StudentAverage;
import java.io.IOException;
import java.util.Scanner;
class Student{
    int age;
}
class Age{
    public int avg_Age(Student[] st){
        int average = 0;
        int all = 0;
        int count = 0;
        for(int i = 0; i < st.length; i++){
            all += st[i].age;
            count++; 
        }
        average = all / count;
        return average;
    }
}

public class StudentAverage{
    public static void main(String[] args)throws IOException{
        Student[] stu = new Student[3];

        Age test = new Age();
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++){
            System.out.print("Enter No."+(i+1)+" Age ");
            stu[i] = new Student();
            stu[i].age = input.nextInt();
        }
        int average = test.avg_Age(stu);
        System.out.println("The Average is "+average);
		input.close();
    }
}