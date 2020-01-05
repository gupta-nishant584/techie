package io.techie.hibernatepractice1.controller;


import io.techie.hibernatepractice1.entity.Account;
import io.techie.hibernatepractice1.entity.EmployeeEntity;
import io.techie.hibernatepractice1.entity.EmployeeProfile;
import io.techie.hibernatepractice1.model.AccountDetail;
import io.techie.hibernatepractice1.model.NewEmployeeRequest;
import io.techie.hibernatepractice1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> employees(){
        List<EmployeeEntity> employeeEntityList = employeeService.getAllEmployee();
        return ResponseEntity.ok(employeeEntityList);
    }

    @PostMapping(value="/employee/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody NewEmployeeRequest newEmployeeRequest){

       if (Optional.ofNullable(newEmployeeRequest).isPresent()) {
           EmployeeProfile employeeProfile = new EmployeeProfile();
           employeeProfile.setGender("MALE");
           employeeProfile.setMaritalStatus("MARRIED");
           employeeProfile.setPinCode("122017");

           EmployeeEntity employeeEntity = new EmployeeEntity();
           employeeEntity.setFirstName(newEmployeeRequest.getFirstName());
           employeeEntity.setLastName(newEmployeeRequest.getLastName());
           employeeEntity.setEmail(newEmployeeRequest.getEmail());
           employeeEntity.setEmployeeProfile(employeeProfile); //setting child reference(Employee Profile) in parent entity(Employee Entity)

           employeeProfile.setEmployeeEntity(employeeEntity); //setting parent reference( Employee Entity ) in child entity (Employee Profile)

           employeeService.saveEmployee(employeeEntity);

           return new ResponseEntity(employeeEntity,HttpStatus.CREATED);
       }
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }


    @GetMapping(value = "/accounts/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> accounts(@PathVariable Long employeeId){
        List<Account> accountList = employeeService.employeeAccounts(employeeId);
         if(Optional.ofNullable(accountList).isPresent()){
             return  new ResponseEntity<>(accountList,HttpStatus.OK);
         }else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }



    }

    @PostMapping(value = "/accounts/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveAccount(@PathVariable Long employeeId, @RequestBody AccountDetail accountDetail){
       return employeeService.findById(employeeId).map(employeeEntity -> {
            Account account = new Account();
            account.setAccountNumber(accountDetail.getAccountNumber());
            account.setBankName(accountDetail.getBankName());
            account.setEmployeeEntity(employeeEntity);
            employeeService.saveAccount(account);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value="/post/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> posts(){
        employeeService.createPosts();
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
