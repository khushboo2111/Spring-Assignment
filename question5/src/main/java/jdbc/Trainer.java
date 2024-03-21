package jdbc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Trainer {

	private int trainer_id;
	private String session_name;
	public List<String> sessions = new ArrayList<>();
	public int getTrainer_id() {
		return trainer_id;
	}
	public Trainer(int trainer_id, List<String> sessions) {
		super();
		this.trainer_id = trainer_id;
		this.session_name = session_name;
		this.sessions = (List<String>) sessions;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getSession_name() {
		return session_name;
	}
	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}
	public List<String> getSessions() {
		return sessions;
	}
	public void setSessions(HashSet<String> sessions) {
		this.sessions = (List<String>) sessions;
	}
	
	
	
	
	
}
