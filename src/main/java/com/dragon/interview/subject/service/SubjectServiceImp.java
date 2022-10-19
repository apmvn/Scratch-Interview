package com.dragon.interview.subject.service;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubjectServiceImp implements ISubjectService {

    @Resource
    private SubjectMapper subjectMapper;


    @Override
    public SubjectEntity subjectBy() {
        return subjectMapper.subjectBy();
    }
}
