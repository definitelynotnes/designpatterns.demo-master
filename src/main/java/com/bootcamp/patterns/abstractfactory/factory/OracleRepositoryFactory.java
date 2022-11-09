package com.bootcamp.patterns.abstractfactory.factory;

import com.bootcamp.patterns.abstractfactory.EmployeeRepository;
import com.bootcamp.patterns.abstractfactory.SalaryRepository;
import com.bootcamp.patterns.abstractfactory.oracle.OracleEmployeeRepository;
import com.bootcamp.patterns.abstractfactory.oracle.OracleSalaryRepository;

public class OracleRepositoryFactory extends RepositoryFactory {
    private static OracleRepositoryFactory INSTANCE;

    public static OracleRepositoryFactory instance() {
        if(INSTANCE == null) {
            INSTANCE = new OracleRepositoryFactory();
        }
        return INSTANCE;
    }

    @Override
    public EmployeeRepository createEmployeeRepository() {
        return new OracleEmployeeRepository();
    }

    @Override
    public SalaryRepository createSalaryRepository() {
        return new OracleSalaryRepository();
    }

}
