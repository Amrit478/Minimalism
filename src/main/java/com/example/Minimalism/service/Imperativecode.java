package com.example.Minimalism.service;


/*This is my service class where i will logic for the program and i will be using Repositories
* and accesing database connectivity class and making changes into the database*/

/*Will use constructor here for imperative programming and will be using the autowired annotation
to implement other classes dependencies here as well
 */
public class differentlogicforfunctionalprogramming {

    //This is an example of constructor autowired injection and it is The code you're showing is a hybrid
//    @Service
//    public class UserService {
//
//        private final UserRepository userRepository;
//
//        public UserService(UserRepository userRepository) {
//            this.userRepository = userRepository;
//        }
//
//        public void process(Function<User, Boolean> filter) {
//            userRepository.findAll().stream().filter(filter::apply).toList();
//        }
//    }

}

/*2. Purely Imperative Version

Here we avoid streams and lambdas; use loops and mutable state explicitly:
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> process(Predicate<User> filter) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            if (filter.test(user)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
*/