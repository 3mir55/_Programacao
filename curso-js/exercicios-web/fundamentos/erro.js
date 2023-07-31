function tratarErroELancar(erro) {
    //throw new Error('...')
    //throw 10
    //throw true
    //throw 'mensagem'
    throw { // lanca o que vc desejar para tratar o erro
        nome: erro.name,
        msg: erro.message,
        date: new Date
    }
}

function imprimirNomeGritado(obj) {
    try { // testa um possível erro
        console.log(obj.name.toUpperCase() + '!!!')
    } catch (e) { // se tiver erro executa 
        tratarErroELancar(e)
    } finally { // sempre é chamado depois do teste mesmo que não haja erro
        console.log('final')
    }
}

const obj = { nome: 'Roberto' }
imprimirNomeGritado(obj)
