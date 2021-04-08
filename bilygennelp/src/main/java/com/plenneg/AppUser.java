package com.plenneg;

public class AppUser
{
   private String userName;
    private String userEmail;
    private String userPassword;
    private String userRole;
    private String userCell;
    private String userApplication;
    
    public AppUser()
    {
    }
    
    public AppUser(String userName, String userEmail, String userPassword, String userRole, String userCell, String userApplication)
    {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userCell = userCell;
        this.userApplication = userApplication;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getUserEmail()
    {
        return userEmail;
    }
    
    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }
    
    public String getUserPassword()
    {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    
    public String getUserRole()
    {
        return userRole;
    }
    
    public void setUserRole(String userRole)
    {
        this.userRole = userRole;
    }
    
    public String getUserCell()
    {
        return userCell;
    }
    
    public void setUserCell(String userCell)
    {
        this.userCell = userCell;
    }
    
    public String getUserApplication()
    {
        return userApplication;
    }
    
    public void setUserApplication(String userApplication)
    {
        this.userApplication = userApplication;
    }
    
    @Override
    public String toString()
    {
        return "{\"AppUser\":{"
                + "\"userName\":\"" + userName + "\""
                + ", \"userEmail\":\"" + userEmail + "\""
                + ", \"userPassword\":\"" + userPassword + "\""
                + ", \"userRole\":\"" + userRole + "\""
                + ", \"userCell\":\"" + userCell + "\""
                + ", \"userApplication\":\"" + userApplication + "\""
                + "}"
                + "}";
    }
}//End of AppUser
