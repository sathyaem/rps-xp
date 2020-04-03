package com.xp.rps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPSAdminController {


    RPSRepo repo;

    public RPSAdminController (RPSRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/getReport")
    private Integer getReport() {

        return repo.getCount();

    }
}
