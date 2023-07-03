# Sistema de Monitoramento de Energia - API de Endereços

Funcionalidades:

* Receber dados de endereço (rua, número, bairro, cidade e UF) com todos campos obrigatórios, sendo uf exigido com exatamente 2 caracteres. Caso seja válido, retorna uma mensagem positiva, caso seja inválido, uma lista com os campos inválidos e seus erros.

Exemplo de requisição válida:  
curl --location 'http://localhost:8080/enderecos' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"rua": "1",  
&emsp;&emsp;"numero": "10B",  
&emsp;&emsp;"bairro": "Centro",  
&emsp;&emsp;"cidade": "Sapezal",  
&emsp;&emsp;"uf": "MS"  
}'

Exemplo de requisição inválida:  
curl --location 'http://localhost:8080/enderecos' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"rua": "1",  
&emsp;&emsp;"cidade": "Sapezal",  
&emsp;&emsp;"uf": "MTS"  
}'

Ferramentas utilizadas

* Spring Boot
* Bean Validation
