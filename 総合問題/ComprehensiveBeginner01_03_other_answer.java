import java.util.Random;

public class ComprehensiveBeginner01_03_other_answer {
    public static void main(String[] args) {
        //宣言
        Random rand = new Random();
        int man = rand.nextInt(3) + 1;
        int woman = rand.nextInt(3) + 1;
        int child = rand.nextInt(3) + 1;
        
        //テスト
        // System.out.println("man = " + man);
        // System.out.println("woman = " + woman);
        // System.out.println("child = " + child);
        
        //実行
        if ((man + woman + child) % 3 == 0){
            System.out.println("あいこです");
        }else if(man == woman){
            if(man - child == 1 || (man == 1 && child == 3)){
                System.out.println("manとwomanが勝ちました");
            }else{
                System.out.println("childが勝ちました");
            }
        }else if(man == child){
            if(man - woman == 1 || (man == 1 && woman == 3)){
                System.out.println("manとchildが勝ちました");
            }else{
                System.out.println("womanが勝ちました");
            }
        }else if(woman == child){
            if(woman - man == 1 || (woman == 1 && man == 3)){
                System.out.println("womanとchildが勝ちました");
            }else{
                System.out.println("manが勝ちました");
            }
        }
    }
}