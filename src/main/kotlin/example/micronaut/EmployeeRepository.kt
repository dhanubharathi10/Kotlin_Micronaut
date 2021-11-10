package example.micronaut

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional


import java.util.*

@Repository
@JdbcRepository(dialect = Dialect.MYSQL)
interface EmployeeRepository : CrudRepository<Employee, Int> {
}