package com.example.Minimalism.Repositores;

import com.example.Minimalism.database.connectivity;

@FunctionalInterface
public interface userfind extends JpaRespository <RefreshToken, Long id> {
    void userfind(connectivity user);

    Optional<Refresh Token findByToken(String token); 
}


                    
