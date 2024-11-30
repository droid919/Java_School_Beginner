public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.err.println("foobar");
            }else if(i % 3 == 0){
                System.err.println("foo");
            }else if(i % 5 == 0){
                System.err.println("bar");
            }else {
                System.err.println(i);
            }

        }
    }
}
