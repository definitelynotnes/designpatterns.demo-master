package com.bootcamp.patterns.abstractfactory.factory;

import com.bootcamp.patterns.abstractfactory.EmployeeRepository;
import com.bootcamp.patterns.abstractfactory.SalaryRepository;
import com.bootcamp.patterns.abstractfactory.mysql.MySQLEmployeeRepository;
import com.bootcamp.patterns.abstractfactory.mysql.MySQLSalaryRepository;

public class MySQLRepositoryFactory extends RepositoryFactory {
    private static MySQLRepositoryFactory INSTANCE;

    public static MySQLRepositoryFactory instance() {
        if(INSTANCE == null) {
            INSTANCE = new MySQLRepositoryFactory();
        }
        return INSTANCE;
    }

    private MySQLRepositoryFactory() {
    }

    @Override
    public EmployeeRepository createEmployeeRepository() {
        return new MySQLEmployeeRepository();
    }

    @Override
    public SalaryRepository createSalaryRepository() {
        return new MySQLSalaryRepository();
    }

}
