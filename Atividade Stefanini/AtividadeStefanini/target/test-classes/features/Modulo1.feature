#language:pt

Funcionalidade: Cadastro
Cenário:Cadastrar Novo Usuario
    Quando      Acessar : <URL>
    Dado        Tela Carregada
    E           Verifica Descrição :<TEXTO DESC>
    E           Preenche :<NOME>,<EMAIL>,<SENHA> 
    E           Verifica Mensagem de Confirmação:<TEXTO ESPERADO>
    

Exemplos:
    | URL                        | NOME      | EMAIL              |Senha |TEXTO DESC    |TEXTO ESPERADO
    | http://www.Appteste.com.br | usuarioA  | usuarioA@teste.com |xxxxx | yyyyyy 			|XXXXXXXXXX XX XXXX
    | http://www.Appteste.com.br | usuarioB  | usuarioB@teste.com |xxxxx | yyyyyy				|XXXXXXXXXX XX XXXX
    | http://www.Appteste.com.br | usuarioC  | usuarioC@teste.com |xxxxx | yyyyyy				|XXXXXXXXXX XX XXXX
    | http://www.Appteste.com.br | usuarioD  | usuarioD@teste.com |xxxxx | yyyyyy				|XXXXXXXXXX XX XXXX
    