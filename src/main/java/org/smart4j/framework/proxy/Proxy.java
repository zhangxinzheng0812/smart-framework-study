package org.smart4j.framework.proxy;

/**
 * Created by yzy on 2016/2/24.
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws  Throwable;
}
