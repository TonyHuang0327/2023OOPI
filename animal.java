public class animal{
    String  name;
    double height,weight,speed;
    animal(String str,double a,double b,double c){
        this.name = str;
        this.height = a;
        this.weight = b;
        this.speed = c;
    }
    void show(){
        System.out.printf("名稱為:%s\n",name);
        System.out.printf("高度為:%f\n",height);
        System.out.printf("體重為:%f\n",weight);
        System.out.printf("速度為:%f\n",speed);
    }
    double distance(int x,double y){
        double distance;
        if(y==0){
            distance = x*speed; 
        }
        else{
            distance = x*y*speed;
        }
        return distance;
    }
    static void showinfo(){
        System.out.printf("歡迎進入冰雪奇緣系統!\n");
    }
}