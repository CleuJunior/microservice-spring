# Projeto de Demonstração de Microsserviços


![alt text](diagram.png)

Este repositório contém um projeto de demonstração que apresenta uma aplicação baseada em microsserviços, projetada para
proporcionar uma compreensão prática da arquitetura e implementação de microsserviços. O projeto consiste em um 
API Gateway, Servidor de Configuração, Servidor de Descoberta e dois microsserviços: Aluno e Escola.

## Sumário

- [Começando](#começando)
    - [Pré-requisitos](#pré-requisitos)
    - [Instalação](#instalação)
- [Componentes do Projeto](#componentes-do-projeto)
    - [API Gateway](#api-gateway)
    - [Servidor de Configuração](#servidor-de-configuração)
    - [Servidor de Descoberta](#servidor-de-descoberta)
    - [Microsserviço de Aluno](#microsserviço-de-aluno)
    - [Microsserviço de Escola](#microsserviço-de-escola)
- [Comunicação entre Microsserviços](#comunicação-entre-microsserviços)
    - [Usando o OpenFeign](#usando-o-openfeign)
- [Rastreamento Distribuído](#rastreamento-distribuído)
    - [Usando o Zipkin](#usando-o-zipkin)
- [Agradecimentos](#agradecimentos)

## Começando

Siga as instruções abaixo para configurar o projeto em sua máquina local para fins de desenvolvimento e teste.

### Pré-requisitos

Certifique-se de que você tenha o seguinte software instalado em seu sistema antes de prosseguir:

- JDK 17 ou posterior
- Maven
- Docker (opcional, para contêinerização)

### Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/CleuJunior/microservice-spring.git
   
2. Navegue até o diretório do projeto:
3. Compile e empacote cada componente com o Maven:

## Componentes do Projeto

### API Gateway

O Gateway de API atua como o ponto de entrada único para todas as solicitações de clientes, gerenciando e roteando-as 
para os microsserviços apropriados.

### Servidor de Configuração (Config Server)

O Servidor de Configuração centraliza o gerenciamento de configurações para todos os microsserviços, simplificando a 
manutenção do aplicativo e garantindo consistência em todos os ambientes.

### Servidor de Descoberta (Discovery Server)

O Servidor de Descoberta fornece registro e descoberta de serviços, permitindo comunicação contínua entre os serviços 
dentro do ecossistema de microsserviços.

### Microsserviço de Aluno (Student)

O Microsserviço de Aluno é responsável por gerenciar dados e operações relacionadas a alunos, como adicionar, atualizar 
e recuperar registros de alunos.

### Microsserviço de Escola (School)

O Microsserviço de Escola gerencia dados e operações relacionadas a escolas, incluindo adicionar, atualizar e recuperar 
registros escolares.

## Comunicação entre Microsserviços

### Usando o OpenFeign

Este projeto demonstra a comunicação entre microsserviços usando o OpenFeign, um cliente REST declarativo que simplifica 
a comunicação entre serviços dentro do ecossistema de microsserviços.

## Rastreamento Distribuído

### Usando o Zipkin

O projeto mostra o uso do Zipkin para rastreamento distribuído, aprimorando a observabilidade do aplicativo e 
possibilitando a visualização e solução de problemas relacionados à latência.

## Agradecimentos

Agradecimento especial ao instrutor Bouali Ali, que ministrou de forma brilhante esse treino.