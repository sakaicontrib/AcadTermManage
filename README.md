# AcadTermManage / term-admin
An UI to manage Academic Terms, so it doesn't need to happen via SQL or WebServices.

It supports the creation of new terms and updated of existing terms.

It will also update the "term_eid" and "term_title" site properties if one of them has been updated.

It currently does NOT support the deletion of terms (in the UI), because it's unclear what should happen to site properties and/or sites which reference a deleted term (Do nothing? Delete the now outdated site properties? Delete the sites?)  

In theory, editing terms (and access to the tool) should be limited to sakai admins AND users who have the permission/function "term-admin.is\_manager" in the site where the tool is installed. 
In practice, the course management API, which is used by this tool, requires users to be sakai admins (instead of checking the user's permissions), so adding that permission and checking it is currently disabled via the boolean net.stellers.sakai.academicsessionadmin.logic.impl.AcademicSessionLogicImpl.USE_PERMISSION  


![screenshot](/screenshot_tool_w640.png?raw=true "term-admin-tool screenshot")