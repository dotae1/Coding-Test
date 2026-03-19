package coding.test.codingtest.hard;

import java.util.Objects;
import java.util.Scanner;

public class BJ25206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double avg = 0;
        double sum = 0;

        for(int i=0; i <20; i++) {
            String name = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();
            if(!grade.equals("P")) {
                sum += score;
            }

            switch (grade) {
                case "A+": avg +=score*4.5;break;
                case "A0": avg +=score*4.0;break;
                case "B+": avg +=score*3.5;break;
                case "B0": avg +=score*3.0;break;
                case "C+": avg +=score*2.5;break;
                case "C0": avg +=score*2.0;break;
                case "D+": avg +=score*1.5;break;
                case "D0": avg +=score*1.0;break;
                case "F": avg +=score*0.0;break;
                case "P": break;
            }

        }
        double result = avg/sum;
        System.out.println(result);

    }
}
