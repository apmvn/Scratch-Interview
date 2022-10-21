package com.dragon.interview.subject.service;

import com.dragon.interview.subject.entity.SubjectEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISubjectService {

    List<SubjectEntity> getSubjectList();

    List<SubjectEntity> getSubjectByTypeName(SubjectEntity subjectEntity);

    List<SubjectEntity> getSubjectByLanguage(SubjectEntity subjectEntity);
}
