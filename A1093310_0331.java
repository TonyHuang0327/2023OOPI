import java.util.Scanner;
public  class A1093310_0331{
    public static void main(String[] args){
        animal.showinfo();
        int x;
        double y;
        animal snowbaby = new animal("雪寶",1.1,52,100);
        animal donkey = new animal("驢子",1.5,99,200);
        human anna = new human("安那",1.7,48,120,"女");
        snow elsa = new snow("愛沙",1.7,50,120,"女",true);
        human ake = new human("阿克",1.9,80,150,"男");
        human hans = new human("漢斯",1.8, 78, 130, "男");
        System.out.print("雪寶資訊\n");
        snowbaby.show();
        System.out.print("驢子資訊\n");
        donkey.show();
        System.out.print("安那資訊\n");
        anna.show();
        System.out.print("愛沙資訊\n");
        elsa.show();
        System.out.print("阿克資訊\n");
        ake.show();
        System.out.print("漢斯資訊\n");
        hans.show();
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

        System.out.printf("請輸入阿克奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入阿克加速度:");
        y = input.nextDouble();
        System.out.printf("阿克奔跑距離為:%f\n",ake.distance(x,y));

        System.out.printf("請輸入漢斯奔跑時間:");
        x = input.nextInt();
        System.out.printf("請輸入漢斯加速度:");
        y = input.nextDouble();
        System.out.printf("漢斯奔跑距離為:%f\n",hans.distance(x,y));
    }
}