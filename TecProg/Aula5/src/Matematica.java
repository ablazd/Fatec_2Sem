
public class Matematica {
    public int pot(int base, int potencia) {
      if (potencia==0) return 1;
        return(potencia*pot(base,potencia-1));
    }
}
