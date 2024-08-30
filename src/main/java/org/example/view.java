package org.example;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class view {
    public static void viewReservations( Statement statement) throws SQLException{

        String query = "SELECT * FROM reservations";

        ResultSet resultset = statement.executeQuery(query);

        try{
            while(resultset.next()){
                int Id = resultset.getInt("guest_id");
                String name = resultset.getString("guest_name");
                int room = resultset.getInt("room_number");
                String contact = resultset.getString("contact");
                String resv_date = resultset.getTimestamp("reservation_date").toString();

                System.out.println("************************");
                System.out.println("Guest_ID : " + Id);
                System.out.println("Guest_name : " + name);
                System.out.println("Guest_room : " + room);
                System.out.println("Guest_contact : " + contact);
                System.out.println("Date of Booking : " + resv_date);
                System.out.println("************************");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        resultset.close();


    }
}