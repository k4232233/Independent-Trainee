package asia.huiyi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static com.sun.activation.registries.LogSupport.log;

public class UserServiceProxy implements UserService {
    private static final Log log = LogFactory.getLog(UserServiceProxy.class);
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
