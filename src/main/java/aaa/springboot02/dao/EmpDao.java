package aaa.springboot02.dao;

import aaa.springboot02.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface EmpDao {
    public List<Emp> listAll();

    public void saveEmp(Emp emp);

    public Emp findById(Integer empno);

    public void updateEmp(Emp emp);

    public void deleteEmp(Integer empno);
}
