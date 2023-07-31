const valor = 'global'

function minhaFuncao(){ // a função segue a busca por uma variável mais próxima
    console.log(valor)  // mas ela reconhece o local onde ela foi criada
}

function exec(){
    const valor = 'local'
    minhaFuncao() // mesmo que esteja sendo execudada próximo de uma variável com o nome indicado
}                 // ela vai sempre buscar a mais próxima de sua criação

exec()