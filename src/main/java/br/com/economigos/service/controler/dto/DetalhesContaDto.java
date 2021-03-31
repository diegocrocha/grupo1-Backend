package br.com.vitor.usercrud.controler.dto;

import br.com.vitor.usercrud.model.Conta;
import br.com.vitor.usercrud.model.Gasto;
import br.com.vitor.usercrud.model.Renda;

import java.util.List;
import java.util.stream.Collectors;

public class DetalhesContaDto implements CommonDto{

    private Long id;
    private String banco;
    private String numeroConta;
    private String descricao;
    private String apelido;
    private List<RendaDto> rendas;
    private List<GastoDto> gastos;

    public DetalhesContaDto(Conta conta) {
        this.id = conta.getId();
        this.banco = conta.getBanco();
        this.numeroConta = conta.getNumeroConta();
        this.descricao = conta.getDescricao();
        this.apelido = conta.getApelido();
        this.rendas = RendaDto.converter(conta.getRendas());
        this.gastos = GastoDto.converter(conta.getGastos());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public List<RendaDto> getRendas() {
        return rendas;
    }

    public void setRendas(List<RendaDto> rendas) {
        this.rendas = rendas;
    }

    public List<GastoDto> getGastos() {
        return gastos;
    }

    public void setGastos(List<GastoDto> gastos) {
        this.gastos = gastos;
    }

    public static List<DetalhesContaDto> converter(List<Conta> contas) {
        return contas.stream().map(DetalhesContaDto::new).collect(Collectors.toList());
    }

}