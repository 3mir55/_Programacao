const carrinho = [
    { nome: 'Caneta', qtde: 10, preco: 7.99, fragil: true },
    { nome: 'Impressora', qtde: 1, preco: 649.50, fragil: true },
    { nome: 'Caderno', qtde: 4, preco: 27.10, fragil: false },
    { nome: 'Lapis', qtde: 3, preco: 5.82, fragil: false },
    { nome: 'Tesoura', qtde: 1, preco: 19.20, fragil: true },
]

// 1). fragil: true
const getFragil = item => item.fragil
const eFragil = carrinho.filter(getFragil)
console.log(eFragil)

// 2). qtde * preço - total
const getTotal = item => item.qtde * item.preco
const totais = eFragil.map(getTotal)
console.log(totais)

// 3). media dos totais
const total = (a, b) => a + b
const media = totais.reduce(total) / totais.length
console.log(media)

const getMedia = (acc, el) => {
    const novaQtde = acc.qtde + 1
    const novoTotal = acc.total + el
    return {
        qtde: novaQtde,
        total: novoTotal,
        media: novoTotal / novaQtde
    }
}
const mediaInicial = { qtde: 0, total: 0, media: 0 }

const mediaResposta = carrinho.filter(getFragil).map(getTotal).reduce(getMedia, mediaInicial).media
console.log(`A média é ${mediaResposta}!`)