package com.qf.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/5/22.
 */
@Controller
public class ManagerIndexAction {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
