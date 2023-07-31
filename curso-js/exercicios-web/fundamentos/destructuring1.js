// novo recurso do ES2015

const pessoa = {
    nome: 'Ana',
    idade: 5,
    endereco: {
        logradouro: 'Rua ABC',
        numero: 1000
    }
}

const { nome, idade } = pessoa // tira de dentro de pessoa os atributos dentro de {}
console.log(nome, idade)

const { nome: n, idade: i } = pessoa
console.log(n, i)

const { sobrenome, bemHumorada = true } = pessoa
console.log(sobrenome, bemHumorada)

const { endereco: { logradouro, numero, cep } } = pessoa
console.log(logradouro, numero, cep)

//const {conta: { ag, num}} = pessoa **** TENHA CERTEZA QUE O CAMINHO EXISTE QUANDO FOR BUSCA ANINHADA
//console.log(ag, num)               **** PORQUE SENÃO VAI DAR PROBLEMA AO BUSCAR OS DADOS