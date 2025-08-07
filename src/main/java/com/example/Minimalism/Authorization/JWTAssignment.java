/*JWT Assignment and Request Authorization:
After the JWT is generated, it will be returned to the client application.
For all subsequent requests to protected REST API endpoints, the client application will include this JWT, typically in the Authorization header using the Bearer scheme (e.g., Authorization: Bearer <your_jwt_token>).
The server-side API will intercept these requests and validate the provided JWT. This validation involves:
Verifying the token's signature to ensure it hasn't been tampered with.
Checking the token's expiration time to ensure it is still valid.
Optionally, verifying other claims within the token to enforce specific authorization rules (e.g., checking if the user has the necessary permissions to access the requested resource).*/
