# TTCalgorithm
Implementação em Java do algoritmo _Top Trade Cycles Chains_ (**TTC Chains**) voltado para o problema de emparelhamento cruzado referente ao 3º trabalho da disciplina de ***Grafos***.

<p align="right">
<img src="http://www.lostdesign.net/glossario/java.jpg" width="9%"  />
</p>

## Caso de teste


ENTRADA:  
  

- Conjunto de doador-receptor
	(CLASSE DOADOR-RECEPTOR)
- Preferencias de cada doador-receptor que depende:
	tipos de sangue(**A+/-**, **B+/-**, **O+/-**, **AB+/-**) 
	grupos de HLA (A, B, DR)

Sequência para definir as preferências:
1. Compara-se o grupo sangüíneo do doador com o do
receptor, que devem ser compatíveis;
3. Realiza-se a prova-cruzada (cross-match) para avaliar
se existem anticorpos no receptor dirigidos contra
os antígenos do doador, que possam causar rejeição
imediata;
4.Verifica-se a compatibilidade (HLA), semelhança entre
o receptor e o doador;

## Algoritmo Top trade Cycles Chains
Agora estamos prontos para descrever o mecanismo do TTCC em sua forma geral. Considerando a preferências dos agentes, o mecanismo do TTCC encontra o resultado do problema de correspondência 
através do seguinte procedimento:
1. Em cada rodada do algoritmo TTCC:
	- (i) com base nas suas preferências declaradas, cada agente ak que não tenha recebido um item aponta para o melhor item restante não atribuído em IP ∪ IA, 
	- (ii) cada agente remanescente que tenha recebido um item continua apontando para ela
atribuição e 
	- (iii) cada item restante não atribuído em pontos de IP para seu proprietário
  

2. Dado o apontamento no Passo 1, existe um ciclo ou uma cadeia; ou ambos. Nesta etapa (Etapa2), alocações associadas a ciclos são feitas: 
	- (i) Prosseguir para o Passo 3 se não houver ciclos. Caso contrário, localize um ciclo 7 e atribua a cada agente no ciclo, o item para o qual ela aponta. A tarefa é final para esses Agentes Remova todos os agentes e itens no ciclo do sistema.
	- (ii) Se todo agente tiver recebido um item, vá para a Etapa 4. Caso contrário, volte para Passo 1.
   

 3. Cada par item-agente restante inicia uma cadeia. Como várias cadeias podem coexistir:
	- (i) Selecione apenas uma das cadeias com uma regra de seleção de cadeia predefinida. A atribuição é final para os agentes na cadeia selecionada. Além de selecionar uma cadeia, a cadeia regra de seleção também determina se a cadeia selecionada é removida imediatamente
ou permanece no procedimento.
	- (ii) Se todo agente tiver recebido um item, vá para a Etapa 4. Caso contrário, volte para a Etapa 1 para iniciar a próxima rodada de alocação.
4. Remova todas as correntes (se houver alguma). O algoritmo termina

## Referência 

<p align="left">
<img src="https://cdn-images-1.medium.com/max/982/1*AiTBjfsoj3emarTpaeNgKQ.png" width="14%"  />
</p>
:link: <https://junit.org/junit5/>  
:link: <https://ac.els-cdn.com/S0022053105001663/1-s2.0-S0022053105001663-main.pdf?_tid=8de9b541-fef8-4554-abec-b5f9983dab50&acdnat=1541526377_77d3340b013da29fcaaef0ebed7569ae>

## Autores :smiley:
Candinho  
Samuel Lucas de Moura Ferino (<samuel1797@gmail.com>)  



