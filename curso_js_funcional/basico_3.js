// arrow function

const felizNatal = () => console.log('Feliz Natal!!')
felizNatal()

const saudacao = (nome) => 'Fala ' + nome + ', blz?!'
const saudacao1 = (nome) => `Fala ${nome}, blz?!`

console.log(saudacao('Maria'))
console.log(saudacao1('Maria'))

const somar = (...numeros) => {
    console.log(Array.isArray(numeros))
    let total = 0
    for (const n of numeros) {
        total += n
    }
    return total
}

const subtrair = (a, b) => a - b
console.log(subtrair(4, 1))

console.log(somar(1, 2, 3))
console.log(somar(1, 2, 3, 4, 5, 6))
console.log(somar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

const potencia = base => exp => Math.pow(base, exp)

console.log(potencia(2)(8))

//this

Array.prototype.ultimo = function () {
    console.log(this[this.length - 1])
}

Array.prototype.primeiro = function () {
    console.log(this[0])
}

const numeros = [-333, 1, 2, 3, 500]
numeros.ultimo()
numeros.primeiro()