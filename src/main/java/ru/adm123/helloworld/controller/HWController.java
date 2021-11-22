package ru.adm123.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.adm123.helloworld.dto.SimpleObjDTO;
import ru.adm123.helloworld.service.HWService;

/**
 * @author Dmitry Ushakov at 22.11.2021
 */
@RestController
@RequestMapping("/")
public class HWController {

    private final HWService hwService;

    @Autowired
    public HWController(HWService hwService) {
        this.hwService = hwService;
    }

    @GetMapping
    public SimpleObjDTO<String> main() {
        return hwService.helloWorld();
    }

    @GetMapping("/greeting")
    public SimpleObjDTO<String> greetingForAnonymous() {
        return hwService.greeting(null);
    }

    @GetMapping("/greeting/{userName}")
    public SimpleObjDTO<String> greetingForUser(@PathVariable(required = false) String userName) {
        return hwService.greeting(userName);
    }


}
