package com.dragon.interview.subject.service;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.mapper.SubjectMapper;
import com.dragon.interview.subject.vo.SubjectVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImp implements ISubjectService {

    @Resource
    private SubjectMapper subjectMapper;


    @Override
    public SubjectEntity subjectBy() {
        return subjectMapper.subjectBy();
    }

    @Override
    public List<SubjectVO> getSubjectList() {
        List<SubjectVO> subjectEntityList = subjectMapper.getSubjectList();
        return subjectEntityList;
    }
}
