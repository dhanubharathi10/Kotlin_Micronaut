package example.micronaut

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import jakarta.inject.Inject
import java.time.LocalDate


@Controller("api/v1/employees")

class EmployeeController() {
    @Inject
    lateinit var employeeService:EmployeeService

    //Getting all data
    @Get("/findAll")
    fun findAll():Iterable<Employee>
    {
        return employeeService.findAll()
    }

    //add the new data
    @Post("/save")
    fun save(employee: Employee):Employee
    {
        return employeeService.save(employee)
    }

    //Get the employee details based on empId
    @Get("/get/{id}")
    fun findById(id: Int):Employee
    {
        return employeeService.findById(id)
    }

    //Delete the employee details based on the empId
    @Delete("/delete/{id}")
    fun deleteById(id: Int):String
    {
        return employeeService.deleteById(id)
    }

    //Update the employee details
  @Put("/update/{id}")
    fun update(@Body employee: Employee):Employee
    {
        return employeeService.update(employee)
    }


}