public class PreSchool
{
	String name;
	String race;
	int age;

	public PreSchool()
	{
		name = " ";
		race = " ";
		age = 0;
	}

	public PreSchool(String n, String r, int a)
	{
		name = n;
		race = r;
		age = a;
	}

	public void setData(String na, String ra, int ag)
	{
		name = na;
		race = ra;
		age = ag;
	}
	
	public String getName() {return name;}
	public String getRace() {return race;}
	public int getAge() {return age;}

	public String toString()
	{
		return "\nName: " + name +
               " Race: " + race +
               " Age: " + age;
	}
}
