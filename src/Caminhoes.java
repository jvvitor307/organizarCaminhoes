 public class Caminhoes {
    private boolean cargaPerigosa;
    private boolean perecivel;
    private String placa;
    private String nomeMotorista;
    private boolean carregado;
    private int pesoQueTransporta;
    public boolean isCargaPerigosa() {
        return cargaPerigosa;
    }
    public void setCargaPerigosa(boolean cargaPerigosa) {
        this.cargaPerigosa = cargaPerigosa;
    }
    public boolean isPerecivel() {
        return perecivel;
    }
    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNomeMotorista() {
        return nomeMotorista;
    }
    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }
    public boolean isCarregado() {
        return carregado;
    }
    public void setCarregado(boolean carregado) {
        this.carregado = carregado;
    }
    public int getPesoQueTransporta() {
        return pesoQueTransporta;
    }
    public void setPesoQueTransporta(int pesoQueTransporta) {
        this.pesoQueTransporta = pesoQueTransporta;
    }
    public Caminhoes(boolean cargaPerigosa, boolean perecivel, String placa, String nomeMotorista, boolean carregado,
            int pesoQueTransporta) {
        this.cargaPerigosa = cargaPerigosa;
        this.perecivel = perecivel;
        this.placa = placa;
        this.nomeMotorista = nomeMotorista;
        this.carregado = carregado;
        this.pesoQueTransporta = pesoQueTransporta;
    }
    

}
