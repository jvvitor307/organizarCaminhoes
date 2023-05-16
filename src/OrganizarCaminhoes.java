public class OrganizarCaminhoes {
    Pilha<Caminhoes> preferencia = new Pilha<>();
    Pilha<Caminhoes> semPreferencia = new Pilha<>();
    Pilha<Caminhoes> cargaPerigosa = new Pilha<>();
    Pilha<Caminhoes> perecivel = new Pilha<>();
    Pilha<Caminhoes> carregado = new Pilha<>();
    Pilha<Caminhoes> todCaminhoes = new Pilha<>();
    while(todCaminhoes.size() != 0){
        if(todCaminhoes.top().isCarregado() && todCaminhoes.top().isCargaPerigosa()){
            cargaPerigosa.push(todCaminhoes.pop());
        }
        else if(todCaminhoes.top().isCarregado() && todCaminhoes.top().isPerecivel()){
            perecivel.push(todCaminhoes.pop());
        }
        else if(todCaminhoes.top().isCarregado()){
            carregado.push(todCaminhoes.pop());
        }
    }
    while(cargaPerigosa.size() != 0){
        preferencia.push(cargaPerigosa.pop());
    }
    while(perecivel.size() != 0){
        preferencia.push(perecivel.pop());
    }
    while(carregado.size() != 0){
        semPreferencia.push(carregado.pop());
    }
}


