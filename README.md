# 📌 CRM Usando Orientação a Objetos

Um sistema simples de CRM (Customer Relationship Management) para gerenciar clientes e registrar interações sem usar estruturas dinâmicas como `ArrayList` ou `List`.

## 🚀 Funcionalidades

- Criar clientes com **nome, email e telefone**.
- Registrar até **5 interações** (chamadas, reuniões, emails trocados).
- Exibir **informações do cliente** e seu histórico de interações.
- **Buscar interações** com base em palavras-chave.
- Atualizar o **status do cliente** automaticamente baseado na última interação.
- **Remover interações antigas** quando o limite de 5 for atingido.

---

## 📂 Estrutura do Projeto
```
crm-pbl3/
│-- src/
│   ├── crm/
│   │   ├── consultar/
│   │   │   ├── BuscarPalavraInteracao.java
│   │   │   ├── ConsultarCliente.java
│   │   ├── exibir/
│   │   │   ├── Informacao.java
│   │   ├── interacao/
│   │   │   ├── Interacao.java
│   │   ├── remocao/
│   │   │   ├── RemoverInteracao.java
│   │   ├── Cliente.java
│   ├── Main.java
│-- .gitignore
│-- crm.iml
│-- PBL 03.docx
│-- README.md  👈 (você está aqui)
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** para a implementação do sistema.
- **LocalDate** para manipulação de datas.
- **Matrizes (`String[][]`)** para armazenar as interações do cliente.

---

## 🏗️ Classes e Métodos

### **📌 Classe Cliente**
```java
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String[][] interacoes = new String[5][3]; // [tipo, descrição, data]
    private String status;

    public Cliente(String nome, String email, String telefone) { ... }

    public void registrarInteracao(String tipo, String descricao, String data) { ... }

    public void exibirInformacoes() { ... }

    public void buscarInteracao(String palavraChave) { ... }

    public void atualizarStatus() { ... }

    public void removerInteracaoAntiga() { ... }
}
```
### **📌Métodos Importantes**
- **registrarInteracao(String tipo, String descricao, String data):** Registra uma nova interação.
- **exibirInformacoes():** Exibe os dados do cliente e o histórico de interações.
- **buscarInteracao(String palavraChave):** Busca interações por palavra-chave.
- **atualizarStatus():** Atualiza o status do cliente baseado na última interação.
- **removerInteracaoAntiga():** Remove a interação mais antiga se o limite de 5 for atingido.

---

## 🔄 Regras do Sistema

- **Número máximo de interações por cliente**: `5`.
- **Status do cliente**:
    - 🟢 `Engajado`: Se a última interação for um **email** ou **ligação**.
    - 🟡 `Fechando Negócio`: Se a última interação for uma **reunião**.
    - 🔴 `Cliente Perdido`: Se não houver interação por mais de **30 dias**.

---

## 🏃 Como Executar

1️⃣ **Clone o repositório**:
```sh
git clone https://github.com/seu-usuario/seu-repositorio.git
```
2️⃣ **Compile e execute o código:**
```java
javac src/crm/Main.java
java src/crm/Main
```
## 📌 Exemplo de Uso
```java
public class Main {
public static void main(String[] args) {
Cliente cliente1 = new Cliente("João Silva", "joao@email.com", "11999999999");

        cliente1.registrarInteracao("Email", "Enviei proposta de serviço", "2024-01-10");
        cliente1.registrarInteracao("Ligação", "Cliente pediu mais detalhes", "2024-01-15");
        cliente1.registrarInteracao("Reunião", "Negociação finalizada", "2024-01-20");
        cliente1.registrarInteracao("Email", "Cliente confirmou contratação", "2024-01-25");
        cliente1.registrarInteracao("Ligação", "Ajustes no contrato", "2024-01-30");
        cliente1.registrarInteracao("Email", "Cliente com dúvidas adicionais", "2024-02-05");

        cliente1.exibirInformacoes();
        cliente1.buscarInteracao("contrato");
    }
}
```
## 📌 Desenvolvimento

Este código foi realizado por Douglas e Henrique, estudantes de ADS da PUC Goias, durante as aulas de Programação Orientada a Objetos.
