package com.example.Minimalism.service;


/*This is my service class where i will logic for the program and i will be using Repositories
 * and accesing database connectivity class and making changes into the database*/

public class Functionalcode {
    //Need to write functional programming here
    /*More Functional Version
Here, we embrace functional programming more fully — avoid side effects,
 use immutability, and return values instead of void.

 @Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Returns a filtered list of users according to the passed filter function
    public List<User> process(Function<User, Boolean> filter) {
        return userRepository.findAll().stream()
                             .filter(filter::apply)
                             .collect(Collectors.toList());
    }
}

Notes:

    The method returns a List of filtered users, no side effects.

    The filtering uses functional constructs (stream(), filter with method ref).

    You could further improve by using Predicate<User> instead of Function<User, Boolean> since filtering expects a predicate.

     public List<User> process(Predicate<User> filter) {
    return userRepository.findAll().stream()
                         .filter(filter)
                         .collect(Collectors.toList());
}
*/
}
