package org.example;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class reserveRoom {
    public static void reserveRoom(Statement statement,Scanner sc) throws SQLException{


            System.out.print("Enter Geust Name: ");
            String name = sc.next();
            sc.nextLine();

            System.out.print("Enter Guest Mobile Number: ");
            int mobile = sc.nextInt();
            sc.nextLine();

            System.out.print("Allocate a room to guest: ");
            int roomNo = sc.nextInt();
            sc.nextLine();

            String query = "Insert into reservations (guest_name,contact,room_number) VALUES ('"+name+"',"+mobile+", "+roomNo+" )";

            try{
                int row = 0;
                row = statement.executeUpdate(query);

                if(row >0){
                    System.out.println("Insertion successful!!!");
                }else{
                    System.out.println("Insertion failed!!");
                }

            }catch(SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
