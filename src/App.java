public class App {
    public static void main(String[] args){
        Caminhoes c1 = new Caminhoes("c1",false, false, "str3456", "josé", true, 30);
        Caminhoes c2 = new Caminhoes("c2",true, false, "stg3456", "joao", false, 30);
        Caminhoes c3 = new Caminhoes("c3",true, true, "sts3456", "julia", true, 30);
        Caminhoes c4 = new Caminhoes("c4",false, true, "sta3456", "marcos", false, 40);
        Caminhoes c5 = new Caminhoes("c5",false, false, "str3456", "josé", true, 30);
        Caminhoes c6 = new Caminhoes("c6",true, false, "stg3456", "joao", false, 30);
        Caminhoes c7 = new Caminhoes("c7",true, true, "sts3456", "julia", false, 30);
        Caminhoes c8 = new Caminhoes("c8",false, true, "sta3456", "marcos", false, 40);
        Pilha<Caminhoes> todCaminhoes = new Pilha<>();
        todCaminhoes.push(c1);
        todCaminhoes.push(c2);
        todCaminhoes.push(c3);
        todCaminhoes.push(c4);
        todCaminhoes.push(c5);
        todCaminhoes.push(c6);
        todCaminhoes.push(c7);
        todCaminhoes.push(c8);

        OrganizarCaminhoes org = new OrganizarCaminhoes();
        System.out.println(todCaminhoes.pop());
        System.out.println(todCaminhoes.size());
        System.out.println(todCaminhoes.isEmpty());
        org.OrganizarCaminhoe(todCaminhoes);
        System.out.println(org.fazerEntregaPref());
    }
}
