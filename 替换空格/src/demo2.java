public class demo2 {
    public static String replaceSstring(String str){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals(" ")){
                stringBuffer.append("%%%");
            }else{
                stringBuffer.append(String.valueOf(str.charAt(i)));
            }
        }
        return String.valueOf(stringBuffer);
    }


    public static void main(String[] args) {
        String we_are_happy = demo2.replaceSstring("we are happy");
        System.out.println(we_are_happy);
    }
}
