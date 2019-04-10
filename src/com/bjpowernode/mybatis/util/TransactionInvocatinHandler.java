package com.bjpowernode.mybatis.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocatinHandler implements InvocationHandler {
    private Object target;

    public TransactionInvocatinHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;

        try{
            session = SqlSessionUtil.getSessin();

            //执行业务层业务逻辑
            obj = method.invoke(target, args);

            SqlSessionUtil.myCommit(session);

        }catch (Exception e){

            SqlSessionUtil.myRollback(session);

            e.printStackTrace();
        }finally{

            SqlSessionUtil.myClose(session);

        }

        return obj;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
