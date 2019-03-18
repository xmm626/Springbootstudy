package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.CourseService;
import com.springboot.mybatis.service.UserService;
import com.springboot.mybatis.util.RandomUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 查询所有班课
     *
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> selectAll() {
        return userService.selectAll();
    }

    /**
     * 根据id查询班课
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable("id") long id) {
        return userService.getOne(id);
    }

    /**
     * 根据id删除班课
     *
     * @param id
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") long id) {
        userService.delete(id);
    }

    /**
     * 新增班课
     *
     * @param user
     */
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addCourse(@RequestBody User user) {
        user.setCredits(RandomUtil.getRandomCode());
        userService.insert(user);
    }

    /**
     * 更新班课
     *
     * @param user
     */
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody User user) {
        userService.update(user);
    }
}

