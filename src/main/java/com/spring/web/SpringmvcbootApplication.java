package com.spring.web;

import com.spring.web.dao.UserRepo;
import com.spring.web.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


@SpringBootApplication
public class SpringmvcbootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringmvcbootApplication.class, args);

        UserRepo userRepo = context.getBean(UserRepo.class);

//        User user = new User();
//        user.setStatus("Male");
//        user.setCity("Noida");
//        user.setName("Varun");
//
////        Saving single user
//        User user1 = userRepo.save(user);
//   System.out.println(user1);
//
//        User user2 = new User();
//        user2.setName("Saurabh");
//        user2.setCity("Delhi");
//        user2.setStatus("NOt Married");
//
//        User user3 = new User();
//        user3.setName("Aaro");
//        user3.setCity("Uk");
//        user3.setStatus(" Married");
//        List<User> users = List.of(user, user2, user3);
//        //save multiple objects
//        //Iterable collection's Parent;
//        Iterable<User> result = userRepo.saveAll(users);
//
//        result.forEach(System.out::println);
//


//        //update user
//
//        Optional<User> optional = userRepo.findById(2);
//        User useR = optional.get();
//
//        useR.setName("Jonny");
//
//        User results = userRepo.save(useR);
//        System.out.println(results);
//


//        // Get the data from Tables;
//        //find by id -return optional containing your data;
//
//        Iterable<User> itr = userRepo.findAll();
//        //Iterator<User> iterator = itr.iterator();
////        while (iterator.hasNext()){
////            User userS=iterator.next();
////            System.out.println(userS);
////        }
//// 1. Anonymous Class
////An anonymous class in Java is a class that doesn't have a
//// name and is used to instantiate an object with certain "extras," such
//// as method overrides, without needing a full class declaration. It’s often
//// used to provide a quick implementation for an interface or to extend a class for a single-use.
////        itr.forEach(new Consumer<User>() {
////            @Override
////            public void accept(User t) {
////                System.out.println(t);
////
////            }
////        });
//
//        itr.forEach(UseR->{ System.out.println(user);});
//


//        //Deleting the user elements;
//
////        userRepo.deleteById(352);
////        System.out.println("Deleted");
//        Iterable<User> allUsers = userRepo.findAll();
//        allUsers.forEach(Users-> System.out.println(user));
//        userRepo.deleteAll(allUsers);

//


        //custom Methods
//        List<User> users = userRepo.findByName("Varun");
////        users.forEach(System.out::println);
//        List<User> byNameAndCity = userRepo.findByNameAndCityAndId("Varun", "Noida",502);
//        byNameAndCity.forEach(System.out::println);


//        List<User> allUser = userRepo.getAllUser();
//        allUser.forEach(e->{
//            System.out.println(e);
//        });
//
////        System.out.println("__");
//        List<User> userByName = userRepo.getUserByName("Varun","Noida");
//        userByName.forEach(e->{
//            System.out.println(e);
//        });
        List<User> users = userRepo.getUsers();
        users.forEach(e->{
            System.out.println(e);
        });



    }

}
