// Factory simples
function criarProduto(nome, preco){
    return {
        nome,
        preco,
        desconto: 0.1
    }
}

console.log(criarProduto('televisor', 2199.00))
console.log(criarProduto('notebook', 3500.50))