function simboloMais (qtde){
    let simbolo = ""
    for (let i = 0; i < qtde; i++) {
        simbolo += "+"
    }
    return simbolo
}
console.log(simboloMais(2))