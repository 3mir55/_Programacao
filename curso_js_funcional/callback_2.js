const fs = require('fs')
const path = require('path')

const caminho = path.join(__dirname, 'dados.txt')

//console.log(__dirname)

function exibirConteudo(err, conteudo){ //pode-se usar o underline no lugar de 'err' caso não seja necessário o parametro
    console.log(conteudo.toString())
}

console.log('Inicio...')
fs.readFile(caminho, {}, exibirConteudo)// o parametro {} pode ser suprimido se não for usado, mas não se deve trocar a ordem
fs.readFile(caminho, (_, conteudo) => console.log(conteudo.toString()))
console.log('Fim...')

console.log('Inicio Sync...')
const conteudo = fs.readFileSync(caminho)
console.log(conteudo.toString())
console.log('Fim Sync...')