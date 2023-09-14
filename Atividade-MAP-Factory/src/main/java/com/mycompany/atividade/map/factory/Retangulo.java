package com.mycompany.atividade.map.factory;
public class Retangulo implements FormasGeometricas{
    private final double largura;
    private final double altura;
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura  = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    
}
