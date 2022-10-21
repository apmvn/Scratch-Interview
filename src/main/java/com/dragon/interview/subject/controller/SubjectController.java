package com.dragon.interview.subject.controller;

import com.dragon.interview.commons.Result;
import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.service.ISubjectService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Resource
    private ISubjectService subjectService;

    @RequestMapping("/getSubjectList")
    public Result getSubjectList(){

        List<SubjectEntity> subjectList = subjectService.getSubjectList();
        if (null == subjectList){
            return new Result(0,"未获取到值",null);
        }
        return new Result(0,"成功",subjectList);
    }

    @RequestMapping(value = "/getSubjectByTypeName",method = RequestMethod.POST)
    public Result getSubjectByTypeName(@RequestBody SubjectEntity subjectEntity){

        List<SubjectEntity> subject = subjectService.getSubjectByTypeName(subjectEntity);
        if (null == subject){
            return new Result(0,"未获取到值",null);
        }
        return new Result(0,"成功",subject);
    }

    @RequestMapping(value = "/getSubjectByLanguage",method = RequestMethod.POST)
    public Result getSubjectByLanguage(@RequestBody SubjectEntity subjectEntity){

        List<SubjectEntity> subject = subjectService.getSubjectByLanguage(subjectEntity);
        if (null == subject){
            return new Result(0,"未获取到值",null);
        }
        return new Result(0,"成功",subject);
    }
}
