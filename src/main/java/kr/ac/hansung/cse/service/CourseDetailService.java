package kr.ac.hansung.cse.service;

import kr.ac.hansung.cse.dao.CourseDetailDao;
import kr.ac.hansung.cse.entity.CourseDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailService {
  @Autowired
  private CourseDetailDao courseDetailDao;

  public List<CourseDetail> getAllcourseDetail(){
    return courseDetailDao.findAll();
  }

}
