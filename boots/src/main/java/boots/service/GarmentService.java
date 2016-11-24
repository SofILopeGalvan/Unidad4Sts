package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.GarmentRepository;
import boots.model.Garment;

@Service @Transactional
public class GarmentService {

	private final GarmentRepository garmentsRepository;

	public GarmentService(GarmentRepository garmentsRepository) {
		super();
		this.garmentsRepository = garmentsRepository;
	}
	
	public List<Garment> findAll(){
		List<Garment> garments = new ArrayList<Garment>();
		for (Garment garment : garmentsRepository.findAll()){
			garments.add(garment);
		}
		return garments;	
		
	}
	
	public void save(Garment garment){
		garmentsRepository.save(garment);
	}
	
	public void delete(int id){
		garmentsRepository.delete(id);
	}
	
	public Garment findOne (int id){
		return garmentsRepository.findOne(id);
	}	
}