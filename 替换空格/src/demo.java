public class demo {
    public String replace(String  str){
        if (str == null){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i < str.length();i++){
            //将字符charAt(i)转成String
            if(String.valueOf(str.charAt(i)).equals(" ")){
                stringBuffer.append("%20");
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        //将stringBuffer转成String返回
        return String.valueOf(stringBuffer);
    }
}
