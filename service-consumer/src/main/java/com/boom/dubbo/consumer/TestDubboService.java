package com.boom.dubbo.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by jiangshan on 16/6/20.
 */
public class TestDubboService {

    private final Log log = LogFactory.getLog(TestDubboService.class);
    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public void test() {
        log.info("===== TestDubboService test === env:" + getEnv());
    }
}
