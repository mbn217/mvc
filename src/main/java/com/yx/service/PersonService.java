package com.yx.service;

import com.yx.bean.Person;
import com.yx.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonService {
    @Resource
    private PersonDao personDao;

    public List<Person> queryPersons() {
        return personDao.queryPersons();
    }

    public Person getPersonById(int id) {
        return personDao.queryPersonById(id);
    }
}
