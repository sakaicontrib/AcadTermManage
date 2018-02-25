package net.stellers.sakai.academicsessionadmin.dao;

import java.util.List;

import org.sakaiproject.coursemanagement.api.AcademicSession;
import org.sakaiproject.site.api.Site;

import net.stellers.sakai.academicsessionadmin.exceptions.DuplicateKeyException;
import net.stellers.sakai.academicsessionadmin.model.Semester;

public interface AcademicSessionDao {

	public AcademicSession getAcademicSession(String eid);
	
	public List<AcademicSession> getAcademicSessions();
		
	public List<AcademicSession> getCurrentSessions();

	public void setCurrentSessions(List<String>eids);
	
	public AcademicSession addAcademicSession(Semester t) throws DuplicateKeyException;
	
	public void removeAcademicSession(String eid);
	
	public void updateAcademicSession(AcademicSession session);

	public List<Site> getSitesForTerm (String termEID);

	public Site getSite(String siteID);
	
	public boolean  saveSite(Site site);

}
