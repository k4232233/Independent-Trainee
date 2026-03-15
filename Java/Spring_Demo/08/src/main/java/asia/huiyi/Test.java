package asia.huiyi;

//用户对象
public class Test {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //真是业务
        proxy.setUserService(userService);
        proxy.add();

    }
}



/*
* 代理的思想：我们在不改变原来的代码的情况下，实现了对原有功能的增强，这是AOP中最核心的思想
* */