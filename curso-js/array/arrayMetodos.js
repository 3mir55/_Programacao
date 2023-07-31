const pilotos = ['Vettel', 'Alonso', 'Raikkonen', 'Massa']
pilotos.pop() // massa quebrou / remove o ultimo elemento da lista
console.log(pilotos)

pilotos.push('Verstappen')
console.log(pilotos)

pilotos.shift() //remove o primeiro
console.log(pilotos)

pilotos.unshift('Hamilton')
console.log(pilotos) //adiciona na primeira posição

//splice pode adicionar ou remover elementos

//adicionar
pilotos.splice(2, 0, 'Bottas', 'Massa')
console.log(pilotos)

//remover
pilotos.splice(3, 1) // Massa quebrou novamente
console.log(pilotos)

const algunsPilotos1 = pilotos.slice(2) // retira parte do array - novo array
console.log(algunsPilotos1)

const algunsPilotos2 = pilotos.slice(1, 4)
console.log(algunsPilotos2)