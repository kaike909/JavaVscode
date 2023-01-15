function carro(tipo){
    switch (tipo){
        case 'hatch':
            return 'Compra efetuada com sucesso'
            break
        case 'sedan': case 'caminhonete': case 'moto':
            return 'Tem certeza que não prefere este modelo?'
            break
        default:
            return 'Não trabalhamos com este tipo de automóvel aqui'
            break
    }
}

console.log(carro('hatch'))
console.log(carro('sedan'))
console.log(carro('Perua'))