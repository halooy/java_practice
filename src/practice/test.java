package practice;

/**
 * 随机数的排序输出
 */
public class test{
    public static void main(String[] args) {
        arrToString st = new arrToString();
        st.arrToStr();
        st.arrValue();
    }
}

class arrToString{
    public int[] setArr(){
        int[] arr = new int[100];
           for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
           for(int i=0; i<arr.length-1; i++){
               for(int j=0; j<arr.length-i-1; j++){
                   if(arr[j] > arr[j+1]){
                       int temp = arr[j+1];
                       arr[j+1] = arr[j];
                       arr[j] = temp;
                   }
               }
           }
        return arr;
    }
    public void arrToStr(){
        int[] arr = this.setArr();
        String str = "";
        int flag = 0;
        for(int i=0; i<arr.length; i++){
            str += arr[i] + "\t";
            flag++;
            if(flag % 5 == 0)
                str += "\n";
        }
        System.out.println(str);
    }
    public void arrValue(){
        int[] arr = this.setArr();
        System.out.println("最小数为："+arr[0]);
        System.out.println("最大数为："+arr[arr.length-1]);
    }
}
