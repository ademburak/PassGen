package com.burak.passgen.PassGen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ttacakmak on 14.05.2018.
 */


@RestController
public class PassController {

    @RequestMapping("/doit")
    public PassResponse doit(@RequestParam(value="pass") String pass, @RequestParam(value="key") String key) {
        return new PassResponse(PassUtil.encodeAES(pass, key));
    }

}
