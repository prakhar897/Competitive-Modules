
class Utils{
	long computeHash(String s)
	{
		int p = 31;
		int m = (int) 1e9 + 9;
		long hashvalue = 0;
		long pow = 1;
		for(int i = 0;i<s.length();i++)
		{
		    char c = s.charAt(i);
		    hashvalue = (hashvalue + (c-'a' + 1)*pow) % m;
		    pow = (pow*p)%m;
		}

		return hashvalue;
	}

	long computeHash(String s,long p,long m)
	{
		long hashvalue = 0;
		long pow = 1;
		for(int i = 0;i<s.length();i++)
		{
		    char c = s.charAt(i);
		    hashvalue = (hashvalue + (c-'a' + 1)*pow) % m;
		    pow = (pow*p)%m;
		}
		return hashvalue;
	}
}

