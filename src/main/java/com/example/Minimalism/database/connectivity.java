package com.example.Minimalism.database;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.Query;

public class connectivity {
    /*In this i will make the quries of database and when i am able to do that
    * succesfully than i will write a class for database connection and trying to
    * change the port in application.properties and do more operations in that whatever
    * i have written in the notepad file which follows after it*

    I WILL CREATE NEW BRANCH FOR THIS AND THAN MERGE IT WHEN I AM DONE AND
    * THIS WAY MY LEARNING WITH GITHUB IS GET BETTER AND I NEED TO ALSO WRITE
    * A GITHUB ACTIONS FOLDER BEFORE THAT HAPPENS


    I HAVE CREATED THE NEW BRANCH ABOVE AND NOW I WILL TRY TO MERGE THIS BRANCH TO
    MASTER BRANCH AND SEE HOW CAN I SOLVE IF ANY PROBLEMS ARRIVE

    AFTER DOING THAT FOR 2 DAYS I WILL MAKE ANOTHER SAME ERROR BUT HOWEVER THIS TIME
    GITHUB ACTIONS WILL BE THERE AND I WILL FIND OUT HOW MUCH DIFFERENCE WILL IT MAKE
     */
    private int userid;
    private String username;
    private double money;
    private double expense;
    private int cars;
    private boolean overdraft;

    public connectivity(int userid, String username, double money, double expense, int cars, boolean overdraft){
        this.userid = userid;
        this.username = username;
        this.money = money;
        this.expense = expense;
        this.cars = cars;
        this.overdraft = overdraft;
    }
}
