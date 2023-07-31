const produtos = [
    {nome: 'Notebook', preco: 2499, fragil: true },
    {nome: 'iPad Pro', preco: 4199, fragil: true },
    {nome: 'Copo de Vidro', preco: 12.49, fragil: true },
    {nome: 'Copo de Plástico', preco: 18.99, fragil: false }

]

console.log(produtos.filter(function(p){
    return false
}))

const eCaro = prod => prod.preco >= 500
const eFragil = prod => prod.fragil == true

console.log(produtos.filter(eCaro).filter(eFragil))