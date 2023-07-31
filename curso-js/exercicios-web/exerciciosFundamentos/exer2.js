//Errado porque não foi feito o retorno da função
function triangulo(l1, l2, l3) {
    if (l1 == l2 && l2 == l3) {
        console.log('Triângulo Equilátero')
    } else if (l1 == l2 || l1 == l3 || l2 == l3 ) {
        console.log('Triângulo Isósceles')
    } else if (l1 != l2 != l3) {
        console.log('Triângulo Escaleno')
    }
}
triangulo(1, 1, 1)
triangulo(2, 2, 3)
triangulo(3, 4, 5)
console.log(triangulo(3,3,3)) // undefined por não haver retorno

//maneira correta
function trianguloCerto (l1, l2, l3) {
    if (l1 == l2 && l2 == l3) {
        return 'Triângulo Equilátero'
    } else if (l1 == l2 || l1 == l3 || l2 == l3 ) {
        return 'Triângulo Isósceles'
    } else {
        return 'Triângulo Escaleno'
    }
}

console.log(trianguloCerto(1,1,1))
console.log(trianguloCerto(2,2,3))
console.log(trianguloCerto(4,5,6))
console.log(trianguloCerto()) // já não aparece undefined
