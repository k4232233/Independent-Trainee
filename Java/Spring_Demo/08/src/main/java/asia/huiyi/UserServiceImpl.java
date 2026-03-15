package asia.huiyi;

//真实对象，完成增删改查操作的人
//需求：增加一个日志功能（不改变原来业务的情况下，代理）
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");

    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户");

    }
}
