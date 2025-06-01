package kr.ac.hansung.cse.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="course_detail")
public class CourseDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @OneToMany(mappedBy = "courseDetail",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
  private List<Courses> courses = new ArrayList<>();

  @Column(name="year")
  private int year;

  @Column(name="semester")
  private int semester;

  private int sum;

  public void addCourses(Courses course) {
    courses.add(course);
    course.setCourseDetail(this);
  }

  public void addDetails(CourseDetail detail){
    List<Courses> courses = detail.getCourses();
    int sum=0;
    int credit=0;
    int year = courses.get(0).getYear();
    int semester = courses.get(0).getSemester();
    for (Courses course : courses) {
      credit = course.getCredit();
      sum += credit;
    }
    detail.setSum(sum);
    detail.setSemester(semester);
    detail.setYear(year);
  }

}
