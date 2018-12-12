package com.burak.passgen.PassGen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

/**
 * Created by ttacakmak on 14.05.2018.
 */


@RestController
public class PassController {

    @RequestMapping("/doit")
    public PassResponse doit(@RequestParam(value="pass") String pass, @RequestParam(value="key") String key) {
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));
        return new PassResponse(PassUtil.encodeAES(pass, key));
    }

}
