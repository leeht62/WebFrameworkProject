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
public class CoursesDao {
  @PersistenceContext
  private EntityManager entityManager;

  public void save(Courses course) {
    entityManager.persist(course);
  }

  public Courses findById(Long id) {
    return entityManager.find(Courses.class, id);
  }

  public List<Courses> getCourses(CourseDetail courseDetail){
    return entityManager.createQuery("SELECT c FROM Courses c WHERE c.courseDetail.year = :year AND c.courseDetail.semester = :semester", Courses.class)
        .setParameter("year", courseDetail.getYear())
        .setParameter("semester", courseDetail.getSemester())
        .getResultList();
  }
  public List<Courses> findAll() {
    return entityManager.createQuery("SELECT c FROM Courses c", Courses.class)
        .getResultList();
  }
}
