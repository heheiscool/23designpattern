package com.structpattern.staticproxy;

public class StudentMapper implements MapperInterface{
    @Override
    public int save(User user) {
        System.out.println("-----------保存学生数据--------------");
        return 1;
    }
}
