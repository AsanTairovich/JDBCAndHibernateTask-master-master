package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
       // Util.connection().close();
       // userDaoJdbc.createUsersTable();
        userDaoJdbc.saveUser("Asan","Tairov",(byte) 23);
        userDaoJdbc.saveUser("Uson","Kamylov",(byte) 23);
        userDaoJdbc.saveUser("Malika","Moloshova",(byte) 16);
        userDaoJdbc.saveUser("Bakyt","Latipov",(byte) 22);
        userDaoJdbc.saveUser("Nurisa","Jarmamat kyzy",(byte) 20);
//        userDaoJdbc.removeUserById(4);
        //userDaoJdbc.dropUsersTable();
        //userDaoJdbc.getAllUsers();

    }
}
