public class sumofnaturalnumber{
    static int sumnaturalnumbers(int n){
        if(n<=1){
            return 1;
        }else{
            return n+sumnaturalnumbers(n-1);
        }
    }
    public static void main(String[]args){
        int number=10;
        int result=sumnaturalnumbers(number);
        System.out.println("sum of first"+number+"naturalnumber is"+result);
    }
}
