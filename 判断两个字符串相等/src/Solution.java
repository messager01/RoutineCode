 public class Solution {
        public static String isTrue(String str1,String str2) {
            int flag = 0;
            if(str1.length()==str2.length()) {
                for(int i = 0;i<str1.length();i++) {
                    if(str1.charAt(i)==str2.charAt(i)) {
                        flag++;
                    }
                }
                if(flag==str1.length()) {
                    return "Login Success!";
                }else {
                    return "Login Fail!";
                }
            }
            return "Login Fail!";
        }
        public static void main(String[] args) {
            String result = isTrue("admin","ad");
            System.out.println(result);
        }
    }

