package practice;

public class test03 {
    public static void main(String[] args){
        father f = new father();
        f.flag = 1;
        f.age = 49;
    }
}
class father{
    int age;
    int flag;
    public father(){

    }
    public father(int age, int flag){
        this.age = age;
        this.flag = flag;
    }
}
