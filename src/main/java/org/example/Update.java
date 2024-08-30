package org.example;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

    public class Update {
        public static void updateDetails(Statement statement, Scanner sc)throws SQLException{

            try{
                System.out.println();

                System.out.print("Enter Guest ID: ");
                int id = sc.nextInt();
                System.out.println("Enter Details for Update: ");

                System.out.print("Enter New Guest Name: ");
                String name = sc.next();


                sc.nextLine();System.out.print("Enter New Contact: ");
                long contact = sc.nextInt();

                System.out.print("Enter New Room No: ");
                int room = sc.nextInt();

                String query = "Update reservations " +
                        "SET guest_name = '"+name+"'" +
                        ",contact = '"+contact+"',"+
                        "room_number = '"+room+"'";

                int row = 0;

                row = statement.executeUpdate(query);

                if(row > 0){
                    System.out.println("Updation Successfull!!");
                }else{
                    System.out.println("Updation Failed!!!");
                }

            }catch(SQLException e){
                System.out.println(e.getMessage());
        }

    }

}
