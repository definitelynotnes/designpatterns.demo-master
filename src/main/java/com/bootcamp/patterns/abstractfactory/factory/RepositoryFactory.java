package com.bootcamp.patterns.abstractfactory.factory;

import com.bootcamp.patterns.abstractfactory.EmployeeRepository;
import com.bootcamp.patterns.abstractfactory.SalaryRepository;

public abstract class RepositoryFactory {
    public abstract EmployeeRepository createEmployeeRepository();

    public abstract SalaryRepository createSalaryRepository();

    public static RepositoryFactory getFactory(RepositoryType type) {
        RepositoryFactory repositoryFactory = null;

        switch (type) {
            case MYSQL:
                repositoryFactory = MySQLRepositoryFactory.instance();
                break;
            case ORACLE:
                repositoryFactory = OracleRepositoryFactory.instance();
                break;
        }

        return repositoryFactory;
    }
}
