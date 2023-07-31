const nums = [1,2,3,4,5,6,7,8,9,10 ]

for (x in nums){
    if (x == 5){
        break //interrompe o laço mais próximo for ou while e sai para o próximo comando do algoritmo
    }
    console.log(`${x} = ${nums[x]}`)
}

for (y in nums){
    if (y == 5){
        continue //interrompe a repetição atual (= 5) e continua o laço
    }
    console.log(`${y} = ${nums[y]}`)
}

externo: //rótulo para o laço
for (a in nums){
    for (b in nums){
        if(a == 2 && b == 3) break externo // chamando o break para próximo do for externo usando o rótulo
        console.log(`Par = ${a},${b}`)
    }
}
console.log('Fim!!')