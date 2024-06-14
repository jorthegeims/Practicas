public class Sendero{

    int ci;// El claro inicial ci 
    int cf;// El claro final cf
    int l; // El largo l del sendero

    bool td = false;
    bool tcf = false;
    bool tcm = false;
    public Sendero(int ci, int cf, int l){

        this.ci=ci;
        this.cf=cf;
        this.l=l;

    }

    public bool Td { get => td; set => td = value; }
    public bool Tcf { get => tcf; set => tcf = value; }
    public bool Tcm { get => tcm; set => tcm = value; }
}