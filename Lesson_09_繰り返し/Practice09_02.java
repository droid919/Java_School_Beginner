
public class Practice09_02 {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2}, {3, 4, 5}};
        
        System.out.print("int arr[][] = {{");
        
        for (int i = 0; i <= arr[0].length - 1; i++) {
            if (i == arr[0].length - 1){
                System.out.print(arr[0][i]);
            }else{
                System.out.print(arr[0][i] + ",");
            }
        }
        
        System.out.print("}, {");
        
        for (int j = 0; j <= arr[1].length - 1; j++) {
            if (j == arr[1].length - 1){
                System.out.print(arr[1][j]);
            }else{
                System.out.print(arr[1][j] + ",");
            }
        }
        System.out.print("}};");
    }
}