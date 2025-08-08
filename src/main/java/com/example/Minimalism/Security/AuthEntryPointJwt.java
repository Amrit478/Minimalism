
@Component
public class AuthEntryPointJwt implemets AuthenticationEntyPoint{

  @Override
    public void commence(
    HttpServerletRequest request,
    HttpServerletResponse respones,
    AuthenticationException AuthExcep
    )
    throws IOException{
    response.sendError(HttpServerletResponse.SC_UNAUTHORIZED, "Error: Unauthorized access")
    }
    }
