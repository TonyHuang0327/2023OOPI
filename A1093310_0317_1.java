import java.util.Scanner;
public class A1093310_0317_1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.print("請輸入m值:");
        m = input.nextInt();
        System.out.print("請輸入n值:");
        n = input.nextInt();
        int array[][] = new int [m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                array[i][j]=(i+1)*(j+1);
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(array[i][j]+"\t");
                if(j==n-1){
                    System.out.print("\n");
                }
            }
        }
    }
}