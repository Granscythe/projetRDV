package sopra.formation.model;

import javax.persistence.Entity;

@Entity
public class Admin  extends Personne{

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, int version, String mail, String mdp) {
		super(id, version, mail, mdp);
		// TODO Auto-generated constructor stub
	}

}
