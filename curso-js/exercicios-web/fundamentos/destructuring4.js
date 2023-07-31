function rand ([min = 0, max = 1000 ]) {
    if (min>max) {
        [min,max]= [max,min]
    }
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

console.log(rand([ 50, 40]))
console.log(rand([992])) //considera comoo primeiro atributo = min
console.log(rand([,10])) //considera min = 0
console.log(rand([])) // usa toda a faixa por não selecionar parametros definidos
//console.log(rand()) // não funciona sem parametros de destructuring