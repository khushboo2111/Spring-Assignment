package trainingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jdbc {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainer_sessions?user=root&password=Finalstep@2111");
            Set<Trainer> trainers = new HashSet<>();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT sessions.trainer_id, sessions.session_name " +
                    "FROM sessions " +
                    "INNER JOIN trainer ON sessions.trainer_id = trainer.trainer_id");
            
            while (rs.next()) {
                int trainerId = rs.getInt("trainer_id");
                String sessionName = rs.getString("session_name");

                // Check if the trainer is already in the set
                Trainer tr = null;
                for (Trainer trainer : trainers) {
                    if (trainer.getTrainer_id() == trainerId) {
                        tr = trainer;
                        break;
                    }
                }

                // If trainer is not in the set, create a new Trainer object and add it to the set
                if (tr == null) {
                    List<String> sessions = new ArrayList<>();
                    sessions.add(sessionName);
                    tr = new Trainer(trainerId, sessions);
                    trainers.add(tr);
                } else {
                    tr.getSessions().add(sessionName);
                }
            }

            // Printing trainers
            for (Trainer trainer : trainers) {
                System.out.println("Trainer ID: " + trainer.getTrainer_id());
                System.out.println("Sessions: " + trainer.getSessions());
            }

            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
