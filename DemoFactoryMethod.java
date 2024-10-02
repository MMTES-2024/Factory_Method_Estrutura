/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.factory_method_estrutura;

/**
 *
 * @author rafaelamoreira
 */
public class DemoFactoryMethod {

    public static void main(String[] args) {
        System.out.println("Teste 1: Criador de Produto A");
        Creator criadorA = new CreatorProdutoA();
        Produto produtoA = criadorA.criarProduto();
        produtoA.operacao();

        System.out.println("Teste 2: Criador de Produto B");
        Creator criadorB = new CreatorProdutoB();
        Produto produtoB = criadorB.criarProduto();
        produtoB.operacao();

        System.out.println("Teste 3: Troca dinâmica de Criadores");
        Creator criador = new CreatorProdutoA();
        Produto produto = criador.criarProduto();
        produto.operacao();

        criador = new CreatorProdutoB();
        produto = criador.criarProduto();
        produto.operacao();
    }
}
