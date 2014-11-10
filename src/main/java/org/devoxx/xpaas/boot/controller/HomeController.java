package org.devoxx.xpaas.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Thomas Demande
 */

@Controller
public class HomeController  {

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public String home(@PathVariable String id) {
        return "Hi [" + id + "]!";

    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String home() {
        return "Hi [guy]!";

    }
}
