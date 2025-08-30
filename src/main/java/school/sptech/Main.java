package school.sptech;

public class Main {

    public static void main(String[] args) {
     Time time1=new Time();
     time1.vitorias=2;
     time1.empates=1;
     time1.derrotas=6;
     time1.nome="Palmeiras";
     Time time2=new Time();
     time2.vitorias=5;
     time2.derrotas=1;
     time2.empates=0;
     time2.nome="São Paulo";
       time1.exibirInformacoes();
        }
}