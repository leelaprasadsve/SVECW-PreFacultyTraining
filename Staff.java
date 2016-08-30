public class Staff extends Person
{
public String school;
public double pay;
public Staff(String name,String address,String school,double pay)
{
super(name,address);
setSchool(school);
setPay(pay);
}
public String getSchool()
{ return school; }
public void setSchool(String mschool)
{
school=mschool; }
public double getPay()
{ return pay; }
public void setPay(double mpay)
{ pay=mpay; }
public String toString()
{ return name+address+school+pay; }
}
