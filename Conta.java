 class Conta {

   private int numero;
   private float saldo;
   private boolean ativa;
   private int tipo;

   public Conta(int numero) {

        this.saldo = 0;
        this.tipo = 1;
        this.numero = numero;
        this.ativa = true;
    }
    public float getSaldo(){
    return this.saldo;
    }
    public void creditar(float credito){
    saldo= saldo + credito;

  } 
    public void debitar(float debito){
    saldo=saldo - debito;

  }
     public int getNumero(){
    return this.numero;
    }
    public int getTipo(){
    return this.tipo;
    }
    public boolean EstaAtiva(){
    return this.ativa;
    }



  
}