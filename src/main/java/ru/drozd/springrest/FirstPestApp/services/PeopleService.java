package ru.drozd.springrest.FirstPestApp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.drozd.springrest.FirstPestApp.models.Person;
import ru.drozd.springrest.FirstPestApp.repositories.PeopleRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PeopleRepository repository;

    @Autowired
    public PeopleService(PeopleRepository repository) {
        this.repository = repository;

    }

    public List<Person> findAll() { return repository.findAll(); }

    public Person findOne(int id) {
        Optional<Person> foundPerson = repository.findById(id);
        return foundPerson.orElse(null);
    }

}
