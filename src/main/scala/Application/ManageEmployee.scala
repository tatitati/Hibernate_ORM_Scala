import java.util
import java.util.Date
import org.hibernate.cfg.Configuration


object ManageEmployee {


	def main(args: Array[String]): Unit = {
		try {
			var factory = new Configuration().configure().buildSessionFactory()
		} catch {
			case ex: Throwable =>
				System.err.println("Failed to create sessionFactory object." + ex)
				throw new ExceptionInInitializerError(ex)
		}
		val ME = new ManageEmployee
		/* Add few employee records in database */ val empID1 = ME.addEmployee("Zara", "Ali", 1000)
		val empID2 = ME.addEmployee("Daisy", "Das", 5000)
		val empID3 = ME.addEmployee("John", "Paul", 10000)
	}
}

class ManageEmployee {
	def addEmployee(fname: String, lname: String, salary: Int): Integer = {
		val session = ManageEmployee.factory.openSession
		var tx = null
		var employeeID = null
		try {
			tx = session.beginTransaction
			val employee = new Employee
			employee.setFirstName(fname)
			employee.setLastName(lname)
			employee.setSalary(salary)
			employeeID = session.save(employee).asInstanceOf[Integer]
			tx.commit()
		} catch {
			case e: HibernateException =>
				if (tx != null) tx.rollback()
				e.printStackTrace()
		} finally session.close()
		employeeID
	}
}