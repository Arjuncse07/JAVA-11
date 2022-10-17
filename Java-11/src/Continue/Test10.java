package Continue;

public class Test10 {
    public static void main(String[] args) {
        for (int i=10; i>0; i++){
            System.out.println(i);
            i=i-3;
            if (i==1){
                break;
            }
        }
        System.out.println("Out from for-loop");
    }
}
