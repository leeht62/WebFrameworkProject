package kr.ac.hansung.cse.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kr.ac.hansung.cse.entity.CourseDetail;
import kr.ac.hansung.cse.entity.Courses;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseDetailDao {
  @PersistenceContext
  private EntityManager entityManager;

  public void save(CourseDetail course) {
    entityManager.persist(course);
  }

  public List<CourseDetail> findAll() {
    return entityManager.createQuery("SELECT c FROM CourseDetail c", CourseDetail.class)
        .getResultList();
  }

  public CourseDetail findById(int id) {
    return entityManager.find(CourseDetail.class, id);
  }

  public List<Courses> getCourses(String Semester){
    return entityManager.createQuery("SELECT c FROM Courses c WHERE c.semester = :semester", Courses.class)
        .getResultList();
  }
  public void update(CourseDetail courseDetail) {
    entityManager.merge(courseDetail);
  }
}
