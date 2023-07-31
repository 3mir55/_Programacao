function area(largura, altura) {
    const area = largura * altura
    if (area > 20) {
        console.log(`Valor acima do permitido: ${area}m²`)
    } else {
        return area
    }
}

console.log(area(2, 2))
console.log(area(2))
console.log(area())
console.log(area(2, 3, 17, 22, 44)) //desconsidera os parametros adicionais
console.log(area(5, 5))
