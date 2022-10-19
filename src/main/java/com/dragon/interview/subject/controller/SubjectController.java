package com.dragon.interview.subject.controller;

import com.dragon.interview.subject.service.ISubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Subject")
public class SubjectController {

    @Resource
    private ISubjectService iSubjectService;
}
