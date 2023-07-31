function rand({ min = 0, max = 1000 }) {
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

//const obj = { max: 50, min: 40 } *** declaração da variavel sem o uso do destructuring
console.log(rand(obj = { max: 50, min: 40 }))
console.log(rand({ min: 955 }))
console.log(rand({}))
//console.log(rand()) // não funciona sem parametros de destructuring