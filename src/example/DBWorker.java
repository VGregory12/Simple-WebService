package example;

import java.sql.*;

public class DBWorker {

    private static Connection connection;

    public static void connect() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "sys as sysdba";
        String password = "sys";
        connection = DriverManager.getConnection(url, username, password);
    }

    public static Answer showPerson(Integer pid) throws SQLException {
//        if (connection != null) {
            String sql = "SELECT * FROM AGAT.MYPERSONS WHERE PID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pid);
            ResultSet resultSet = preparedStatement.executeQuery();
            Answer answer = new Answer();
            if (resultSet.next() != false) {
                answer.setPid(resultSet.getInt(1));
                answer.setSurname(resultSet.getString(2));
                answer.setName(resultSet.getString(3));
                return answer;
            } else {
                return null;
            }
        }
    }

