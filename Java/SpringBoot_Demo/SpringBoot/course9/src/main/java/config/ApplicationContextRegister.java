package config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * 定义一个注册器策略类,方便后续加载资源文件
 *
 * ApplicationContextAware是Spring框架提供的接口,也叫做spring上下文的增强器,在项目启动时执行,会被spring处理
 * 当一个bean实现了该接口,通过setApplicationContext方法可以直接获取spring容器中的所有bean
 */
@Component
public class ApplicationContextRegister implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        /**
         * Spring容器启动时，会回调setApplicationContext方法，并传入ApplicationContext对象，之后就可对该对象进行操作。（例如获取spring容器中的所有bean）
         *
         * @throws BeansException
         */
        this.applicationContext = applicationContext;
    }

    //提供一个方法用于加载sql脚本文件

    public Resource getResource (String url){
        return this.applicationContext.getResource(url);
    }
}
