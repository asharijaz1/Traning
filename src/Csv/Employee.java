package Csv;

public class Employee {

private int id;
private String name;
private String role;
private String salary;
public int getID()
{
return id ;
}
public void setId(int id)
{
this.id=id;
}
public String getname()
{
return name;	
}
public void setName(String name)
{
this.name=name;
}
public String getRole()
{
return role;
}
public void setRole(String role)
{
this.role=role;	
}
public String getSalary()
{
return salary;
}
public void setSalary(String salary)
{
this.salary=salary;	
}
public String toString()
{
	return "\nID="+getID()+"::Name"+getname()+"::Role="+getRole()+"::Salary="+getSalary();

}


}