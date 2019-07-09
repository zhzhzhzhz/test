package aaa.springboot02.service;

import aaa.springboot02.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> listAll();

    public void saveEmp(Emp emp);

    public Emp findById(Integer empno);

    public void updateEmp(Emp emp);

    public void deleteEmp(Integer empno);
}
