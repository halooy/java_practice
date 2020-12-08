package practice;

/**
 * 矩形切割，长：2019  宽：324
 */
public class math {
    public static void main(String[] args){
        int lon = 2019;
        int wid = 324;
        int count = 1;
       for(int i=1; lon!=wid; i++){
           if(lon > wid){
               lon = lon - wid;
               count++;
           }else if(lon < wid){
               wid = wid -lon;
               count++;
           }
       }
        System.out.println(count);
    }
}
