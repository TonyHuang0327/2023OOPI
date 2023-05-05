import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class A1093310_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入日期（YYYY/MM/DD或MM/DD/YYYY格式）：");
        String input = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy/MM/dd][MM/dd/yyyy]");
        
        LocalDate date = LocalDate.parse(input, formatter);
        
        System.out.println("您輸入的日期為：" + date);
    }
}