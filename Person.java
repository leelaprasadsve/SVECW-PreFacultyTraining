public class Person
{
public String name;
public String address;
public Person(String name,String address)
{
this.name=name;
setAddress(address);
}
public String getName()
{ return name; }
public String getAddress()
{ return address; }
public void setAddress(String newaddress)
{
address=newaddress;
}
public String toString()
{
return name+address;
}
}
