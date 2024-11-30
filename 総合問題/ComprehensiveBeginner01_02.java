import java.util.Random;
import java.util.ArrayList;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        //宣言
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        
        //実行    
        for (int i = 0; i < 10; i++){
            int num = rand.nextInt(100) + 1;
            arr.add(num);
            sum = sum + num;
            if (sum > 100){
                break;
            }
        }
        
        for (int i = 0; i < arr.size(); i++){
            System.out.println((i + 1) + "番目 : " + arr.get(i));
        }
        System.out.println("合計値 : " + sum);
        
    }
}