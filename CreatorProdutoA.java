/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.factory_method_estrutura;

/**
 *
 * @author rafaelamoreira
 */
public class CreatorProdutoA extends Creator{
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }

}
