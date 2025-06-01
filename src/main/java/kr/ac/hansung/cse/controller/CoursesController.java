package kr.ac.hansung.cse.controller;

import jakarta.validation.Valid;
import kr.ac.hansung.cse.entity.CourseDetail;
import kr.ac.hansung.cse.entity.Courses;
import kr.ac.hansung.cse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CoursesController {
  @Autowired
  private CourseService courseService;
  @GetMapping("/detailfind")
  public String detailFindLink(Model model,CourseDetail courseDetail) {
    List<Courses> courses=courseService.getCoursesDetail(courseDetail);
    model.addAttribute("courses",courses);
    return "courses";
  }

  @GetMapping("/register")
  public String createRegisters(Model model,CourseDetail courseDetail){
    List<Courses> courses=courseService.getCoursesDetail(courseDetail);
    model.addAttribute("courses",courses);
    return "register";
  }
  @GetMapping("/createregister")
  public String createRegister(Model model){
    model.addAttribute("courses",new Courses());
    return "createregister";
  }
  @PostMapping("docreate")
  public String doCreate(Model model, @Valid Courses courses, BindingResult result) {
    if(result.hasErrors()) {
      System.out.println("== Form data does not validated ==");
      List<ObjectError> errors = result.getAllErrors();

      for(ObjectError error:errors) {
        System.out.println(error.getDefaultMessage());
      }

      return "createregister";
    }
    courseService.save(courses);
    return "registercreated";
  }
}
