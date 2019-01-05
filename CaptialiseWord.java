package program;

class StringForm
{
	static String Capatialise(String st)
	{
		String[] word=st.split("\\s");
		String capitalise="";
		for (String s:word)
		{
			String first=s.substring(0, 1);
			String after=s.substring(1);
			capitalise+=first.toUpperCase()+after+" ";
			
			
		}
		return capitalise.trim();
		
		
	}
}


public class CaptialiseWord 
{

	public static void main(String[] args)
	{
	System.out.println(StringForm.Capatialise("hi surya prasanth"));
	}

}
