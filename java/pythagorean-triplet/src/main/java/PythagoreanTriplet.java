import java.util.*;
class PythagoreanTriplet{
    private int base,height,hypotenuse;

    public PythagoreanTriplet(int base,int height,int hypotenuse)
    {
        this.base=base;
        this.height=height;
        this.hypotenuse=hypotenuse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other=(PythagoreanTriplet) o;
        return base == other.base && height == other.height &&  hypotenuse == other.hypotenuse;
    }
    
    public void print()
    {
      System.out.println(base);
      System.out.println(height);
      System.out.println(hypotenuse);
    }

    public boolean isPythagoreanTriplet()
    {
        return ((base*base)+(height*height)==(hypotenuse*hypotenuse));
    }

    public static TripletBuilder makeTripletsList()
    {
        return new TripletBuilder();
    }

    public static class TripletBuilder{

        private int start=1,end,sum;

        public TripletBuilder thatSumTo(int sum)
        {
            this.sum=sum;
            return this;
        }

        public TripletBuilder withFactorsLessThanOrEqualTo(int end)
        {
            this.end=end;
            return this;
        }

        public List<PythagoreanTriplet> build()
        {
            List<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<PythagoreanTriplet>();
            for(int i=start;i<=end;i++)
                {
                    for(int j=i;j<=end;j++)
                        {
                            int k=(int)Math.sqrt(i*i+j*j);
                                    PythagoreanTriplet obj=new PythagoreanTriplet(i,j,k);
                                    if(i+j+k==sum && obj.isPythagoreanTriplet()==true && k<=end)
                                    {
                                        pythagoreanTriplets.add(obj);
                                    }
                                    
                                }
                        }
            return pythagoreanTriplets;
        }

        
    }
    
}