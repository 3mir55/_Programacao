const alunos = [
    {nome: 'João', nota: 7.3, bolsista: false },
    {nome: 'Maria', nota: 9.2, bolsista: true },
    {nome: 'Pedro', nota: 9.8, bolsista: false },
    {nome: 'Ana', nota: 8.7, bolsista: true }

]

//Desafio 1: Todos os alunos são bolsistas?

// minha resposta
const bolsa = alunos.map(n => n.bolsista) // array de boolean referente a bolsista
console.log(bolsa)

const todosBolsitas = bolsa.reduce(function (acum, atual){
    return acum && atual
})
if(todosBolsitas){
    console.log('Todos alunos são bolsistas.')
} else {
    console.log('Os alunos não são todos bolsistas.')
}
// resposta do professor

const todosBolsitas2 = (resultado, bolsista) => resultado && bolsista
console.log(alunos.map(a => a.bolsista).reduce(todosBolsitas2))

//Desafio 2: Algum aluno é bolsista?

//minha resposta errada por não usar reduce
const algumBolsista = bolsa.filter(b => b == true)
console.log(algumBolsista)

const qtdeBolsista = algumBolsista.length

console.log(`Existe(m) ${qtdeBolsista} Bolsistas.`)

//resposta do professor

const algumBolsista2 = (resultado, bolsista) => resultado || bolsista
console.log(alunos.map(a => a.bolsista).reduce(algumBolsista2))