package com.salary.dao;

import com.salary.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface SalaryDao {

    List<Salary> getAllSalary();

    Salary getOneSalary(BigInteger salary_id);

    List<Map> getOneSalaryByLoginName(String login_name);

    List<Salary> searchSalary(Map<String, Object> map);

    int updateTotalSalary(Salary salary);

    int updateSalaryInput(Salary salary);

    List<Salary> getAllSalaryConfig();

    int updateSalaryConfig(Salary salary);

    int insertSalaryConfig(Salary salary);

    List<Salary> searchSalaryConfig(Map<String,Object> map);

    int updateSalaryChecked(Salary salary);

    List<Salary> getAllDeptSalaryById(int dept_id);

    int deleteSalaryById(String[] array);

    int insertSQLSalary();

    int updateSQLSalary(List<Salary> list);

    List<Salary> searchDeptSalary(Map<String, Object> map);

    List<Map> getTotalSalaryList();

}
