package com.training.vodaphone;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Component

//@Controller
//@Service
//@Configuration
//@Repository


@RestController
@RequestMapping("/first")
@Validated
public class MyFirstRest {

    // Field Wiring
    //    @Autowired
    //    private MyBusLogic mb;
    //
    //    @PostConstruct
    //    public void name() {
    //        String func1Loc = this.mb.func1();
    //    }

    private final MyBusLogic mbcw;


    // Constructor wiring
    @Autowired
    public MyFirstRest(final MyBusLogic mbcw) {
        this.mbcw = mbcw;
        // String func1Loc = mbcw.func1();
    }


    // Method Wiring
    //    @Autowired
    //    public void methodWiring(final MyBusLogic mbmw) {
    //        this.mbmw = mbmw;
    //
    //    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world " + this.mbcw.func1();
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello world 2 continue";
    }

    @PostMapping("/hello3")
    public String hello3() {
        return "hello world 3 POST";
    }

    @GetMapping("/hello3")
    public String hello3a() {
        return "hello world 3 GET";
    }

    @PutMapping("/hello3")
    public String hello3b() {
        return "hello world 3 PUT";
    }

    //@RequestMapping(method = RequestMethod.DELETE, path = "/hello3")
    @DeleteMapping("/hello3")
    public String hello3c() {
        return "hello world 3 DELETE";
    }

    @GetMapping("/hello4/{xyz}/{abc}")
    public String hello4(@PathVariable("xyz") @NotEmpty final String name,
                         @PathVariable("abc") final String surname) {
        return "hello world 4 " + name + " " + surname;
    }


    @GetMapping("/hello5")
    public String hello5(@RequestParam("xyz") final String name,
                         @RequestParam("abc") final String surname) {
        return "hello world 5 " + name + " " + surname;
    }

    @GetMapping("/hello6")
    public String hello6(@RequestHeader("xyz") final String name,
                         @RequestHeader("abc") final String surname) {
        return "hello world 6 " + name + " " + surname;
    }

    @PostMapping("/hello7")
    public String hello7(@RequestBody final Person person) {
        return "hello world 7 " + person;
    }


    @PostMapping(value = "/hello8",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Person hello8(@RequestBody final Person person) {
        person.setName(person.getName() + " hello8 ");
        return person;
    }


    @PostMapping(value = "/hello9")
    public String hello9(@RequestBody @Validated final Person person) {
        //        if ((person.getName() == null)
        //            || person.getName()
        //                     .isEmpty()) {
        //            return "Error";
        //        }
        //        if ((person.getSurname() == null)
        //            || person.getSurname()
        //                     .isEmpty()) {
        //            return "Error";
        //        }
        if (person.getAge() == 37) {
            throw new IllegalStateException("yas 37 olamaz");
        }
        if (person.getAge() == 38) {
            throw new IllegalArgumentException("yas 38 olamaz");
        }
        return "Hello9";
    }


}

