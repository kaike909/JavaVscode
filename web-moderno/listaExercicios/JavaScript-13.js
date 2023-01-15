function diaUtil(dia) {
    switch (dia) {
        case 1:
            return 'Fim de Semana'
            break;
        case 2: case 3: case 4: case 5: case 6:
            return 'Dia Útil'
            break
        case 7:
            return 'Fim de Semana'
            break
        default:
            return 'Dia Invalido'
            break;
    }
}

console.log(diaUtil(0))