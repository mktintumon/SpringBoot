package com.actuator.actuatordemo.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService implements HealthIndicator{

    public static final String DB_SERVICE = "DB services";

    public boolean isHealthGood(){
        return true;
        //return false;
    }

    @Override
    public Health health() {
        if(isHealthGood()){
            return Health.up().withDetail(DB_SERVICE, "DB is running...").build();
        }

        return Health.down().withDetail(DB_SERVICE, "DB is running down...").build();
    }
    
}
