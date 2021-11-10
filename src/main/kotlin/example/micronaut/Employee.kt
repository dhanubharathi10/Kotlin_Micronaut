package example.micronaut

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "employees")
data class Employee(
    @Column(name = "empid")
    @Id
    var empId:  Int,
    @Column(name = "empfirstname")
    val empFirstName: String,
    @Column(name = "emplastname")
    val empLastName: String,
    @Column(name = "empage")
    val empAge: Int
)
