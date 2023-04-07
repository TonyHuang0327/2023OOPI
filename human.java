public class human extends animal{
    String sex;
    human(String str,double a,double b,double c,String sex){
        super(str, a, b, c);
        this.sex = sex;
    }
    void show(){
        System.out.printf("名稱為:%s\n",name);
        System.out.printf("高度為:%f\n",height);
        System.out.printf("體重為:%f\n",weight);
        System.out.printf("速度為:%f\n",speed);
        System.out.printf("性別為:%s\n",sex);

    }
}