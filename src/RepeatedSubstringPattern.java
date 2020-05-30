public class RepeatedSubstringPattern {
    public static void main(String[] args) {

        System.out.println(repeatedSubStringPatterns("abab"));
        //String aaa = "bcdbcdbcdbcd";
        //System.out.println(aaa.substring(1, aaa.length()-1));
    }
    public static boolean repeatedSubStringPatterns(String s) {
        String s1 = s + s;
        System.out.println("S1 is: " + s1);
        String newSubStr = s1.substring(1, s1.length() - 1);
        System.out.println("New Sting is: " + newSubStr);
        return newSubStr.contains(s);
    }
}
