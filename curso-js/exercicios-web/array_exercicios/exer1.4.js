const meses = [
    'janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 
    'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro'
]

function nomeDoMes (numeroDoMes) {
    return console.log(`"${meses[numeroDoMes - 1]}"`)
}

nomeDoMes(5)