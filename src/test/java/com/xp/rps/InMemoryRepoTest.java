package com.xp.rps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InMemoryRepoTest {

    //test for get count
    @Test
    public void testCount()
    {
        InMemoryRPSRepo rpsRepo=new InMemoryRPSRepo();
        rpsRepo.addCount();
        int count = rpsRepo.getCount();
        assertThat(count).isGreaterThanOrEqualTo(1);
    }
}
