package org.example;

import java.util.Scanner;
import java.sql.Statement;
import java.sql.SQLException;

public class Deletion {
    public static void delete(Statement statement, Scanner sc) throws SQLException{

        try {
            System.out.println();
            System.out.print("Enter Guest_id: ");
            String id = sc.next();
            sc.nextLine();

            String query = "DELETE from reservations where guest_id = '"+id+"'";

            int row = statement.executeUpdate(query);
            if(row>0){
                System.out.println("Deletion Successfully!!!");
            }else{
                System.out.println("Deletion Failed!!!");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
