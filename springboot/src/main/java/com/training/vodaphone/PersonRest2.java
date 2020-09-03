package com.training.vodaphone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person")
public class PersonRest2 {

    @GetMapping("/search")
    public Person searchPerson(final long personId) {
        return null;
    }

    @GetMapping("/disable")
    public Person disablePerson(final long personId) {
        return null;
    }

    @PostMapping("/provision")
    public String provisionPerson(final Person person) {
        return "OK";
    }

    @PostMapping("/update")
    public String updatePerson(final Person person) {
        return "OK";
    }

}
