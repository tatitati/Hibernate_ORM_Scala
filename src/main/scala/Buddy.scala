package nl.busa.jpa

import javax.persistence._

@Entity
@Table(name = "buddy")
class Buddy(first: String, last: String) {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	var id: Int = _

	var firstName: String = first
	var lastName: String  = last

	def this() = this (null, null)

	override def toString = id + " = " + firstName + " " + lastName
}