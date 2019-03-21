public class demo1 {
    /**
     *  求一个数值的整数次方
     *  1.如果 底数不为0   次方为正数  正常计算
     *  2.如果 底数不为0    次方为0    结果为0
     *
     *  3.如果底数等于0  且  次数小于0   在数学上无意义
     *
     *  4.如果底数不为0  次方为负数，那就是求它的正数次方  然后取倒数
     *  5，因为精度原因  不能用==来判断两个小数是否相等
     */
    public static double  powerWithExponent(double base,int exponent){
        double result = 0.0;
        //0 的负数次方无意义
        if(equal(base,0.0) && exponent<0){
            try {
                throw new Exception("0的负数次方无意义");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

       //任何数的0次方都为1
        if(exponent==0){
            return 1.0;
        }

        //指数小于0时
        if(exponent<0){
            result = pow(1.0/base, -exponent);
        }
        else{   //指数大于0时
            result = pow(base,exponent);
        }

        return result;
    }



    public static double pow(double base,int exponent){
        double result = 1.0;
        for(int i= 1;i<=exponent;i++){
            result *= base;
        }
        return result;
    }




    public static boolean equal(double m,double n){
        if((m-n)<0.000000001 &&(n-m)>0.00000001){
            return true;
        }else{
            return false;
        }
    }


}
