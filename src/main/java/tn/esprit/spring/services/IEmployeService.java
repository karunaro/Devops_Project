package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.dtoEntities.EmployeDTo;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;


public interface IEmployeService {
	
	public Employe authenticate(String login, String password) ;
	public void mettreAjourEmailByEmployeId(String email, int employeId);
	public void affecterEmployeADepartement(int employeId, int depId);
	public void desaffecterEmployeDuDepartement(int employeId, int depId);
	public String getEmployePrenomById(int employeId);
	public void deleteEmployeById(int employeId);
	public int getNombreEmployeJPQL();
	public List<String> getAllEmployeNamesJPQL();
	public List<Employe> getAllEmployeByEntreprise(Entreprise entreprise);
	public void mettreAjourEmailByEmployeIdJPQL(String email, int employeId);
	public float getSalaireByEmployeIdJPQL(int employeId);
	public Double getSalaireMoyenByDepartementId(int departementId);
	public List<Employe> getAllEmployes();
	public List<Timesheet> getTimesheetsByMissionAndDate(Employe employe, Mission mission, 
	Date dateDebut, Date dateFin);
	Integer addOrUpdateEmploye(EmployeDTo employe);
	
	
	

	
}
