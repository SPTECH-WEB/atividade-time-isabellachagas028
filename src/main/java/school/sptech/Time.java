package school.sptech;

public class Time {
 String nome;
 Integer vitorias, empates,derrotas;
  public Time(){
     vitorias=0;
     empates=0;
     derrotas=0;
 }
 public void registrarVitoria(){
    vitorias+=1;
 }
 public void registrarEmpate(){
      empates+=1;
 }
 public void registrarDerrota(){
      derrotas+=1;
 }
 public Integer getPontos(){
       return ((vitorias*3)+empates);
 }
 public Integer getTotalPartidas(){
      return (vitorias+empates+derrotas);
 }
 public Integer getAproveitamento(){
      return ((vitorias*100)/getTotalPartidas());
 }
 public void compararAproveitamento(Time x){
      if (getAproveitamento()>x.getAproveitamento()){
          System.out.printf("O time %s tem um aproveitamento maior que o time %s", nome,x.nome);
      } else if (getAproveitamento()<x.getAproveitamento()) {
          System.out.printf("O time %s tem um aproveitamento menor que o time %s",nome,x.nome);
      }
      else {
          System.out.println("O time %s eo o time %s tem o mesmo aproveitamento".formatted(nome,x.nome));
      }

 }
 public void exibirInformacoes(){
     System.out.printf("Time: %s \n",nome);
     System.out.printf("Vitórias: %d \n",vitorias);
     System.out.printf("Empates: %d \n",empates);
     System.out.printf("Derrotas %d \n",derrotas);
     System.out.printf("Pontos %d \n",getPontos());
     System.out.printf("Aproveitamento %d%% \n",getAproveitamento());





 }

}
