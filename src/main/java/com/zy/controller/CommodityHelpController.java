package com.zy.controller;

import com.zy.utils.ZYJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xxz on 2018/4/6 0006.
 */
@Controller
public class CommodityHelpController {

    @RequestMapping(value = {"/login"},method = RequestMethod.GET)
    public String login(){
        return "/index";
    }
}
