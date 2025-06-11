package com.example.Minimalism.Repositores;

import com.example.Minimalism.database.connectivity;

/*I do not have to add functional interface here but i
* still do it just for extra clear*/
@FunctionalInterface
public interface deleteuser {
    void delete(connectivity user);
}
