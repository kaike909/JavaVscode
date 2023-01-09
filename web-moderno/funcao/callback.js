const fabricantes = ['Mercedes', 'Audi', 'BMW']

function imprimir(nome, index){
    console.log(`${index + 1}.${nome}`)
}

fabricantes.forEach(imprimir)
fabricantes.forEach(a => console.log(`${a}`))