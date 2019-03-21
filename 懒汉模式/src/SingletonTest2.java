public class SingletonTest2 {
    //声明对象
    private static SingletonTest2 singletonTest2;
    //提供供外界访问的方法    加锁   线程安全
    public static  synchronized SingletonTest2 getSingletonTest2(){
        if(null == singletonTest2){
            SingletonTest2 singletonTest2 = new SingletonTest2();
        }
        return singletonTest2;
    }
    //私有化构造器
    private SingletonTest2(){

    }
}
