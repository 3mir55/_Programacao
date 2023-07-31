console.log(module.exports) //objeto vazio
console.log(module.exports === this)
console.log(module.exports === exports)

this.a = 1
exports.b = 2
module.exports.c = 3

exports = null // não altera o objeto module.exports
console.log(module.exports)

exports = { // mesmo caso da linha 9
    nome: 'Teste'
}

console.log(module.exports)

module.exports = { publico: true } // forma correta de exportar um novo objeto