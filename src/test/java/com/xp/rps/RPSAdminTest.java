package com.xp.rps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import javax.net.ssl.HttpsURLConnection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RPSAdminTest {
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    public void getReportTestForZero()
    {
        //ResponseEntity<String> responseEntityPlay = restTemplate.postForEntity("/play", new PlayRequest(Throw.ROCK, Throw.SCISSOR), String.class);
        ResponseEntity<Integer> responseEntity=restTemplate.getForEntity("/getReport",Integer.class);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
        assertThat(responseEntity.getBody().intValue()).isEqualTo(0);
    }

    @Test
    public void getReportTest()
    {
        ResponseEntity<String> responseEntityPlay = restTemplate.postForEntity("/play", new PlayRequest(Throw.ROCK, Throw.SCISSOR), String.class);
        ResponseEntity<Integer> responseEntity=restTemplate.getForEntity("/getReport",Integer.class);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
        assertThat(responseEntity.getBody().intValue()).isGreaterThanOrEqualTo(1);
    }


}
