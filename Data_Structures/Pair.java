class Pair implements Comparable
{
    int f;
    int s;
    Pair(int fi,int se)
    {
        f=fi;
        s=se;
    }
    public int compareTo(Object o)
    {
        Pair pr=(Pair)o;
        if(s>pr.s)
            return 1;
        if(s==pr.s)
        {
            if(f>pr.f)
                return 1;
            else
                return -1;
        }
        else
            return -1;
    }
    public boolean equals(Object o)
    {
        Pair ob=(Pair)o;
        int ff;
        int ss;
        if(o!=null)
        {
            ff=ob.f;
            ss=ob.s;
            if((ff==this.f)&&(ss==this.s))
                return true;
        }
        return false;
    }
    public int hashCode()
    {
        return (this.f+" "+this.s).hashCode();
    }

    public String toString()
    {
    	return this.f+" "+this.s;
    }
}