package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {

    public static Skill getProxy(Object obj){
        /**
         *         (ClassLoader loader,
         *         Class<?>[] interfaces,
         *          InvocationHandler h) {
         *         Objects.requireNonNull(h);
         */
        return (Skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("艺人接受表演!");

                        Object skill = method.invoke(obj, args);
                        System.out.println("艺人演出完成!");
                        return skill;
                    }
                });
    }
}
