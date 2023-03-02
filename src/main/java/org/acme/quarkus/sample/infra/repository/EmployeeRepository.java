package org.acme.quarkus.sample.infra.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.quarkus.sample.data.db.repository.IRepository;
import org.acme.quarkus.sample.infra.db.model.Employee;

@ApplicationScoped
public class EmployeeRepository implements IRepository<Employee, Integer>{

}
