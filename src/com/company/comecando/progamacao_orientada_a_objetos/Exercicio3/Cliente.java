package com.company.comecando.progamacao_orientada_a_objetos.Exercicio3;
public class Cliente {
    String codigo;
    Integer subtotal;
    Integer desconto;
    Integer total;
    public Object mostrarComanda (Cliente cliente) {
        System.out.println(cliente.codigo);
        System.out.println("valor total: " + cliente.subtotal);
        System.out.println("desconto de: " + cliente.desconto);
        System.out.println("total de: " + getTotal());
        return null;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
    public Integer getDesconto() {
        return desconto;
    }
    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }
    public Integer getTotal() {
        total = subtotal - desconto;
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
}
