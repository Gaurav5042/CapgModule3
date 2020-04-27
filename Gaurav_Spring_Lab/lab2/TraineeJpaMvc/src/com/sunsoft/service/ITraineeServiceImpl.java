package com.sunsoft.service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.sunsoft.entity.TraineeSpringJPA;
	import com.sunsoft.repository.ITraineeRepository;

@Service
public class ITraineeServiceImpl implements ITraineeService{

	

		@Autowired
		private ITraineeRepository tmpRepository;//empRepository;
		
		@Override
		public List<TraineeSpringJPA> getTrainees() {
			return tmpRepository.findAll();
		}

		public void saveTrainee(TraineeSpringJPA theTrainee) {
			tmpRepository.save(theTrainee);
			
		}

		public Optional<TraineeSpringJPA> getTrainee(int theId) {
			Optional<TraineeSpringJPA> traineeObj = tmpRepository.findById(theId);
			return traineeObj;
		}
		
		@Override
		@Transactional
		public void deleteTrainee(int theId) {
			tmpRepository.deleteById(theId);
			
		}

	}

	

