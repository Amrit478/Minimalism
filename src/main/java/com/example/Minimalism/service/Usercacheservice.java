

@Service
  public class Usercacheservice{

@Autowired
    UserService userservice;//Repsoitory for methods

@Cacheable(value = "User", key = "#id")
    public balance getbalance(int id) {
      System.out.println("Total balance is" + id);
      return UserRepository.findById(id).orElse(null);
    }
    @CachePut(value = "User", key = "#user.id")
    public Employee updateEmployee(Userservice userservice) {
        System.out.println("Update the record with id : " + userservice.getId());
        return UserRepository.save(employee);
    }

    @CacheEvict(value = "User", key = "#id")
    public void deleteEmployee(int id) {
        System.out.println("Delete the record with id : " + id);
        UserRepository.deleteById(id);
    }
}
