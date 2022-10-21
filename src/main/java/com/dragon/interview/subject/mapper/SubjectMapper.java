package com.dragon.interview.subject.mapper;

import com.dragon.interview.subject.entity.SubjectEntity;

import java.util.List;

public interface SubjectMapper {

    List<SubjectEntity> getSubjectList();

    List<SubjectEntity> getSubjectByTypeName(SubjectEntity subjectEntity);

    List<SubjectEntity> getSubjectByLanguage(SubjectEntity subjectEntity);
}
