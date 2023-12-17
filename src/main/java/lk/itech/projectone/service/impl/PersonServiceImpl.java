package lk.itech.projectone.service.impl;

import lk.itech.projectone.dto.PersonDTO;
import lk.itech.projectone.model.Person;
import lk.itech.projectone.repository.PersonRepository;
import lk.itech.projectone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void saveUser(PersonDTO personDTO) {

        Person p = new Person(
                personDTO.getPersonId(),
                personDTO.getName(),
                personDTO.getAge(),
                personDTO.getActiveStatus());
        personRepository.save(p);
    }
}
