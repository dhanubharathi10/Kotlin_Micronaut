package example.micronaut

import jakarta.inject.Inject


class EmployeeService {
    @Inject
    lateinit var employeeRepository:EmployeeRepository

    fun save(employee: Employee):Employee
    {
        employeeRepository.save(employee)
        return employee
    }
    fun findAll():Iterable<Employee>
    {
        return employeeRepository.findAll()
    }

    fun findById(id: Int):Employee
    {
        return employeeRepository.findById(id).orElse(null)
    }

    fun deleteById(id:Int): String {
        if(employeeRepository.existsById(id))
        {
            return "one row deleted"
        }
        else
        {
            return "The given Id is not present in table"
        }
    }
  fun update(employee: Employee):Employee
    {
        return employeeRepository.update(employee)
    }

}