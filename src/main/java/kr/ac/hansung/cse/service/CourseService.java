package kr.ac.hansung.cse.service;

import kr.ac.hansung.cse.dao.CourseDetailDao;
import kr.ac.hansung.cse.dao.CoursesDao;
import kr.ac.hansung.cse.entity.CourseDetail;
import kr.ac.hansung.cse.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
  @Autowired
  private CoursesDao coursesDao;
  @Autowired
  private CourseDetailDao courseDetailDao;

  public List<Courses> getCoursesDetail(CourseDetail courseDetail){// 로그 추가
    return coursesDao.getCourses(courseDetail);
  }

  public void save(Courses courses) {
    CourseDetail courseDetail=courseDetailDao.findById(4);
    courses.setCourseDetail(courseDetail);
    courses.setYear(2025);
    courses.setSemester(2);
    coursesDao.save(courses);
  }
}
