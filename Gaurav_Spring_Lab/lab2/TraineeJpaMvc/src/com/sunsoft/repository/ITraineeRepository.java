	
	package com.sunsoft.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.sunsoft.entity.TraineeSpringJPA;

@Repository("traineeRepository")
public interface ITraineeRepository extends JpaRepository<TraineeSpringJPA, Integer>{



	
}
