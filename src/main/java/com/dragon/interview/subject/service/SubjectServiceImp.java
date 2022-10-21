package com.dragon.interview.subject.service;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImp implements ISubjectService {

    @Resource
    private SubjectMapper subjectMapper;

    @Override
    public List<SubjectEntity> getSubjectList() {
        return subjectMapper.getSubjectList();
    }

    @Override
    public List<SubjectEntity> getSubjectByTypeName(SubjectEntity subjectEntity) {
        return subjectMapper.getSubjectByTypeName(subjectEntity);
    }

    @Override
    public List<SubjectEntity> getSubjectByLanguage(SubjectEntity subjectEntity) {
        return subjectMapper.getSubjectByLanguage(subjectEntity);
    }
}
