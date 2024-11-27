package Lesson_08_条件分岐;

import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) { 

        Random rand = new Random();
        int gender = rand.nextInt(2);

        if ( gender == 0){
            System.err.println("あなたは 男 です");
        } else {
            System.err.println("あなたは 女 です");
        }

        

    }

}