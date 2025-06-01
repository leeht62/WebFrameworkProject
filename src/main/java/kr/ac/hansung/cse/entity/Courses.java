package kr.ac.hansung.cse.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="courses")
public class Courses {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private Long id;

  @Size(min=2, max=100, message = "수강과목은 2에서 100글자 사이어야 합니다.")
  @Column(name="title")
  private String title;


  @Column(name="year")
  private int year;

  @Column(name="semester")
  private int semester;

  @Size(min=2, max=100, message = "과목코드는 2에서 100글자 사이어야 합니다.")
  @Column(name="code")
  private String code;

  @Size(min=2, max=100, message = " 교과구분은 2에서 100글자 사이어야 합니다.")
  @Column(name="major")
  private String major;

  @Size(min=2, max=100, message = " 교수자 성함은 2에서 100글자 사이어야 합니다.")
  @Column(name="professor")
  private String professor;

  @Column(name="credit")
  private int credit;

  @ManyToOne
  @JoinColumn(name="course_detail_id")
  private CourseDetail courseDetail;


  public Courses(String title, int year, int semester, String code, String major, String professor, int credit) {
    this.title = title;
    this.year = year;
    this.semester = semester;
    this.code = code;
    this.major = major;
    this.professor = professor;
    this.credit = credit;
  }

}
