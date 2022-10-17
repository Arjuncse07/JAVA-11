package Continue;

public class Test9 {
    public static void main(String[] args) {
        String[] fruits={"Apple","Banana","Orange"};
        for (int i=0; i<fruits.length; i++){
            switch (fruits[i]){
                case "Apple":
                    System.out.println("Apple");
                    continue;
                case "Banana":
                    System.out.println("Banana");
                    i=i-1;
                    continue;
                case "Orange":
                    System.out.println("Orange");
                    i=i+1;
                    continue;
                default:
                    System.out.println("Fruits are injurious to Health");
            }

        }
    }
}
