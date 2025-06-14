package com.example.Minimalism.service;

public class Hybirdcode {
    /*@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor-based dependency injection (recommended)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Use Predicate<User> for filtering, return filtered list
    public List<User> process(Predicate<User> filter) {
        return userRepository.findAll().stream()
                             .filter(filter)
                             .collect(Collectors.toList());
    }
}


| Aspect               | Your Code Description                                                                                                                                                                                                                                                                                    | Notes / Best Practice                                                                                     |
| -------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| **Functional parts** | - Uses Java Stream API (`stream()`, `filter()`, `collect()`) <br> - Accepts a `Predicate<User>` functional interface to define filtering behavior <br> - Returns a new filtered collection without side effects                                                                                          | This is good functional style: declarative, immutable transformations, higher-order functions             |
| **Imperative parts** | - The class (`UserService`) and method structure <br> - Explicit constructor and field assignment <br> - Calling `userRepository.findAll()` is a direct data-fetching imperative call                                                                                                                    | Standard OOP and imperative control flow; normal for Spring services and method structure                 |
| **Best practice**    | - Constructor injection is preferred over field injection <br> - Filtering at Java level is fine for small datasets but can be inefficient for large datasets <br> - Null check for `Predicate` can be added <br> - Consider pushing filtering to DB via query methods or specifications for scalability | Your code is mostly good; optimizing data fetch and safety checks will improve robustness and performance |
*/
}
