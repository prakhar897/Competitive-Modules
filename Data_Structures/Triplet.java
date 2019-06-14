class Triplet implements Comparable
{
    int f,t;
    int s;
    Triplet(int f,int s,int t)
    {
        this.f=f;
        this.s=s;
        this.t=t;
    }
    public boolean equals(Object o)
    {
        Triplet ob=(Triplet)o;
        int ff;
        int ss;
        int tt;
        if(o!=null)
        {
            ff=ob.f;
            ss=ob.s;
            tt=ob.t;
            if((ff==this.f)&&(ss==this.s)&&(tt==this.t))
                return true;
        }
        return false;
    }
    public int hashCode()
    {
        return (this.f+" "+this.s+" "+this.t).hashCode();
    }

    public int compareTo(Object o)
    {
        Triplet tr=(Triplet)o;
        if(s>tr.s)
            return 1;
        else
            return -1;
    }

    public String toString()
    {
        return this.f+" "+this.s+" "+this.t;
    }
}