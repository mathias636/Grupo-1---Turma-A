public class ContinuarVoltarTeste {
    public static void main(String[] args) throws Exception {
        String mensagem = "MENSAGEM";
        AllInOne.ContinuarVoltar(mensagem);
        System.out.print("\n\n----------------\nTESTES EM: PRIMEIRO ENREDO\n\n");
        AllInOne.Contexto_ContinuarVoltar = 1;
        AllInOne.PrimeiroEnredoDecisao();
        System.out.print("\n\n----------------\nTESTES EM: TERCEIRO ENREDO\n\n");
        AllInOne.Contexto_ContinuarVoltar = 2;
        AllInOne.TerceiroEnredoDecisaoPósDesafio();
        AllInOne.Contexto_ContinuarVoltar = 3;
        System.out.print("\n\n----------------\nTESTES EM: QUARTO ENREDO\n\n");
        AllInOne.QuartoEnredoDecisao();
        
    }
}