package com.caesar.schedual;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class SecretsMachine {

    @Scheduled(cron = " 0/10 * * * * ? ")
    public void doTimingPlan() {
        System.out.println("HElloooo==========");
    }
}
