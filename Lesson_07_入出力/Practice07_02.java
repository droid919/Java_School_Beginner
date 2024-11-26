package Lesson_07_入出力;

import java.util.Scanner;

public class Practice07_02 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in, "Shift-JIS");

        System.out.print("野球選手名を入力してください ＞ ");
        String inputStr = sc.nextLine();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は「" + inputStr + "」です");

        sc.close();
    }
}
