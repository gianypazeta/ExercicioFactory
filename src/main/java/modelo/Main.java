/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import PatternFactory.IcmsFactory;
import modelo.Orcamento;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
     
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}
