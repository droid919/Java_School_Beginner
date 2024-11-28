package Lesson_08_条件分岐;

import java.util.Random;

public class Practice08_03 {
    public static void main(String[] args) { 

        Random rand = new Random();
        int age = rand.nextInt(21);

        if (age <= 3) {
            System.out.print("あなたはbabyな");
        } else if(age > 3 && age < 6) {
            System.out.print("あなたはchildな");
        } else if(age >= 6 && age < 18) {
            System.out.print("あなたはkidな");
        } else {
            System.out.print("あなたはadultな");
        }

        int gender = rand.nextInt(2);

        if ( gender == 0){
            System.err.println("男です");
        } else {
            System.err.println("女です");
        }

    }

}