
class Fracciones
{
    private int numerador;
    private int denominador;

     public clase(String dato)
    {
        if(dato.contains("/"))
        {
            //entra cuando hay un slash en el string
            this.numerador = Integer.parseInt(dato.substring(0,dato.indexOf("/")));
            this.denominador = Integer.parseInt(dato.substring(dato.indexOf("/")+1));
        }
        else
        {
            this.numerador = Integer.parseInt(dato);
            this.denominador = 1;
        }
    }

    public clase()
    {
        this.numerador = 0;
        this.denominador = 1;
    }

    public clase(final int n)
    {
        this.numerador = n;
        this.denominador = 1;
    }

    public clase(final int n, final int d)
    {
        if(d==0)
        {
            System.out.println("Error el denominador no puede ser cero");
        }
        this.numerador = n;
        this.denominador = d;
    }

    public clase(clase fr)
    {
        this.numerador = fr.numerador;
        this.denominador = fr.denominador;
    }

    public static clase suma(clase f1, clase f2)
    {
        int numerador, denominador;

        numerador =(f1.GetNumerador() * f2.GetDenominador()) + (f2.GetNumerador() * f1.GetDenominador());
        denominador = f1.GetDenominador()*f2.GetDenominador();

        clase nuevaFr =  new clase(numerador, denominador);
        nuevaFr.simpli();
        return nuevaFr;
    }


    public static Fracciones resta(Fracciones f1, Fracciones f2)
    {
        int numerador, denominador;

        numerador = (f1.GetNumerador() * f2.GetDenominador()) - (f2.GetNumerador() * f1.GetDenominador());
        denominador = f1.GetDenominador() * f2.GetDenominador();

        clase nuevaFr = new clase(numerador, denominador);
        nuevaFr.simpli();
        return nuevaFr;
    }


    public void simpli()
    {
        //simplificacion...
        int[] sp = this.simpli(numerador, denominador);
        this.numerador = sp[0];
        this.denominador = sp[1];
    }


    public int[] simpli(int numerador, int denominador)
    {
        //simplificacion...
        int a,b,mod;
        int[] result = new int[2];

        if(numerador%denominador == 0)
        {
            numerador = numerador/denominador;
            denominador = 1;
            result[0] = numerador;
            result[1] = denominador;
            return result;
        }
        if(numerador > denominador)
        {
            a = numerador;
            b = denominador;
        }
        else
        {
            a = denominador;
            b = numerador;
        }
        while(b != 0)
        {
            mod=a%b;
            a=b;
            b=mod;
        }

        result[0]= numerador/a;
        result[1] = denominador/a;
        return result;
    }

   
    public Fracciones Abs()
    {
        return new clase(Math.abs(numerador)/Math.abs(denominador));
    }

    public void printf()
    {
        System.out.print(this.numerador+((this.denominador==1)?" ":"/"+this.denominador));
    }
    public int  GetNumerador()
    {
        return numerador;
    }
    public int GetDenominador()
    {
        return denominador;
    }

    public String toString()
    {
        this.simpli();
        return this.numerador+((this.denominador==1)?" ":"/"+this.denominador);
    }
}
