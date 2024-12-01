import java.util.Scanner;
import java.util.ArrayList;

public class ComprehensiveBeginner01_01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Shift-JIS");
        ArrayList<Integer> arrint = new ArrayList<>();
        
        System.out.print("整数を入力してください。複数の整数があれば、数字と数字の間に「,」を入れてください。(例:12,5,60)<");
        String inputStr = sc.nextLine();
        
        String[] s = inputStr.split(",");
        
        for (int i = 0; i < s.length; i++){
            arrint.add(Integer.parseInt(s[i]));
        }

        for (int i = 0; i < arrint.size(); i++){
            System.out.println(
                i + 1 + "番目の要素の値は" + arrint.get(i) + 
            "で、2倍にすると" + arrint.get(i) * 2 + 
            "になり、3 で割ったあまりは" +
             arrint.get(i) % 3 + "です");
        }
    }
}