package com.xp.rps;

public class RPS {
    public static Results play(Throw p1, Throw p2) {
        if (p1 == Throw.ROCK && p2 == Throw.SCISSOR)
            return Results.P1_WIN;
        else if (p1 == Throw.SCISSOR && p2 == Throw.ROCK)
            return Results.P2_WIN;
        else if (p1 == Throw.SCISSOR && p2 == Throw.PAPER)
            return Results.P1_WIN;
        else if (p1 == Throw.PAPER && p2 == Throw.SCISSOR)
            return Results.P2_WIN;
        else if (p1 == Throw.PAPER && p2 == Throw.ROCK)
            return Results.P1_WIN;
        else if (p1 == Throw.ROCK && p2 == Throw.PAPER)
            return Results.P2_WIN;
        else if (p1 == Throw.ROCK && p2 == Throw.ROCK)
            return Results.DRAW;
        else if (p1 == Throw.SCISSOR && p2== Throw.SCISSOR)
            return Results.DRAW;
        else if (p1 == Throw.PAPER && p2 == Throw.PAPER)
            return Results.DRAW;

        return null;

    }

    public static Results play2 (Throw p1, Throw p2) {

        if (p1 == Throw.PAPER) {
            switch(p2) {
                case PAPER: return Results.DRAW;
                case ROCK: return Results.P1_WIN;
                case SCISSOR: return Results.P2_WIN;
                default: return null;
            }
        }
        return null;
    }
}
