// Função em JS é First-Class Object (Citizens)
// Higher-order function

//criar de forma literal
function fun1() { } //retorna undefined se não for dado nenhum parametro
// bloco é obrigatório

//Armazenar função em variável
const fun2 = function () { }

// Armazenar dentro de uma array
const array = [function (a, b) { return a + b }, fun1, fun2]
console.log(array[0](2, 3))

//Armazenar em um atributo de objeto

const obj = {}
obj.falar = function () { return 'Opa' }
console.log(obj.falar())

// Passar função como parametro
function run(fun) {
    fun()
}

run(function () { console.log('Executando...') })

//Uma função pode retornar/conter

function soma(a, b) {
    return function (c) {
        console.log(a + b + c)
    }
}

soma(2, 3)(4)

const cincoMais = soma(2, 3)
cincoMais(4)
