package io.techie.hibernatepractice1.service;

import io.techie.hibernatepractice1.dao.*;
import io.techie.hibernatepractice1.entity.Account;
import io.techie.hibernatepractice1.entity.EmployeeEntity;
import io.techie.hibernatepractice1.entity.Post;
import io.techie.hibernatepractice1.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;

    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Optional<EmployeeEntity> findById(Long id){return employeeRepository.findById(id);}

    public void saveEmployee(EmployeeEntity employeeEntity){ employeeRepository.save(employeeEntity); }

    public void cleanEmployeeProfile(){ employeeProfileRepository.deleteAllInBatch(); }

    public List<Account> employeeAccounts(Long employeeId){ return accountRepository.findByEmployeeId(employeeId); }

    public void saveAccount(Account account){ accountRepository.save(account);}

    public void createPosts() {

        //clean tables
        postRepository.deleteAllInBatch();
        tagRepository.deleteAllInBatch();

        Post post = new Post("Hibernate Many to Many Example with Spring Boot",
                "Learn how to map a many to many relationship using hibernate",
                "Entire Post content with Sample code");

        Tag tag1 = new Tag("Spring Boot");
        Tag tag2 = new Tag("Hibernate");

        post.getTags().add(tag1);
        post.getTags().add(tag2);

        tag1.getPosts().add(post);
        tag2.getPosts().add(post);

        postRepository.save(post);
    }
}
