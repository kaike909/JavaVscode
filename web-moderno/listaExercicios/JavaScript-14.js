function diaDaFruta(fruta) {
    switch (fruta.toLowerCase()) {
        case 'maca':
            return 'Não vendemos esta fruta aqui'
            break
        case 'kiwi':
            return 'Estamos com escassez de kiwis'
            break
        case 'melancia':
            return 'Aqui está, são 3 reais o quilo'
            break
        default:
            return 'Não reconheço essa fruta'
            break
    }
}

console.log(diaDaFruta('maca'))