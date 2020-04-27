package com.sunsoft.service;

import java.util.List;
import java.util.Optional;

import com.sunsoft.entity.TraineeSpringJPA;

public interface ITraineeService {
	public List <TraineeSpringJPA> getTrainees();
	public void saveTrainee(TraineeSpringJPA theTrainee);
	public Optional <TraineeSpringJPA> getTrainee(int theId);
	public void deleteTrainee(int theId);
	
}
