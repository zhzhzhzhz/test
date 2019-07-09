package aaa.springboot02.controller;

import aaa.springboot02.entity.Emp;
import aaa.springboot02.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Emp> empsList = empService.listAll();
        model.addAttribute("empsList",empsList);
        return "showEmp";
    }

    @RequestMapping("/addEmp")
    public String addEmp(){
        return "addEmp";
    }

    @RequestMapping("/saveEmp")
    public String saveEmp(Emp emp){
        empService.saveEmp(emp);
        return "redirect:/list";
    }
    @RequestMapping("/editEmp")
    public String editEmp(Integer empno,Model model){
        Emp byIdList = empService.findById(empno);
        model.addAttribute("byIdList",byIdList);
        return "editEmp";
    }

    @RequestMapping("/updateEmp")
    public String updateEmp(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/list";
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmp(Integer empno){
        empService.deleteEmp(empno);
        return "redirect:/list";
    }

}
