public class HungerSingletonTest {
   //1.实例化一个对象
    private  static HungerSingletonTest instance =  new HungerSingletonTest();
    //私有化构造器
    private HungerSingletonTest(){

    }
    //提供外界访问的方法
    public static HungerSingletonTest getInstance(){
        return instance;
    }
}
