const tecnologias = new Map()
tecnologias.set('react', {framework: false})
tecnologias.set('angular', {framework: true})

console.log(tecnologias.react) // chamada feita de forma errada - não funciona
console.log(tecnologias.get('react').framework)

const chavesVariadas = new Map([
    [function() { }, 'Função'],
    [{}, 'Objeto'],
    [123, 'Número']
])

chavesVariadas.forEach((vl, ch) => {
    console.log(ch, vl)
})

console.log(chavesVariadas.has(123))
chavesVariadas.delete(123)
console.log(chavesVariadas.has(123))
console.log(chavesVariadas.size)

chavesVariadas.set(123, 'a')
chavesVariadas.set(123, 'b') //sobrescreve o set anterior pois as chaves não podem ser duplicadas
chavesVariadas.set(456, 'b') //valores podem ser repetidos
console.log(chavesVariadas)