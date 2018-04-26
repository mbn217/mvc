package com.yx.job;

import org.springframework.stereotype.Service;

/**
 * 定时操作
 */
@Service
public class JobService {

    public void exec() {
        System.out.println("JobService:exec:" + System.currentTimeMillis());
    }
}
