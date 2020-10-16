function listarAgencias(){
    fetch("http://localhost:8080/agencias")
            .then(res => res.json())
            .then(res => preenchercombo(res));
}

function preenchercombo(lista){
    var combo="";
    combo += "<option value=''>Seleciona a Agência</option>";
    for(contador=0;contador<lista.length;contador++){
        combo+=
        "<option value='" + lista[contador].idAgencia + "'>" + 
        lista[contador].numAgencia + " - " + lista[contador].nomeAgencia + "</option>";
    }
    document.getElementById("cmbagencias").innerHTML=combo;
}

function cadastrar(){
    var carta = {
        agencia: {
            idAgencia: document.getElementById('cmbagencias').value 
        },
        nomeFeriado: document.getElementById('feriado').value,
        dataInicio: document.getElementById('inicio').value,
        dataFim: document.getElementById('fim').value

    }
    if(!carta.agencia.idAgencia){
        window.alert("Selecione uma agência valida!")
        return
    }

    var envelope = { 
        method: "POST", body: JSON.stringify(carta), 
        headers: { 
            "Content-type": "application/json" 
        } 
    }


    fetch("http://localhost:8080/novoferiado", envelope)
        .then(res => res.json())
        .then(res => {
            window.alert('Feriado cadastrado com sucesso!')
            window.location="cadastro-feriado.html"; 
        })
        .catch(err => { 
            window.alert("Não foi possível cadastrar o feriado"); 
        });
}