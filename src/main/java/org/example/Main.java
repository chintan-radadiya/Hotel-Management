package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/hotel_db";
        String username = "root";
        String password = "Chintan@2003";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("**********-- WELCOME TO HOTEL MANAGEMENT SYSTEM --************");
                System.out.println();

                menu.menu();
                System.out.println("---------------------------------");
                System.out.print("Choose your option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        reserveRoom.reserveRoom(statement, sc);
                        break;
                    case 2:
                        view.viewReservations(statement);
                        break;
                    case 3:
                        roomNumber.getRoom(statement, sc);
                        break;
                    case 4:
                        Update.updateDetails(statement, sc);
                        break;
                    case 5:
                        Deletion.delete(statement, sc);
                        break;
                    case 0:
                        shut.exit();
                        return;

                    default:
                        System.out.println("Invalid Choice!!!");
                }
            }
        } catch (InputMismatchException | SQLException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
