public class OrganizarCaminhoes {
    private Pilha<Caminhoes> preferencia = new Pilha<>();
    private Pilha<Caminhoes> semPreferencia = new Pilha<>();
    private Pilha<Caminhoes> semCaminhao = new Pilha<>();
    private Caminhoes item;
    public void OrganizarCaminhoe (Pilha<Caminhoes> todCaminhoes){
        while(!todCaminhoes.isEmpty()){
            if(todCaminhoes.top().isCarregado() && todCaminhoes.top().isCargaPerigosa()){
                item = todCaminhoes.top();
                todCaminhoes.pop();
                preferencia.push(item);
                item = null;
            }
            else if(todCaminhoes.top().isCarregado() && todCaminhoes.top().isPerecivel()){
                item = todCaminhoes.top();
                todCaminhoes.pop();
                preferencia.push(item);
                item = null;
            }
            else if(!todCaminhoes.top().isCarregado()){
                item = todCaminhoes.top();
                todCaminhoes.pop();
                semPreferencia.push(item);
                item = null;
            }
            else{
                item = todCaminhoes.top();
                todCaminhoes.pop();
                semCaminhao.push(item);
                item = null;
            }
        }
        while(!semCaminhao.isEmpty()){
                item = semCaminhao.top();
                semCaminhao.pop();
                semPreferencia.push(item);
                item = null;
            }
        }
    public Caminhoes fazerEntregaPref(){
        if(preferencia.isEmpty()){
        System.out.println("sem caminhoes");
        return null;
        }else{
            return preferencia.pop();
        }
    }
    public Caminhoes fazerEntregaSemPref(){
        return semPreferencia.pop();
    }
}


