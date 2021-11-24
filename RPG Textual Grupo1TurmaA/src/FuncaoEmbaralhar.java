
class Main {  
  public static void funcaoEmbaralhar(ArrayList<String> letter, ArrayList<String> alternativas, String questao, String escolhaParametro) { 
  
        String resposta = alternativas[0];
        String escolha = escolhaParametro, escolhaCerta = "";
        ArrayList<String> opcoes = new ArrayList<String>();
        int i;


        for(i = 0; i < alternativas.length; i++) {
            opcoes.add(alternativas[i]);
        }
        do
        {
            System.out.println("\n"+questao);
            if(escolha != "NULL"){
                Collections.shuffle(opcoes);}
            for(i = 0; i < alternativas.length; i++) {
                System.out.println(letter[i]+") "+opcoes.get(i));
                if(opcoes.get(i).equals(resposta)) {
                    escolhaCerta = letter[i]; }
            }        
            }while(escolha != "ok");

}