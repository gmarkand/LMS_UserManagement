package io.lms.usermanagementservice.model;

import javax.persistence.*;

@Entity
public class LMSUser
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String password;   // Todo :- Make it to encrypted..
    private boolean admin = false;
    private boolean disabled = false;
    private boolean removable = false;
    private boolean editable = true;
    private String m_notes = "";
    private String m_fullName = "";
    private String m_email = "";
    private String m_phoneNumber = "";
    private String adhaarNumber;
    private boolean author = false;

    public LMSUser()
    {

    }

    public LMSUser(String name, String password, boolean admin, boolean disabled, boolean removable, boolean editable, String m_notes, String m_fullName, String m_email, String m_phoneNumber, String adhaarNumber, boolean author)
    {
        this.name = name;
        this.password = password;
        this.admin = admin;
        this.disabled = disabled;
        this.removable = removable;
        this.editable = editable;
        this.m_notes = m_notes;
        this.m_fullName = m_fullName;
        this.m_email = m_email;
        this.m_phoneNumber = m_phoneNumber;
        this.adhaarNumber = adhaarNumber;
        this.author = author;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isAdmin()
    {
        return admin;
    }

    public void setAdmin(boolean admin)
    {
        this.admin = admin;
    }

    public boolean isDisabled()
    {
        return disabled;
    }

    public void setDisabled(boolean disabled)
    {
        this.disabled = disabled;
    }

    public boolean isRemovable()
    {
        return removable;
    }

    public void setRemovable(boolean removable)
    {
        this.removable = removable;
    }

    public boolean isEditable()
    {
        return editable;
    }

    public void setEditable(boolean editable)
    {
        this.editable = editable;
    }

    public String getM_notes()
    {
        return m_notes;
    }

    public void setM_notes(String m_notes)
    {
        this.m_notes = m_notes;
    }

    public String getM_fullName()
    {
        return m_fullName;
    }

    public void setM_fullName(String m_fullName)
    {
        this.m_fullName = m_fullName;
    }

    public String getM_email()
    {
        return m_email;
    }

    public void setM_email(String m_email)
    {
        this.m_email = m_email;
    }

    public String getM_phoneNumber()
    {
        return m_phoneNumber;
    }

    public void setM_phoneNumber(String m_phoneNumber)
    {
        this.m_phoneNumber = m_phoneNumber;
    }

    public String getAdhaarNumber()
    {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber)
    {
        this.adhaarNumber = adhaarNumber;
    }

    public boolean isAuthor()
    {
        return author;
    }

    public void setAuthor(boolean author)
    {
        this.author = author;
    }
}