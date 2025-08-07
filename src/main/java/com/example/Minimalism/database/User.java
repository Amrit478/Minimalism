/*This is my authorization and authentication with JWT Tokens.

This code is taken from this website

https://medium.com/@victoronu/implementing-jwt-authentication-in-a-simple-spring-boot-application-with-java-b3135dbdb17b*/

public class User{
  @Getter
  @Setter
  @Entity
  @NoArgsConstructor
  @AllArgsConstructor
  //I will also provide the above 4 things like getter, setter including no arg and all args consturctor down below and with the help of AI i will fix it
  @Table(name= "User")
  @Id
  @GENERATEDVALUE(startegy = GenerationType.AUTO)
  private Long id;
  @Coloumn(Not null, Unique = true)
  private String username;
  private String password;

  public User(){}

  public User(String username, String password){
    this.username = username;
    this.password = password;
  }

  public String GetUsername(){
    this.username = username;
  }
  public void setUserName(String Username){
    this.username = username;
  }
    public String GetPassword(){
    this.password = password;
  }
  public void setPassword(String password){
    this.password = password;
  }
}

//Need to check every day home whatever I have implemented here
