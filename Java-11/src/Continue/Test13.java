package Continue;

public class Test13 {
    public static void main(String[] args) {
        String[][] s= {{"A","B"},{"C","D"}};
        for (int i=0; i<s.length; i++){
            for (int j=s[i].length-1; j>=0; j--){
                System.out.println(s[i][j]);
            }
        }
    }
}
