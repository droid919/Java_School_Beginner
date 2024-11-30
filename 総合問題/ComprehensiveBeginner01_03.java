import java.util.Random;

public class ComprehensiveBeginner01_03 {
    //勝敗(player1が勝ったらtrue, あいこorまけたらfalse)
    public static Boolean issue(int player1, int player2) {
        if (player1 == 1 && player2 == 3){
            return true;
        }else if(player1 == 2 && player2 == 1) {
            return true;
        }else if(player1 == 3 && player2 == 2){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        //宣言
        Random rand = new Random();
        int man = rand.nextInt(3) + 1;
        int woman = rand.nextInt(3) + 1;
        int child = rand.nextInt(3) + 1;
        
        //テスト
        //System.out.println("man = " + man);
        //System.out.println("woman = " + woman);
        //System.out.println("child = " + child);
        
        //実行
        if ((man == 1 && woman == 2 && child == 3) ||
            (man == 2 && woman == 3 && child == 1) ||
            (man == 3 && woman == 1 && child == 2) ||
            (man == woman && man == child && woman == child)){
            System.out.println("あいこです");
                
        }else if(issue(man ,woman)){
            if(man == child){//wanとchildがあいこかどうか
                System.out.println("manとchildが勝ちました");
            }else{
                System.out.println("manが勝ちました");
            }
        
        }else if(man == woman){//wanとwomanがあいこかどうか
            if(issue(man ,child)){
                System.out.println("manとwomanが勝ちました");
            }else{
                System.out.println("childが勝ちました");
            }
        
        }else if(woman == child){//wowanとchildがあいこかどうか
            System.out.println("womanとchildが勝ちました");
        }else{
            System.out.println("womanが勝ちました");
        }
        
    }
}