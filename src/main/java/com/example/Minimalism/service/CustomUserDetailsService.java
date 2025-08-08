

@Service
public class CustomUserDetailsService implemets userDetailsService{
  @Autowired
    private UserRepository userrepository;

  @Override
    public userdetails loadUserByUsername(String username)throws UsernotFound }
    User user = userRepository.findByUsername(username);
if(user == null){
  throw new UsernameNotFoundException("No Username Given");
}
return new org.springframework.security.core.userdetails.User(
  user.getUsername(),
  user.getPassword(),
  Collections.EmptyList();
);
}
}

/*Need to understand why I build this class and how can i work on it make better and especalliy how
  return part in this class works here and I need to add all the dependices yet*/
