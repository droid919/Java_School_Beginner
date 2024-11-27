package Lesson_08_条件分岐;

import java.util.Random;

public class Practice08_02 {
    public static void main(String[] args) { 

        Random rand = new Random();
        int age = rand.nextInt(21);

        if (age <= 3) {
            System.out.println("あなたはbabyです");
        } else if(age > 3 && age < 18) {
            System.out.println("あなたはkidです");
        } else {
            System.out.println("あなたはadultです");
        }

        

    }

}