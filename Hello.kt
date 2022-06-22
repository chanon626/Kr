import java.sql.*

fun main() {
    val connection = DriverManager.getConnection("jdbc:sqlite:Kt.db")
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT * FROM users")
    while (resultSet.next()) {
        println(resultSet.getString("name"))
    }
    
}
