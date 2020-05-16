public class ceshi {
    public static void main(String[] args) {
        int a=10,b=6;
        System.out.println("a = "+a+",b ="+b);
        a-=b++;//a=a-b=b++
        System.out.println("a = "+a+",b ="+b);
    }
}
