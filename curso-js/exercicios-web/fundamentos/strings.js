const escola = "Cod3r"

console.log(escola.charAt(4));
console.log(escola.charAt(5)); //não gera erro mas tbm não retorna nada
console.log(escola.charCodeAt(3)); //valor associado ao indice de tabela
console.log(escola.indexOf("3"));

console.log(escola.substring(1)); //retorna os caracteres a partir caractere 1
console.log(escola.substring(0, 3)); //a partir do caractere 0, porém com intervalo de 3 caracteres

console.log("Escola ".concat(escola).concat("!"));// posso usar o "+" no lugar do concat quando uso strings
console.log(escola.replace(3, "e"));

console.log("Ana,Maria,Pedro".split(","));
