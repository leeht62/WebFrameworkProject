package kr.ac.hansung.cse;

import kr.ac.hansung.cse.dao.CourseDetailDao;
import kr.ac.hansung.cse.dao.CoursesDao;
import kr.ac.hansung.cse.entity.CourseDetail;
import kr.ac.hansung.cse.entity.Courses;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("dao-context.xml");

    CourseDetailDao courseDetailDao = context.getBean(CourseDetailDao.class);

    List<Courses> courses = Arrays.asList(
        new Courses("객체지향언어1",2024,1,"V020001","전선","심철준",3),
        new Courses("안드로이드 프로그래밍",2024,1,"V021004","전선","송미화",3),
        new Courses("데이터마이닝",2024,1,"V022003","전필","송미화",3),
        new Courses("프로그래밍언어론",2024,1,"V020005","전선","김성동",3),
        new Courses("확률과통계",2024,1,"V020006","전선","이호규",3),
        new Courses("데이터베이스",2024,1,"V020012","전선","전원호",3),
        new Courses("네트워크 프로그래밍",2024,2,"V020017","전선","신성",3),
        new Courses("빅데이터기초",2024,2,"V022006","전필","신성",3),
        new Courses("알고리즘",2024,2,"V020010","전선","강희중",3),
        new Courses("데이터베이스설계",2024,2,"V022004","전필","송미화",3),
        new Courses("웹프레임워크1",2024,2,"V024005","전필","심규현",3),
        new Courses("웹프로그래밍기초",2024,2,"CTE0002","전기","심철준",3),
        new Courses("빅데이터프로그래밍",2025,1,"V022005","전필","이청용",3),
        new Courses("운영체제",2025,1,"V020014","전선","황기태",3),
        new Courses("컴퓨터구조",2025,1,"V020003","전선","황호영",3),
        new Courses("웹공학 캡스톤디자인",2025,1,"V024008","전필","유수진",3),
        new Courses("웹서버 프로그래밍",2025,1,"V024004","전필","전원호",3),
        new Courses("웹프레임워크2",2025,1,"V024006","전필","김남윤",3)
    );


    CourseDetail courseDetail1 = new CourseDetail();
    CourseDetail courseDetail2 = new CourseDetail();
    CourseDetail courseDetail3 = new CourseDetail();
    CourseDetail courseDetail4 = new CourseDetail();
    for(int i=0;i<6;i++) {
      courseDetail1.addCourses(courses.get(i));
    }
    for(int i=6;i<12;i++) {
      courseDetail2.addCourses(courses.get(i));
    }
    for(int i=12;i<18;i++) {
      courseDetail3.addCourses(courses.get(i));
    }
    courseDetail1.addDetails(courseDetail1);
    courseDetail2.addDetails(courseDetail2);
    courseDetail3.addDetails(courseDetail3);
    courseDetail4.setYear(2025);
    courseDetail4.setSemester(2);


    List<CourseDetail> coursedetail = Arrays.asList(courseDetail1, courseDetail2, courseDetail3,courseDetail4);
    coursedetail.forEach(courseDetailDao::save);

  }
}
