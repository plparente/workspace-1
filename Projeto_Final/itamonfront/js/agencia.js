function listarAgencias() {
    fetch("http://localhost:8080/agencias")
        .then(res => res.json())
        .then(res => preenchercombo(res));
}

function preenchercombo(lista) {
    var combo = "";
    combo += "<option value='todasAgencias'>TODAS AS AGÊNCIAS</option>";
    combo += "<option value='todosFeriados'>TODOS OS FERIADOS</option>";
    for (contador = 0; contador < lista.length; contador++) {
        combo +=
            "<option value='" + lista[contador].idAgencia + "'>" +
            lista[contador].numAgencia + " - " + lista[contador].nomeAgencia + "</option>";
    }
    document.getElementById("cmbagencias").innerHTML = combo;
}

function preenchertabela(lista) {
    var tabela =
        "<table class='table table-striped'>" +
        "<thead class='thead-dark'>" +
        "<tr>" +
        "<th>Inicio/Fim</th> <th>Feriado</th> <th>Número Agência</th> <th>Agência</th>" +
        "</thead>"
        "<tr>";
    for (contador = 0; contador < lista.length; contador++) {
        for (contadorFeriados = 0; contadorFeriados < lista[contador].feriados.length; contadorFeriados++) {

            var feriado = lista[contador].feriados[contadorFeriados];
            tabela +=
                "<tr>" +
                "<td>" + feriado.dataInicio + '-' + feriado.dataFim + "</td>" +
                "<td>" + feriado.nomeFeriado + "</td>" +
                "<td>" + lista[contador].numAgencia + "</td>" +
                "<td>" + lista[contador].nomeAgencia + "</td>" +
                "</tr>";
        }
    }
    tabela += "</table>"
    document.getElementById("resultado").innerHTML = tabela;
}

function filtrar() {
    var valor = document.getElementById("cmbagencias").value;
    if (valor == 'todasAgencias' || valor == 'todosFeriados') {
        valor = "";
    }else{
        valor = "/" + valor;
    }

    fetch("http://localhost:8080/agencias" +
        valor)
        .then(res => res.json())
        .then(res => preenchertabela(res));
}

