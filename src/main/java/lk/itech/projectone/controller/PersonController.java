package lk.itech.projectone.controller;

import lk.itech.projectone.dto.PersonDTO;
import lk.itech.projectone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public String savePerson(@RequestBody PersonDTO personDTO) {
        personService.saveUser(personDTO);
        return null;

    }

    @GetMapping("/get")
    public void getAllPerson() {

    }

    @PutMapping("/update")
    public void updatePerson() {

    }

    @DeleteMapping("/delete")
    public void deletePerson() {

    }
}
