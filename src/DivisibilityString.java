public class DivisibilityString {
    public static void main(String[] args) {
        String a = "bcdbcdbcdbcd";
        String b = "bcdbcd";
        System.out.println(findSmallerDivisor(a, b));
    }

    public static int findSmallerDivisor(String s, String t) {
        int lenOfs = s.length(); //12
        int lenOft = t.length(); //6
        if(lenOfs % lenOft != 0){
            return -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i*lenOft < lenOfs; i++) {
            stringBuilder.append(t);
        }
        if(!(s.equals(stringBuilder.toString()))){
            return  -1;
        }
        for (int i = 1; i <= lenOft; i++) {
            String newStr = t.substring(0, i);
            stringBuilder = new StringBuilder();
            while(lenOft > stringBuilder.length()){
                stringBuilder.append(newStr);
            }
            if(t.equals(stringBuilder.toString())){
                return  i;
            }
        }
        return -1;
    }
}
