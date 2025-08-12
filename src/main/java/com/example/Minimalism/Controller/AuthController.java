

@RestController
  @RequestMapping("/api/auth")
  public class AuthController{
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserRepository userRepository;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    PasswordEncoder encoder;

@PostMapping("/signin")
    public String authenticateUser(@RequestBody User user) {
      Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
          user.getUsername(),
          user.getPassword()
          )
        );
      UserDetails userDetails = (UserDetails) authentication.getPrincipal();
      return jwtUtils.generateToken(userDetails.getUsername())

        @PostMapping("/signup")
        public String registerUser(@RequestBody User user) {
        if(userRepository.existsByUsername(user.getUsername())) {
        }
        return "Error: Username is already taken!"; 
      }
      //Create new user's account
    User newUser = new User(
      null,
      user.getUsername(),
      encoder.encode(user.getPassword())
      );
      userRepository.save(newUser);
      return "user registered successfully!";
    }
  }
