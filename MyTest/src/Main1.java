import org.omg.CORBA.INTERNAL;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    public static String getResult(int M,int N,ArrayList<Integer> list){
        double result = -1;
        if(N>M){
            Collections.sort(list);//从小到大排序
            Collections.reverse(list);
            int i1 = list.get(M - 1).intValue();
            result =(double)i1;
        }
        if(N==M){
            Collections.sort(list);
            int i2 = list.get(0).intValue();
            result =  (double)i2;
        }
        if(N<M){
            Collections.sort(list);//从小到大排序
            Collections.reverse(list);
            //获得最长的
            int i3 = list.get(0).intValue();
            double d= (double)i3;
            double to = d/2;
            list.remove(0);
            //是否小于等于另外的绳子
            Collections.sort(list);
            if(to<=(double)((list.get(0)).intValue())){
                result =  to;
            }else{
                result =  (double)(list.get(0).intValue());
            }
        }
        DecimalFormat    df   = new DecimalFormat("######0.00");
        String format = df.format(result);
        return format;
    }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();   //有多少个绳子
                int m = sc.nextInt();
                int x = 0;
                ArrayList<Integer> list = new ArrayList<>();
                for(int j = 0; j < n; j++){
                    x = sc.nextInt();
                   list.add(x);
                }

                String result = getResult(m, n, list);
                System.out.println(result);

            }
        }


