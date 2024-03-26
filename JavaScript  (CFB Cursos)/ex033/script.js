const endpoint = 'https://fde9dfb9-1808-4408-91fe-38497fa86398-00-7vjs03en0nxb.worf.replit.dev/'
let labelsX = ['Disponibilidade', 'Qualidade', 'Performance']
let valores = [0, 0, 0]

const ctx = document.getElementById('myChart');

let grafico = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: labelsX,
        datasets: [{
        label: '# of Votes',
        data: valores,
        borderWidth: 1
        }]
    },
    options: {
        scales: {
        y: {
            beginAtZero: true
        }
        }
    }
});

const requisitarGrafico = () => {
    fetch(endpoint)
    .then(res => res.json())
    .then(resData => {
        console.log(resData)
        // const disponibilidade = resData.disponibilidade
        // const qualidade = resData.qualidade
        // const performance = resData.performance

        valores[0] = resData.disponibilidade
        valores[1] = resData.qualidade
        valores[2] = resData.performance

        grafico.update()
    })
    .catch(error => {
        console.error('Erro ao buscar ou analisar os dados', error)
    })
}

requisitarGrafico()
let intervalo = setInterval(requisitarGrafico, 3000)
