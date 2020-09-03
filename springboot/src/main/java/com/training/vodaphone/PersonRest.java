package com.training.vodaphone;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person/provision")
public class PersonRest {

    @GetMapping
    public Person searchPerson(final long personId) {
        return null;
    }

    @DeleteMapping
    public Person disablePerson(final long personId) {
        return null;
    }

    @PutMapping
    public String provisionPerson(final Person person) {
        return "OK";
    }

    @PatchMapping
    public String updatePerson(final Person person) {
        return "OK";
    }

    @PatchMapping
    public String xyzPerson(final Person person) {
        return "OK";
    }

}
