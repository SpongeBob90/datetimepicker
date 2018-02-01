package com.wyw.datetimepicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\2\1 0001 13:24
 */
@Controller
public class DateTimePickerController {

    @GetMapping(value = "/index")
    public String dateTimePicker(){
        return "html/dateTimePicker.html";
    }

}
