package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.repository.SeriesRepository;

public class SeriesService {
	
	private SeriesRepository serrepository = SeriesRepository.getInstance(); 
        public SeriesService() {
			// TODO Auto-generated constructor stub
		}
        
        private static SeriesService  serservice = null;
        
        public static SeriesService getInstance() {
        	
    		if(serservice==null)
    		serservice = new SeriesService();
    		return serservice;

    	}
        public String addSeries(Series series){
    		// do we need to consume the addUser method from repo.
    		return this.serrepository.addSeries(series);
    	}
        public Series getSeriesById(String id){
    		return serrepository.getSeriesById(id);
    	}
        public Series[] getAllSeries() {
    		return serrepository.getAllSeries();
    	}
        
        public String deleteSeries(String id) {
        	return serrepository.deleteSeries(id);
        }
        public String modifySeries(String id,Series series) {
        	return serrepository.modifySeries(id, series);
        	
        }
        
        
        
}



/*
 * Refrence
 * 
	//Abhinandar sir's code
/*package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.repository.UserRepository;
// service objects are used to just call the services inside the main method
//can we do this using 1 object?
// TO fix they provided a solution called singleton Design pattern
// one ==> to get only one object for the specific type.
public class UserService {
	private UserRepository repository = UserRepository.getInstance();
	// service is consuming the repository
	
	private UserService() {
		// TODO Auto-generated constructor stub
	}
	// if we want ot create that single object then we have to create it
	// inside the same class
	// and we have to share ref with others
	// to do the same we have to declare a method.
	private static UserService  service = null;
	// this would be a static 
	// only one copy.
	
	public static UserService getInstance() {
		// it  becomes object independant?
		// static will make it independant on the object for execution.
		
		// static method will access only static ref
		if(service==null)
		service = new UserService();
		return service;

	}

	public String addUser(Register register) {
		// do we need to consume the addUser method from repo.
		return this.repository.addUser(register);
	}

	public Register getUserById(String id) {
		return repository.getUserById(id);
	}
	public Register[] getUsers() {
		return repository.getUsers();
	}
}
 * 
 * */
