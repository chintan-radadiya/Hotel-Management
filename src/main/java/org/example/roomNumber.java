package org.example;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;

public class roomNumber {
    public static void getRoom(Statement statement, Scanner sc)throws SQLException{

        try{
        System.out.println();
        System.out.print("Enter Guest ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Guest Name: ");
        String name = sc.next();
        sc.nextLine();

        String query = "SELECT room_number from reservations WHERE guest_id = '"+id+"' AND guest_name = '"+name+"'";

        ResultSet resultset = statement.executeQuery(query);

            while(resultset.next()){
                System.out.print("Room no. is: " + resultset.getInt("room_number"));
            }

            resultset.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
