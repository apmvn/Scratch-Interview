package com.dragon.interview.subject.controller;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.service.ISubjectService;
import com.dragon.interview.subject.vo.SubjectVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Resource
    private ISubjectService subjectService;

    @GetMapping(value="/getSubjectList")
    public List<SubjectVO> getSubjectList(){
        List<SubjectVO> subjectList = subjectService.getSubjectList();
        return subjectList;
    }

}
