package aaa.springboot02.service.Impl;

import aaa.springboot02.dao.EmpDao;
import aaa.springboot02.entity.Emp;
import aaa.springboot02.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listAll() {
        return empDao.listAll();
    }

    @Override
    public void saveEmp(Emp emp) {
        empDao.saveEmp(emp);
    }

    @Override
    public Emp findById(Integer empno) {
        return empDao.findById(empno);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Override
    public void deleteEmp(Integer empno) {
        empDao.deleteEmp(empno);
    }


}
