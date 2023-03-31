import java.util.Scanner;
public  class A1093310_0324_1{
    public static void main(String[] args){
        int x;
        double y;
        animal snowbaby = new animal("雪寶",1.1,52,100);
        animal donkey = new animal("驢子",1.5,99,200);
        animal anna = new animal("安那",1.7,48,120);
        animal elsa = new animal("愛沙",1.7,50,120);
        System.out.print("雪寶資訊\n");
        snowbaby.show();
        System.out.print("驢子資訊\n");
        donkey.show();
        System.out.print("安那資訊\n");
        anna.show();
        System.out.print("愛沙資訊\n");
        elsa.show();
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入雪寶奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入雪寶加速度:");
        y = input.nextDouble();
        System.out.printf("雪寶奔跑距離為:%f\n",snowbaby.distance(x,y));

        System.out.printf("請輸入驢子奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入驢子加速度:");
        y = input.nextDouble();
        System.out.printf("驢子奔跑距離為:%f\n",donkey.distance(x,y));

        System.out.printf("請輸入安那奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入安那加速度:");
        y = input.nextDouble();
        System.out.printf("安那奔跑距離為:%f\n",anna.distance(x,y));

        System.out.printf("請輸入愛沙奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入愛沙加速度:");
        y = input.nextDouble();
        System.out.printf("愛沙奔跑距離為:%f\n",elsa.distance(x,y));
    }
}