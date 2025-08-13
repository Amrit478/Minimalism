/*I will add Repository and database class here and access Database class using Repository and will
start creating token everytime the user time is about or logout or whenver they are sending a new request based on it*/

public class RefreshToken{
  @Value("${jwt.refreshExpirationMs}")
  private Long refreshTokenDurationMs;
  
  private final UserRepository userRepository;
  private final RefreshTokenRepository refreshtokenrepository;

  public RefreshToken(UserRepository user, RefreshTokenRepository repo){
    this.UserRepository = user;
    this.RefreshTokenRepository = repo;
  }

  //Methods for the logic will be implement here 
    public RefreshToken createRefreshToken(Long userId) {
        var token = new RefreshToken();
        token.setUser(userRepository.findById(userId).get());
        token.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
        token.setToken(UUID.randomUUID().toString());
        return refreshTokenRepository.save(token);
    }

    public boolean isTokenExpired(RefreshToken token) {
        return token.getExpiryDate().isBefore(Instant.now());
    }
}
