package com.dragon.interview.subject.service;

import com.dragon.interview.subject.entity.SubjectEntity;
import com.dragon.interview.subject.vo.SubjectVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISubjectService {
    SubjectEntity subjectBy();

    List<SubjectVO> getSubjectList();
}
