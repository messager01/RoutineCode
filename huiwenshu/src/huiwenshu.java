public class huiwenshu {

    public static void main(String[] args) {
        int count = getCount("abc", "cba");
        System.out.println(count);
        System.out.println("是否回文数？"+getResult("cbaabc"));
    }

    public static boolean getResult(String str) {
        int length = str.length();
        boolean flag = true;
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int getCount(String str1, String str2) {
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        int count = 0;
        for(int i =0;i<=sb1.length();i++) {
            System.out.println(sb1.insert(i, sb2).toString());
            String str = sb1.insert(i, sb2).toString();
            //System.out.println(str);
            if(getResult(str)==true) {
                count++;
            }
            sb1 = new StringBuffer(str1);
        }
        return count;
    }
}
