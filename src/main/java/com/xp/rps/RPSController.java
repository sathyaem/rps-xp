package com.xp.rps;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPSController {


    RPSRepo repo;

    public RPSController (RPSRepo repo) {
        this.repo = repo;
    }

    @PostMapping ("/play")
    public ResponseEntity<String> play(@RequestBody PlayRequest playRequest) {

        Results playResult = RPS.play(playRequest.getP1(), playRequest.getP2());
        repo.addCount();
        ResponseEntity<String> responseEntity = new ResponseEntity(playResult.toString(), HttpStatus.OK);
        return responseEntity;

    }


}
