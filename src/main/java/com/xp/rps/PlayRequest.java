package com.xp.rps;

public class PlayRequest {

    private Throw p1;
    private Throw p2;

    public PlayRequest(Throw p1, Throw p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Throw getP1() {
        return p1;
    }

    public void setP1(Throw p1) {
        this.p1 = p1;
    }

    public Throw getP2() {
        return p2;
    }

    public void setP2(Throw p2) {
        this.p2 = p2;
    }
}
