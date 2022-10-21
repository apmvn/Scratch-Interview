package com.dragon.interview.subject.mapper;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.vo.SubjectVO;

import javax.security.auth.Subject;
import java.util.List;

public interface SubjectMapper {

    SubjectEntity subjectBy();

    List<SubjectVO> getSubjectList();
}
