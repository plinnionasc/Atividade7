import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserir {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "b8aofmd8";

    private static final String INSERT_USERS_SQL = "INSERT INTO" +
            " Livro(id_isbn, id_categoria, id_editora, " + "mn_titulo,vl_preco) " +
            "VALUES " + " (?, ?, ?, ?, ?);";

    public Inserir (String id_isbn, int id_categoria, int id_editora, String nm_titulo, Double vl_preco)
        throws SQLException

        System.out.println ( INSERT_USERS_SQL);

    try (Connection connection = DriverManager.getConnection(url, user, password));

    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)
}
                    preparedStatement.setInt(1, id_isbn);
                    preparedStatement.setInt(2, id_categoria);
                    preparedStatement.setInt(3, id_editora);
                    preparedStatement.setInt(4, nm_titulo);
                    preparedStatement.setInt(5, vl_preco);

                            System.out.println(preparedStatement);
                            // Step 3: Execute the query or update query
                            preparedStatement.executeUpdate();
                            } catch (SQLException e) {

                            }
                            // print SQL exception information
                            printSQLException(e);
                            }

                            // Step 4: try-with-resource statement will auto close the connection.
                            }

public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
        if (e instanceof SQLException) {
        e.printStackTrace(System.err);
        System.err.println("SQLState: " + ((SQLException) e).getSQLState());
        System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
        System.err.println("Message: " + e.getMessage());
        Throwable t = ex.getCause();
        while (t != null) {
        System.out.println("Cause: " + t);
        t = t.getCause();
        }
        }
        }
        }
