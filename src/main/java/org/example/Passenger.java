package org.example;


public class Passenger {
    private String Title;
    private String First_Name;
    private String Last_Name;
    private int Age;
    private String ID_Code;
    public Passenger() {
    }

    public Passenger(String Title, String First_Name, String Last_Name, int Age, String ID_Code) {
        this.Title= Title;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Age = Age;
        this.ID_Code = ID_Code;

    }
      public String getTitle(){return Title;}

    public void setTitle(String Title){this.Title = Title;}

    public String getFirst_Name(){return First_Name;}

    public void setFirst_Name(String First_Name){this.First_Name = First_Name;}

    public String getLast_Name(){return Last_Name;}

    public void setLast_Name(String Last_Name){this.Last_Name = Last_Name;}

    public int getAge(){return Age;}

    public void setAge(String Age){this.Title = Age;}

    public String getID_Code(){return ID_Code;}

    public void setID_Code(String ID_Code){this.ID_Code = ID_Code;}

        }
