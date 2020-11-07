/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagit
 */
class User
{
    private int sno;
    private String name;
    private String address;
    private String gender;
    private String knowledge;
    private String subject;
    private byte [] picture;
    private String date;

    public User( int sno, String name, String address, String gender, String knowledge, String subject, byte [] image, String date)
    {
        this.sno = sno;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
        this.subject = subject;
        this.picture = image;
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }

    public byte[] getPicture()
    {
        return picture;
    }

    public int getSno()
    {
        return sno;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getGender()
    {
        return gender;
    }

    public String getKnowledge()
    {
        return knowledge;
    }

    public String getSubject()
    {
        return subject;
    }
    
}
