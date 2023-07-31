const saudacao1 = 'Olá, '
const saudacao2 = '!'
const nome = 'Leonardo'
function cumprimentar (nome){
    return console.log(saudacao1.concat(nome, saudacao2))
}

cumprimentar(nome)