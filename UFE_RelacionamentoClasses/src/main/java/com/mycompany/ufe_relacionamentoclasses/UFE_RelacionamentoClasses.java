package com.mycompany.ufe_relacionamentoclasses;
public class UFE_RelacionamentoClasses 
{

    public static void main(String[] args) 
    {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador ("BBBoy", "Brasil", 31, 1.75f, 73f, 10,0,1 );
            //L[0].apresentar();
            
        L[1] = new Lutador ("Brian", "Angola", 26, 1.71f, 75f, 15, 0, 0);
            //L[1].apresentar();
        
        Luta UFE1 = new Luta();
        UFE1.marcarLuta(L[0], L[1]);
        UFE1.lutar();
        
        L[1].apresentar();
    }
    
}
