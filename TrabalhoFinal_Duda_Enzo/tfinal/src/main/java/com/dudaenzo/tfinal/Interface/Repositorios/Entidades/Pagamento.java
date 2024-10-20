package com.dudaenzo.tfinal.Negocio.Entidade;

@Entity
public class Pagamento {
    @codigo
    private long codigo;
    private double valorPago;
    private Date dataPagamento;
    private String promocao;
    private Assinaturas assinatura;

    protected Pagamento(){ }

    public Pagamento(long codigo, double valorPago, Date dataPagamento, String promocao, Assinaturas assinatura){
        this.codigo = codigo;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.promocao = promocao;
        this.assinatura = assinatura;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public double getValorPago(){
        return this.valorPago;
    }

    public Date getDataPagamento(){
        return this.dataPagamento;
    }

    public String getPromocao(){
        return this.promocao;
    }

    public Assinaturas getAssinaturas(){
        return this.assinatura;
    }
}
