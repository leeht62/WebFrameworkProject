package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.entity.CourseDetail;
import kr.ac.hansung.cse.service.CourseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseDetailController {
  @Autowired
  private CourseDetailService courseDetailService;
  @GetMapping("/coursedetail")
  public String showCourseDetail(Model model){
    List<CourseDetail> courseDetails=courseDetailService.getAllcourseDetail();
    model.addAttribute("courseDetail",courseDetails);
    return "courseDetails";
  }


}
