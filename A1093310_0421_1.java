import java.util.Scanner;
public class A1093310_0421_1{
    public static void main(String args[]){
        String email;
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入電子信箱:");
        email = input.nextLine();
        if(emailFormat(email)==true){
            System.out.println("電子信箱格式正確");
        }else{
            System.out.println("電子信箱格式錯誤");
        }

    }
    public static boolean emailFormat(String email){
        String test = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
        return email.matches(test);
    }
}