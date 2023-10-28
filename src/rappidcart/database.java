package rappidcart;

//import javax.swing.JFrame;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


public class database {
    
    //for sign up
    public void set_data_to_database_from_signUpPage(int serial_num, String first_name, String last_name, String user_name, int day, int month, int year, String gmail, String password, Boolean seller, Boolean client)
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            //set Data to database for seller
            if(seller){
                statement.execute("INSERT INTO `rappid_cart`.`login_signup_seller` (`serial_number`, `first_name`, `last_name`, `user_name`, `day`, `month`, `year`, `gmail`, `password`) VALUES ('"+serial_num+"', '"+first_name+"', '"+last_name+"', '"+user_name+"', '"+day+"', '"+month+"', '"+year+"', '"+gmail+"', '"+password+"');");
                statement.execute("INSERT INTO `rappid_cart`.`seller_profile` (`serial_number`, `first_name`, `last_name`, `user_name`, `day`, `month`, `year`, `gmail`, `password`) VALUES ('"+serial_num+"', '"+first_name+"', '"+last_name+"', '"+user_name+"', '"+day+"', '"+month+"', '"+year+"', '"+gmail+"', '"+password+"');");
            }
            
            //set Data to database for Client
            else if(client){
                statement.execute("INSERT INTO `rappid_cart`.`login_signup_client` (`serial_number`, `first_name`, `last_name`, `user_name`, `day`, `month`, `year`, `gmail`, `password`) VALUES ('"+serial_num+"', '"+first_name+"', '"+last_name+"', '"+user_name+"', '"+day+"', '"+month+"', '"+year+"', '"+gmail+"', '"+password+"');");
                //statement.execute("INSERT INTO `rappid_cart`.`client_profile` (`serial_number`, `first_name`, `last_name`, `user_name`, `day`, `month`, `year`, `gmail`, `password`) VALUES ('"+serial_num+"', '"+first_name+"', '"+last_name+"', '"+user_name+"', '"+day+"', '"+month+"', '"+year+"', '"+gmail+"', '"+password+"');");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //ck if there are multiple userName or gmale available or not while signUp
    public int check_userNameGmail(String userName, String Gmail, Boolean seller, Boolean client){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            int ck_UName = 0;
            int ck_Gmail = 0;
            int count = 1;
            
            ResultSet read_result = null;
            
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_seller;");
            } else if(client){
               read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_client;");
            }
            
            if(read_result == null){
                return count;
            }
            
            while(read_result.next()){
                if(read_result.getString("user_name").compareTo(userName) == 0){
                    ck_UName = 1;
                }
                if(read_result.getString("gmail").compareTo(Gmail) == 0){
                    ck_Gmail = 1;
                }
                count++;
            }
            
            if(ck_UName == 1 && ck_Gmail == 1){
                return -1;//means both UName & gmail are same
            } if(ck_UName == 1){
                return -2;//means UName is same
            } if(ck_Gmail == 1){
                return -3;//means gmail is same
            }
            
            return count;//No similarity found
        }
        
        catch (Exception e){
            e.printStackTrace();
            return 0;//No similarity found
        }
    }
    
    //for login check
    public Boolean check_usernameOrGmail_password(String usernameOrGmail, String password, Boolean seller, Boolean client){
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            ResultSet read_result = null;
            
            //data read
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_seller;");
            } else if(client){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_client;");
            }
            
            if(read_result == null){
                return false;
            }
            
            Boolean check_username_password = false;
            Boolean check_pass = false;
            
            while (read_result.next()) {
                if((read_result.getString("user_name").compareTo(usernameOrGmail)==0 || read_result.getString("gmail").compareTo(usernameOrGmail)==0) && read_result.getString("password").compareTo(password) == 0){
                    return true;
                }
            }
            
            return false;
            
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    //for save the username & password
    public void rememberMe(String userNameGmail, String password, Boolean seller, Boolean client){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
            
            Statement statement = connection.createStatement();
            
            ResultSet read_result = null;
            
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.remember_me_seller;");
            } else if(client){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.remember_me_client;");
            }
            
            if(read_result == null){
                return;
            }
            
            int count = 1;
            while(read_result.next()){
                if(read_result.getString("user_name_gmail").compareTo(userNameGmail)==0){
                    if(seller){
                        statement.execute("UPDATE `rappid_cart`.`remember_me_seller` SET `password` = '"+password+"' WHERE (`serial_number` = '"+count+"') and (`user_name_gmail` = '"+userNameGmail+"');");
                    } else if(client){
                        statement.execute("UPDATE `rappid_cart`.`remember_me_client` SET `password` = '"+password+"' WHERE (`serial_number` = '"+count+"') and (`user_name_gmail` = '"+userNameGmail+"');");
                    }
                    return;
                }
                count++;
            }
            
            //set Data to database for save username & pass(remember me) for SELLER & CLIENT respectively
            if(seller){
                statement.execute("INSERT INTO `rappid_cart`.`remember_me_seller` (`serial_number`, `user_name_gmail`, `password`) VALUES ('"+count+"', '"+userNameGmail+"', '"+password+"');");
            } else if(client){
                statement.execute("INSERT INTO `rappid_cart`.`remember_me_client` (`serial_number`, `user_name_gmail`, `password`) VALUES ('"+count+"', '"+userNameGmail+"', '"+password+"');");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    //for get the username & password
    public String get_password_rememberMe(String userNameGmail, Boolean seller, Boolean client){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
            
            Statement statement = connection.createStatement();
            
            ResultSet read_result = null;
            
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.remember_me_seller;");
            } else if(client){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.remember_me_client;");
            }
            
            if(read_result == null){
                return "-1";
            }
            
            while(read_result.next()){
                if(read_result.getString("user_name_gmail").compareTo(userNameGmail)==0){
                    return read_result.getString("password");
                }
            }
            return "-1";
        }
        catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }
    
    
    //for forgot password
    public Boolean check_usernameOrGmail_birthInfo_seller_client(String usernameOrGmail, int day, int month, int year, Boolean seller, Boolean client){
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            Boolean check_username = false;
            Boolean check_birthInfo = false;
            
            ResultSet read_result = null;
            
            //data read
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_seller;");
            }
            else if(client){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_client;");
            }
            
            if(read_result == null){
                return false;
            }
            
            while (read_result.next()) {
                if(read_result.getString("user_name").compareTo(usernameOrGmail)==0 || read_result.getString("gmail").compareTo(usernameOrGmail)==0){
                    check_username = true;
                }
                
                if(read_result.getInt("day") == day && read_result.getInt("month") == month && read_result.getInt("year") == year){
                    check_birthInfo = true;
                }
            }
            
            if(check_username && check_birthInfo){
                return true;
            }
            else{
                return false;
            }
            
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    //for newPassword_reset, replace password with new one
    public void replace_password(String usernameOrGmail, String newPassword, Boolean seller, Boolean client){
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            //data read
            ResultSet read_result = null;
            
            if(seller){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_seller;");
            }
            else if(client){
                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_client;");
            }
            
            if(read_result == null){
                return;
            }
            
            while (read_result.next()) {
                if(read_result.getString("user_name").compareTo(usernameOrGmail)==0 || read_result.getString("gmail").compareTo(usernameOrGmail)==0){
                    if(seller){
                        statement.execute("UPDATE `rappid_cart`.`login_signup_seller` SET `password` = '"+newPassword+"' WHERE (`user_name` = '"+usernameOrGmail+"') or (`gmail` = '"+usernameOrGmail+"');");
                    }
                    else if(client){
                        statement.execute("UPDATE `rappid_cart`.`login_signup_client` SET `password` = '"+newPassword+"' WHERE (`user_name` = '"+usernameOrGmail+"') or (`gmail` = '"+usernameOrGmail+"');");
                    }
                    
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
//    //this method show all info in seller dashboard cancelled
//    public void show_necessary_info_to_seller_dashboard(String userNameGmail, JFrame seller_dashboard_frame){
//        try{
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
//
//            Statement statement = connection.createStatement();
//            
//            ResultSet read_result = statement.executeQuery("SELECT * FROM rappid_cart.seller_dashboard;");
//            
//            while (read_result.next()) {
//                if(read_result.getString("user_name").compareTo(userNameGmail)==0 || read_result.getString("gmail").compareTo(userNameGmail)==0){
//                    seller_dashboard_frame.setVisible(false);
//                    
//                    
//                    break;
//                }
//            }
//            
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    
//    //copy signup table data to dashboard table //cancelled
//    public void copy_table_from_signup_to_dashboard(String userName, Boolean seller, Boolean client){
//        try
//        {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
//
//            Statement statement = connection.createStatement();
//            
//            //data read
//            ResultSet read_result = null;
//            
//            if(seller){
//                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_seller;");
//            }
//            else if(client){
//                read_result = statement.executeQuery("SELECT * FROM rappid_cart.login_signup_client;");
//            }
//            
//            while (read_result.next()) {
//                if(read_result.getString("user_name").compareTo(userName) == 0){
//                    if(seller){
//                        statement.execute("INSERT INTO seller_dashboard (serial_number, first_name, last_name, user_name, day, month, year, gmail, password) SELECT serial_number, first_name, last_name, user_name, day, month, year, gmail, password FROM login_signup_seller;");
//                    }
//                    else if(client){
//                        statement.execute("INSERT INTO client_dashboard (serial_number, first_name, last_name, user_name, day, month, year, gmail, password) SELECT serial_number, first_name, last_name, user_name, day, month, year, gmail, password FROM login_signup_client;");
//                    }
//                    
//                    break;
//                }
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    
}
