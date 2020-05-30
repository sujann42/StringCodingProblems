public class Concatenation {
    public static void main(String[] args) {
        String s1 = "bcdbcdbcdbcd", t1 = "bcdbcd";
        String s2 = "bcdbcdbcd", t2 = "bcdbcd";
        String s3 = "lrbb", t3 = "lrbb";
        String s4 = "rbrb", t4 = "rbrb";
        System.out.println(getLength(s1, t1));
        System.out.println(getLength(s2, t2));
        System.out.println(getLength(s3, t3));
        System.out.println(getLength(s4, t4));
        System.out.println(findSmallestDivisor(s1, t1));
        System.out.println(findSmallestDivisor(s4, t4));
    }

    private static int getLength(String s, String t) {
        if(s.length() % t.length() > 0)
            return -1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i*t.length() < s.length();i++) {
            sb.append(t);
        }
        if(!sb.toString().equals(s))
            return -1;
        for(int i=1;i<=t.length();i++) {
            sb = new StringBuilder();
            String subStr = t.substring(0, i);
            while(sb.length() < t.length()) {
                sb.append(subStr);
            }
            if(sb.toString().equals(t))
                return i;
        }
        return -1;
    }

    public static int findSmallestDivisor(String s, String t) {

        int count = 0;
        int lenOfs = s.length();
        int lenOft = t.length();
        if(lenOfs % lenOft != 0){
            count = -1;
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i*lenOft < lenOfs; i++) {
            stringBuilder1.append(t);
        }
        if(!s.equals(stringBuilder1.toString())){
            count = -1;
        }
        for (int i = 1; i < lenOft; i++) {
            String newStr = t.substring(0, i);
            StringBuilder stringBuilder2 = new StringBuilder();
            while(lenOft > stringBuilder2.length()){
                stringBuilder2.append(newStr);
            }
            if(stringBuilder2.toString().equals(t)){
                count = i;
            }else{
                count = -1;
            }
        }
        return count;
    }
}
