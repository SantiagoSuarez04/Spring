package com.example.app.services;
import java.util.List;
import com.example.app.domain.Employee;

public interface EmployeeService {
    public List<Employee> listaEmpleados();
    public void GuardarEmpleado(Employee employee);
    public void EliminarEmpledao(Employee employee);
    public Employee mostrarEmpleado(Employee employee);
}
