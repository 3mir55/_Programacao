const contadorA = require('./instanciaUnica')
const contadorB = require('./instanciaUnica')

const contadorC = require('./instanciaNova')() // os parenteses vazios indicam a chamada da função factory
const contadorD = require('./instanciaNova')() // retornando o objeto

contadorA.inc()
contadorA.inc()
console.log(contadorA.valor , contadorB.valor)

contadorC.inc()
contadorC.inc()
console.log(contadorC.valor , contadorD.valor)
