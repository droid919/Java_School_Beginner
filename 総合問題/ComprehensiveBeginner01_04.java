//import java.util.Scanner;
public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        System.out.print("何段>");
        int inputNum = new java.util.Scanner(System.in).nextInt();
        
        // 2. 終了させるための処理を書く
        if(inputNum < 1 || inputNum > 5){
            System.out.print(" 1 ~ 5 までの整数を入力してください");
            System.exit(0);
        }
            
        // 3. の処理を書く
        for(int i = 1; i <= inputNum; i++){
            for(int j = inputNum; j > 0; j--){
                if (j > i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                
            }
            System.out.println("");
        }
    }
}