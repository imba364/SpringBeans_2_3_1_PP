package app.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.Instant;


@Component
@Qualifier("AnimalCage")
public class Timer {
    private final Instant time;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    public Timer() {
        this.time = Instant.now();
    }

    public Instant getTimer() {
        return time;
    }
    }
