package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();
    private Long timer;

    public Long getTime(){
    return nanoTime;
    }
}
