 import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
           /* Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = 0, x;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    x = sc.nextInt();
                    ans += x;
                }
            }
            System.out.println(ans);*/
            boolean a = isFalse("hello");
            System.out.println(a);
        }


        public static String getString(String str){
            StringBuffer bf = new StringBuffer(str);
            for(int i =1;i<bf.length()-1;i++){
                if(isFalse(bf.toString())){
                    bf.deleteCharAt(i);
                }
            }
            return bf.toString();
        }

        public static boolean isFalse(String str){
            StringBuffer bf = new StringBuffer(str);
            for(int i =1;i<bf.length()-1;i++){
                if(bf.charAt(i)==bf.charAt(i-1)&&bf.charAt(i)==bf.charAt(i+1)){
                  return true;
                }
            }
            return false;
        }
    }

