package com.SSMTest.service.Impl;
import com.SSMTest.dao.EmpDao;
import com.SSMTest.pojo.Emp;
import com.SSMTest.service.EmpService;

import java.util.List;
public class EmpServiceImpl implements EmpService{
    private EmpDao empDao;
    @Override
    public long getEmpRowCount(){
        return empDao.getEmpRowCount();
    }
    @Override
    public List<Emp> selectEmp(){
        return empDao.selectEmp();
    }
    @Override
    public Emp selectEmpByObj(Emp obj){
        return empDao.selectEmpByObj(obj);
    }
    @Override
    public Emp selectEmpById(Integer id){
        return empDao.selectEmpById(id);
    }
    @Override
    public int insertEmp(Emp value){
        return empDao.insertEmp(value);
    }
    @Override
    public int insertNonEmptyEmp(Emp value){
        return empDao.insertNonEmptyEmp(value);
    }
    @Override
    public int deleteEmpById(Integer id){
        return empDao.deleteEmpById(id);
    }
    @Override
    public int updateEmpById(Emp enti){
        return empDao.updateEmpById(enti);
    }
    @Override
    public int updateNonEmptyEmpById(Emp enti){
        return empDao.updateNonEmptyEmpById(enti);
    }

    public EmpDao getEmpDao() {
        return this.empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

}