package com.yx.controller;

import com.yx.bean.Person;
import com.yx.constant.GenResult;
import com.yx.service.PersonService;
import com.yx.util.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "person")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping(value = "queryAllPersons")
    @ResponseBody
    public Map<String, Object> queryAllPersons() {
        try {
            List<Person> persons = personService.queryPersons();
            return GenResult.SUCCESS.genResult(persons);
        } catch (Exception e) {
            LogUtil.error(e);
            return GenResult.FAILED.genResult();
        }
    }

    @RequestMapping(value = "getById")
    @ResponseBody
    public Map<String, Object> getById(@RequestParam(required = true, defaultValue = "0") int id) {
        try {
            Person person = personService.getPersonById(id);
            return GenResult.SUCCESS.genResult(person);
        } catch (Exception e) {
            LogUtil.error(e);
            return GenResult.FAILED.genResult();
        }
    }
}
