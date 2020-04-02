package com.xp.rps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RPSControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void rockVsPaper() {
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/play", new PlayRequest(Throw.ROCK, Throw.PAPER), String.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("P2_WIN", responseEntity.getBody());
    }

    @Test
    void rockVsScissors (){
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/play", new PlayRequest(Throw.ROCK, Throw.SCISSOR), String.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("P1_WIN",responseEntity.getBody());
    }


}
