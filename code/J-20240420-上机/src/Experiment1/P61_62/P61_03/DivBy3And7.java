package Experiment1.P61_62.P61_03;

public class DivBy3And7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 ==0 && i % 7 == 0)
                System.out.print(i+"\t");
        }
    }
}
