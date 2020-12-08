package practice;
/**
 一百元买一百只鸡
 公鸡5元一只
 母鸡3元一只
 小鸡一元三只
 穷举算法
 */

public class test02 {
    public static void main(String[] args){
        int cock, hen, chick;
        int money;
        int num;
        for(cock=0; cock<=100; cock++){
            for(hen=0; hen<=100; hen++){
                for(chick=0; chick<=100; chick++){
                    money = 5*cock + 3*hen + chick/3;
                    num = cock+hen+chick;
                    if(money==100 && num==100 && chick%3==0){
                        System.out.println("cock:"+cock+"\then:"+hen+"\tchick:"+chick);
                    }
                }
            }
        }
    }
}
