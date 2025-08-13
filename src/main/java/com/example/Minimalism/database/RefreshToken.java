
/*This file is going to build by me and where i will put how the user gets refresh token so he does not logout from the system and it keeps working 
and everytime user gets new token whenver he is the system so our endpoints stay secured but user can still be in the system*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
  @Entity
  public class RefreshToken{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@OnetoOne
    @Joincolumn(name = "user_id", refrencedColumnname = "id")
    private User user;

@Column(nullable = false, unique = true)
    private String token;

@Column(nullable = false)
    private Instant expiryDate;
