import java.util.Arrays;
public class NameSort
{
public static void main(String[] args)
{
System.out.println("Enter 10 names");
String[] names={"john","om","arya","yash","raj","suraj","ketaki","vijay","viraj","prasad"};
Arrays.sort(names);
System.out.println("Alphabetical sorted names");
for(String name : names)
{
System.out.println(name);
}
}
}
