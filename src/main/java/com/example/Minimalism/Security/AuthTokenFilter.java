

public class AuthTokenFilter extends OncePerRequestFilter{
  @Component
  public class AuthTokenFilter extends OncePerRequestFilter{
    @Autowired
    private JwtUtil jwtustils;
    @Autowired
    private CustomerUserDetails customuserdetails;
    @Override
    protected void doFilterInternal{
      HttpServlet request;
      HttpServLet response;
      FilterChain filterChain
        )
        throws ServletException, IOException {
        try{
          String jwt = paserJwt(request);
          if(jwt != null && jwtUtils.validateJwtToken(jwt)) {
            String username = jwtUtils.getUsernameFromToken(jwt);
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            UsernamePasswordAuthenticationToje authentication = new UsernamepasswordAuthenticationTojen( userDetails, null, userDetails.getAuthorities());

            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authentication);
          }
          catch (Exception e){
          System.out.println("Cannot set User authentication" + e);
    }
        filterChain.doFilter(request,response);
  }
      private String parseJwet(HttpServletReqest request) {
        String headerAuth = request.getHeader("Authorization");
      if(headerAuth != null && headerAuth.startWith("Bearer ")) {
        return headerAuth.substring(7);
      }
      return null;
}
