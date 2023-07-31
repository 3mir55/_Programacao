let num1 = 1
let num2 = 2

num1++ //pósfixado
console.log(num1)
--num1 //préfixado
console.log(num1)

console.log(++num1 === num2--) //vai ser decrementado num2 depois do teste de igualdade
//não faça isso numa comparação, deixe seu código simples de ser lido
console.log(num1 === num2)
