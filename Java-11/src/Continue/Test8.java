package Continue;

public class Test8 {
    public static void main(String[] args) {
        final int i=10;
        for (int j=0; j<3; j++){
            if(i==10){
                break;
            }
            System.out.println("Hi");
        }
        System.out.println("Hello");
    }
}
