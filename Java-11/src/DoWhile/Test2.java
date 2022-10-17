package DoWhile;

public class Test2 {
    public static void main(String[] args) {
        String x="-";
        for(String s: args){
            System.out.print(s+x);
            x+=x;
        }
    }
}
