package ArrayProblems;

public class Frequency {

	public static void main(String[] args) {

		String str = "abhilash";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;
			if (ch[i] != '\0')
			{
				for (int j = i + 1; j < ch.length; j++)
				{

					if (ch[i] == ch[j])
					{
						count++;
						ch[j] = '\0';
					}
				}

				System.out.print(ch[i] + "=" +count +" ");
//				System.out.print(ch[i]);
			}
		}

	}

}