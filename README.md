# Problema do Metrô de Londres - Busca Heurística com A*

Este repositório contém a implementação da segunda atividade da disciplina de Introdução a Agentes Inteligentes (IAI) do ano de 2024 da UFPE. A atividade consiste na aplicação do algoritmo A* para resolver o problema da busca de rotas no metrô de Londres.

## Descrição do Problema

O problema consiste em calcular a melhor rota em um mapa "reduzido" do metrô de Londres, onde cada estação é um estado. O objetivo é encontrar a rota mais eficiente para ir de uma estação inicial para uma estação final.

### Estado Inicial
- Estação de partida selecionada pelo usuário.

### Estado Final (Objetivo)
- Estação de destino desejada.

### Ações e Custos
- As ações correspondem à movimentação entre as estações do metrô.
- O custo de cada ação pode variar dependendo da distância entre as estações ou outros critérios definidos.
  
### Função de Avaliação (Heurística)
- Para este problema, foi escolhida a heurística de distância euclidiana entre as estações. Essa heurística estima o custo restante para atingir o objetivo a partir de cada estado.

# Ainda precisa ser implementado:


**Observação:** Este é um projeto desenvolvido como parte da segunda atividade da disciplina de Introdução a Agentes Inteligentes (IAI) de 2024 da UFPE. Responsáveis pela implementação: Gabriela Gimenez e Silvio Sá.

