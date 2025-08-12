

@Configuration
  publi class WebSecurityConfig{
  @Autowired
  CustomUserDetailsService userDetailsService;
  @Autowired
  private AuthEntryPointJwt unauthorizedHandler;
  @Bean
  public AuthTokenFilter authenticationJwtTokenFilter() {
    return new AuthTokenFilter();
  }
  @Bean
  public AuthenticationManager authenticationmanager(
    AuthenticationConfiguration authenticationConfiguration
    ) throws Exception {
    return authentictionConfiguration.getAuthenticationManager();
    }
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    //Updated congiguration for spring Security
    http
      .csrf(csrf -> csrf.disable())//Disable csrf
      .cors(cors -> cors.disable())//Disable cors(or configure if needed)
      .exceptionHandling(exectionHandling -> exceptionHandling.authenticationEntryPoint(unauthorizedHnadler)
                        )
      .sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                         )
      .authorizeHttpRequests(authorizeRequests -> authorizeRequests
                             .requestMatchers("/api/auth/**", "/api/test/all").permitAll
                             .anyRequest().authenticated());
    //Add the JWT Token filter before the UsenamePasswordAuthenticationFilter
    http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    return http.build();
  }
  }
