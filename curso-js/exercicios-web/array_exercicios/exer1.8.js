function multiplicar (num1, num2){
    let resultado = 0
    if(num1 > num2){
        for (let i = 0; i < num2; i++) {
            resultado += num1
        }
        return resultado
    }
    if(num1 <= num2){
        for (let i = 0; i < num1; i++) {
            resultado += num2
        }
        return resultado           
    }
}

console.log(multiplicar(2, 40))

function mult (n1, m1){
    if(n1 === 0 || m1 === 0) return 0
    return m1 === 1 ? n1 : n1 + mult(n1, m1 - 1)
}

console.log(mult(8, 8))