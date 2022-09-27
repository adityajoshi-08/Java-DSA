public class ReverseAString {
    static void reverseString(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(str.length()-i-1);
            ans.append(temp);
        }
        System.out.println(ans);
    }




    public static void main(String[] args) {
        reverseString("Aditya");
    }
}
