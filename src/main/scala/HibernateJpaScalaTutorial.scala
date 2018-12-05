package nl.busa.jpa


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

object HibernateJpaScalaTutorial {
	var entityManagerFactory: EntityManagerFactory = Persistence.createEntityManagerFactory("nl.busa.jpa.HibernateJpaScalaTutorial")
	var entityManager: EntityManager = entityManagerFactory.createEntityManager()

	def main(args: Array[String]) {

		entityManager.getTransaction().begin()
		entityManager.persist(new Buddy("Natalino", "Busa"))
		entityManager.persist(new Buddy("Angelina", "Jolie"))
		entityManager.persist(new Buddy("Kate", "Moss"))
		entityManager.getTransaction().commit()

		entityManager.getTransaction().begin();
		val allBuddies = entityManager.createQuery("From Buddy", classOf[Buddy]).getResultList
		println(allBuddies);

		entityManager.close();
	}
}