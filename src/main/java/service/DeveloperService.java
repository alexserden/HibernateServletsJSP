package service;

import model.Developer;
import repository.Hibernate.DeveloperRepositoryImpl;

import java.util.List;

public class DeveloperService {
    DeveloperRepositoryImpl hibernateDeveloper;
    public DeveloperService(){
        hibernateDeveloper = new DeveloperRepositoryImpl();
    }
    public void create(Developer developer){
        hibernateDeveloper.create(developer);
    }
    public List<Developer> getAll(){
        return  hibernateDeveloper.getAll();
    }

    public void delete(Long id){
        hibernateDeveloper.delete(id);
    }
}
