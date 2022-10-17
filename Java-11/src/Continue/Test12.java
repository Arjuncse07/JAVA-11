package Continue;

public class Test12 {
    public static void main(String[] args) {
String[][] s= {{"A","B"},{"C","D"}};
for (int i=s.length-1; i>=0; i--){
    for (int j=0; j<s[i].length; j++){
        System.out.println(s[i][j]);
    }
}
    }
}
