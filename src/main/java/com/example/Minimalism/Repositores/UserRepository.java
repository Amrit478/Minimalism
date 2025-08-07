/*Need to fix this one as well according to my authorization requirements*/

@Repository
public class UserRepositoy extends JpaRepository<User, Long>{
  User findbyName(String username);
  boolean existsbyusername(String username);
}
