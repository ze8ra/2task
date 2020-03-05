public class Circle1 {
    public static int count;
    public Circle1(){
        count++;
    }
    public static void main(String[] args) {
        for (int i = 1; i<5; i++){
            new Circle();
        }
        System.out.println(count);
    }
}
