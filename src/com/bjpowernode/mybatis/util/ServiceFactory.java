package com.bjpowernode.mybatis.util;

public class ServiceFactory {
    public static Object getService(Object service){
        return new TransactionInvocatinHandler(service).getProxy();
    }
}
