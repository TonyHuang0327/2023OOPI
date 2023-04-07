public class snow extends human{
    boolean ice;
    snow(String str,double a,double b,double c,String sex,boolean ice){
        super(str, a, b, c, sex);
        this.ice = ice;
    }
    void show(){
        System.out.printf("名稱為:%s\n",name);
        System.out.printf("高度為:%f\n",height);
        System.out.printf("體重為:%f\n",weight);
        System.out.printf("速度為:%f\n",speed);
        System.out.printf("性別為:%s\n",sex);
        System.out.printf("冰凍能力值為:%s\n",ice);
    }
    double distance(int x,double y){
        double distance;
        if(y==0){
            distance = x*speed*2; 
        }
        else{
            distance = x*y*speed*2;
        }
        return distance;
    }
}