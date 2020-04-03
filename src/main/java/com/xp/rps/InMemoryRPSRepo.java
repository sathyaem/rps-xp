package com.xp.rps;

public class InMemoryRPSRepo implements RPSRepo {
    private int count=0;
    public int getCount() {
        return count;
    }

    @Override
    public void addCount() {
        count++;
    }
}
