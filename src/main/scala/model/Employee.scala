import javax.persistence._

@Entity
@Table(name = "EMPLOYEE") class Employee() {
	@Id
	@GeneratedValue
	@Column(name = "id") private var id = 0
	@Column(name = "first_name") private var firstName = null
	@Column(name = "last_name") private var lastName = null
	@Column(name = "salary") private var salary = 0

	def getId = id

	def setId(id: Int): Unit = {
		this.id = id
	}

	def getFirstName = firstName

	def setFirstName(first_name: String): Unit = {
		this.firstName = first_name
	}

	def getLastName = lastName

	def setLastName(last_name: String): Unit = {
		this.lastName = last_name
	}

	def getSalary = salary

	def setSalary(salary: Int): Unit = {
		this.salary = salary
	}
}