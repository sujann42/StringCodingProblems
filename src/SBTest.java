public class SBTest {
    public static void main(String[] args) {
        String a = "bcdbcdbcdbcd";
        String b = "bcdbcd";
       sbbbtest(a, b);
    }
    public static void sbbbtest(String s, String t) {
        int lenOfs = s.length();
        int lenOft = t.length();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i*lenOft < lenOfs; i++) {
            stringBuilder.append(t);
        }

        System.out.println(stringBuilder.toString());

    }
}
