/*Need to understand this class because this is copy paste from my computer..

and this class using @Value annotation means it will get its properties from application.yml and */

@Component
public class JwtUtil{
  @Value("{jwt.secret}")
  private String jwtSecret;
  @Value("{jwt.expiration}")
  private int expirationMs;
  private SecretKey Key;

  @PostConstruct
  public void init(){
    this.key = Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF-8))
  }
//Generate Jwt token
  public String generateToken(String username){
    return Jwts.builder()
      .setSubject(username)
      .setIssuedAt(new Date())
      .setExpiration(new Date((new Date()).getTime() + expirationMs
      .signWith(key, SignatureAlgorithm.HS256)
      .compact();
  }
  //Get username from JWT Token
  public String getUsernameFromToken(String token){
    return Jwts.parserBuilder()
      .setSigningKey(Key).build()
      .parseClaimsJws(token)
      .getBody()
      .getSubject();
  }

  //Validate JWT Token
  public boolean ValidateJwtToken(String token){
    try{
      Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
      return true;
    }
   catch (SecurityException e) {
            System.out.println("Invalid JWT signature: " + e.getMessage());
        } catch (MalformedJwtException e) {
            System.out.println("Invalid JWT token: " + e.getMessage());
        } catch (ExpiredJwtException e) {
            System.out.println("JWT token is expired: " + e.getMessage());
        } catch (UnsupportedJwtException e) {
            System.out.println("JWT token is unsupported: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("JWT claims string is empty: " + e.getMessage());
        }
        return false;
    }
    }
  }
}
