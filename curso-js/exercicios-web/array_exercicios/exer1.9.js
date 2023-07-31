function repetir(num, qtde){
    const arrayFinal = []
    for (let i = 0; i < qtde; i++) {
        arrayFinal [i] = num
    }
    return arrayFinal
}
console.log(repetir(2, 20))