function estaEntre (min, max, numero, inclusivo = false){
    if(inclusivo) return numero >= min && numero <= max
    return numero > min && numero < max
}

console.log(estaEntre(10, 50, 50, true))