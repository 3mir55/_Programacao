function inverso( numOuBoolean ) {
    if(typeof numOuBoolean == "boolean"){
        return console.log(!numOuBoolean)
    } else if (typeof numOuBoolean == "number") {
        return console.log(-numOuBoolean)
    } else {
        return console.log(`booleano ou números esperado, mas o parâmetro é do tipo ${typeof numOuBoolean}`)
     }
}
inverso(11)