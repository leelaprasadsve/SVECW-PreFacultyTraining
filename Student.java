public class Student extends Person
{
public String program;
public int year;
public double fee;
public Student(String name,String address,String program,int year,double fee)
{
super(name,address);
setProgram(program);
setYear(year);
setFee(fee);
}
public String getProgram()
{ return program; }
public void setProgram(String program)
{ this.program=program; }
public int getYear()
{ return year; }
public void setYear(int myear)
{ year=myear; }
public double getFee()
{ return fee; }
public void setFee(double mfee)
{fee=mfee; }
public String toString()
{ return name+address+program+year+fee; }
}
