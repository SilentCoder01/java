class copy{
String name;
int id;
copy(String name, int id)
{
this.name=name;
this.id=id;
}
copy(copy obj2 )
{
this.name= obj2.name;
this.id=obj2.id;
}
}
class copycons
{
public static void main(String args[])
{
System.out.println("First  object");

copy c1=new copy("mmantc",1726);

System.out.println("Name:"+c1.name+"\n Id:"+c1.id);
System.out.println("Copy Constructor second object ");

copy c2=new copy(c1);




System.out.println("Name:"+c2.name+"\n Id:"+c2.id);

}
}
