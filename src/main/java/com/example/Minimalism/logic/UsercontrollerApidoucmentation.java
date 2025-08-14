//Link for the website where the article was - https://medium.com/javaguides/generate-rest-api-documentation-for-spring-boot-project-using-swagger-996e48fe0cea
@CrossOrigin("*")
  @RestController
  @RequestMapping("/api/users")
  @Tag(name = "User Management", description = "API for managing Users")
public class UsercontrollerApidoucmentation{

  private final UserService userService;
  public UserController(UserService userService) {
    this.userService = userService;
  }
 @Operation(summary = "Create a new user", description = "Add a new user to the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User created successfully",
                    content = @Content(schema = @Schema(implementation = UserDto.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.createUser(userDto));
    }

    @Operation(summary = "Get user by ID", description = "Retrieve a user's details using their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found",
                    content = @Content(schema = @Schema(implementation = UserDto.class))),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content(schema = @Schema()))
    })
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @Operation(summary = "Get all users", description = "Retrieve a list of all users in the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Users retrieved successfully",
                    content = @Content(schema = @Schema(implementation = UserDto.class)))
    })
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @Operation(summary = "Update a user", description = "Update an existing user's details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated successfully",
                    content = @Content(schema = @Schema(implementation = UserDto.class))),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content(schema = @Schema()))
    })
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.updateUser(id, userDto));
    }

    @Operation(summary = "Delete a user", description = "Delete a user from the system using their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "User deleted successfully"),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content(schema = @Schema()))
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
