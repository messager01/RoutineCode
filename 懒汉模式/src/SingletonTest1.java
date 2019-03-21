public class SingletonTest1 {
    //先声明一个对象
    private static SingletonTest1 singletonTest1;
    //提供供外界调用对象的方法
    public static SingletonTest1 getSingletonTest1(){
        if(null == singletonTest1){
            SingletonTest1 singletonTest1 = new SingletonTest1();
        }
        return  singletonTest1;
    }
    //私有化构造器
    private SingletonTest1(){

    }
}
