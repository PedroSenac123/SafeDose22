
 🩺 SafeDose – Sistema de Gestão de Medicamentos

O **SafeDose** é um sistema desktop desenvolvido em **Java** com **Swing**, projetado para ajudar usuários a **organizar o uso de medicamentos de forma segura** e definindo **horários**.
Seu foco principal é a **acessibilidade e praticidade**, oferecendo uma interface limpa, botões grandes e alertas claros — ideal para idosos, cuidadores e qualquer pessoa que deseje um controle confiável sobre sua rotina de medicação.

---

## 📌 Funcionalidades

* [x] Cadastro de medicamentos
* [x] Definição de horários e frequência
* [x] Interface acessível e intuitiva
* [x] Armazenamento local com opção de banco de dados

---

## 🎯 Tecnologias Utilizadas

* ☕ **Java SE**
* 🧱 **Java Swing** (interface gráfica)
* 🧰 **IDE recomendada:** NetBeans ou IntelliJ IDEA
* 💾 **Banco de Dados:** SQLite (ou `.txt/.json` na versão simplificada)

---

## 🛠️ Como Usar

1. Clone o repositório:

   ```bash
   git clone https://github.com/SeuUsuario/SafeDose.git
   ```
2. Abra o projeto no **NetBeans** (ou sua IDE favorita)
3. Compile e execute a classe principal `SafeDoseMain.java`
4. Cadastre seus medicamentos e defina os horários para receber alertas personalizados

---

## 📁 Estrutura do Projeto

```
SafeDose/
├── src/
│   └── br/ulbra/controller/         # Controladores do sistema
│   │  └── MedicamentoController
│   │  └── CuidadorController.java
│   │  └── RotinaController.java
│   │  └── MedicoController.java  
│   ├── br/ulbra/DAO/              # Classes modelo (Medicamento, Alerta, Histórico)
│   │   └── AbstractDAO.java 
│   │   └── CrudRepository.java
│   │   └── MedicamentoDAO.java
│   │   └── MedicoDAO.java
│   │   └── RotinaDAO.java
│   │   └── UsuarioDAO.java
│   ├── br/ulbra/Model/               # Telas (Login, Cadastro, Alertas, Histórico)
│   │   └── Medicamento.java
│   │   └── Medico.java
│   │   └── Rotina.java
│   │   └── HistoricoMed
│   │   └── Usuario.java
│   │   └── SessaoUsuario.java
│   └── br/ulbra/View/                # Classes de acesso a dados (DAO com SQLite ou JSON)
│   │   └── CadastroMedicoView.java 
│   │   └── CuidadorView.java
│   │   └── DashboardCuidadorView.java
│   │   └── DashboardPacienteView.java 
│   │   └── LoginView.java 
│   │   └── MedciamentoscadastroView.java
│   │   └── PacientecadastroView.java 
│   │   └── PerfilPacienteView.java 
│   │   └── RotinasView.java
├── lib/                             # Bibliotecas externas
│   └── Driver JBDC do MySQL - mysql-connector-java-5.1.23-bin.jar
│   └── Layout Absoluto -AbsoluteLayout.jar
│   └── JDK 1.8 (Defaut)
└── assets/                          # Sons, ícones e imagens do sistema
```

---

## 🖥️ Telas do Sistema

O **SafeDose** possui uma interface desenvolvida em **Java Swing**, com foco em **acessibilidade, clareza e facilidade de uso**.

## 🧑‍⚕️ Tela de Cadastro de Médico

Permite registrar informações de médicos vinculados ao sistema.

### **Campos disponíveis:**
* ID  
* Especialidade  
* Nome do médico  
* CRM  
* Telefone  
* Email  

### **Funcionalidades:**
* Salvar, editar, excluir e listar registros  
* Exibição organizada em tabela com todos os médicos cadastrados  

### **Diferenciais:**
* Interface simples e objetiva  
* Permite integração direta com o cadastro de medicamentos  
---

## 🧓 Tela de Cadastro de Cuidador

Destinada ao registro de cuidadores responsáveis pelos pacientes.

### **Campos disponíveis:**
* ID  
* Nome  
* Email  
* Endereço  
* Telefone  
* Data de Nascimento  
* Senha  

### **Funcionalidades:**
* Inserir, editar, excluir e listar cuidadores  
* Visualização em tabela completa  

### **Diferenciais:**
* Campos claros e bem organizados  
* Ideal para controle de responsáveis e profissionais de apoio  
---

## 👩‍🦰 Tela de Cadastro de Paciente

Permite o registro completo dos pacientes acompanhados no sistema.

### **Campos disponíveis:**
* ID  
* Nome  
* Email  
* Endereço  
* Telefone  
* Data de Nascimento  
* Senha  

### **Funcionalidades:**
* Salvar, editar, listar, limpar e excluir registros  
* Visualização em tabela dinâmica  

### **Diferenciais:**
* Interface intuitiva e padronizada  
* Facilita o controle e atualização de dados pessoais  
---

## 💊 Tela de Cadastro de Medicamentos

Permite registrar novos medicamentos e vincular a médicos e pacientes.

### **Campos disponíveis:**
* Médico ID  
* Usuário ID  
* Medicamento  
* Observações  

### **Funcionalidades:**
* Adicionar, editar, excluir e listar medicamentos  
* Exibição organizada em tabela com todos os registros  

### **Diferenciais:**
* Integração direta com os cadastros de médico e paciente  
* Foco em simplicidade e clareza no uso  
---

## 🗂️ Tela de Menu de Cadastros

Centraliza o acesso às principais telas do sistema.

### **Opções disponíveis:**
* Pacientes  
* Rotina  
* Medicamentos  
* Médicos  
* Cuidadores  

### **Funcionalidades:**
* Acesso rápido às telas de cadastro  
* Campos de atalho configuráveis  

### **Diferenciais:**
* Navegação prática e centralizada  
* Design limpo e coerente com o restante do sistema  

## 🧠 Metodologia de Desenvolvimento

O projeto **SafeDose** foi desenvolvido com base na metodologia ágil **Scrum**, garantindo entregas incrementais e colaboração contínua entre os membros da equipe.
https://lucas2007branco-1761586304066.atlassian.net/jira/software/projects/SCRUM/boards/1

### 🧩 Papéis no Time

* **Scrum Master:** [Lucas Santos]
* **Product Owner (PO):** [Antônio Lesnik]
* **Desenvolvedores:**

  * [Pedro Algayer]
  * [Arthur Postringer]
  * [Arthur de Brito]
  * [Mauricio de Campos]

---

## 🧪 WireFrame (Protótipos do protótipo das Telas)

<img width="409" height="334" alt="image" src="https://github.com/user-attachments/assets/50710ba0-3c85-4dc1-88c0-5f272976e28a" />
<img width="929" height="530" alt="image" src="https://github.com/user-attachments/assets/74a14236-a8a9-416e-aec2-d2db5fd387e8" />
<img width="933" height="582" alt="image" src="https://github.com/user-attachments/assets/6cda34fc-6238-420a-aec4-9a59346ddbf0" />
<img width="1016" height="567" alt="image" src="https://github.com/user-attachments/assets/5f2ac2ec-b058-4db8-acdb-325dc15be24a" />
<img width="1009" height="566" alt="image" src="https://github.com/user-attachments/assets/a5c39033-7d25-4316-ad0c-abe7db93da20" />
<img width="744" height="397" alt="image" src="https://github.com/user-attachments/assets/d958647e-a990-4d23-852e-e9a442a9dd8f" />

---

## 🖥️ MockUp (Protótipos das Telas)

<img width="618" height="461" alt="image" src="https://github.com/user-attachments/assets/e3b16e14-a19d-4b29-92db-25c5edb36ac7" />
<img width="396" height="328" alt="image" src="https://github.com/user-attachments/assets/ec5cd58b-7060-4a8b-af56-9d4fd72194ab" />
<img width="906" height="739" alt="image" src="https://github.com/user-attachments/assets/d80c0add-f0ed-4c93-ac9b-088642376a4a" />
<img width="890" height="715" alt="image" src="https://github.com/user-attachments/assets/b44976a7-1599-483c-9056-53e870c68b6f" />
<img width="801" height="613" alt="image" src="https://github.com/user-attachments/assets/08a7a2da-ffe2-46fe-b1b4-da005a1a0cc8" />

<img width="398" height="332" alt="image" src="https://github.com/user-attachments/assets/776b7095-5e35-4199-8148-4400cd876c01" />
<img width="565" height="575" alt="image" src="https://github.com/user-attachments/assets/06fdd182-ebda-4709-8d57-4ea76cec1314" />
<img width="711" height="508" alt="image" src="https://github.com/user-attachments/assets/e2d5e7e1-129c-4900-bc44-513cc1326475" />












## Diagramas

**Diagrama de Casos de Uso**



<img width="624" height="784" alt="image" src="https://github.com/user-attachments/assets/8e33fa2d-204e-407a-a4cd-505e2c0911a8" />



**Diagrama de Classes**


**Diagrama de Classes Usuario e suas relações**
<img width="1226" height="856" alt="image" src="https://github.com/user-attachments/assets/baf45cfa-25d8-4908-a69a-13b85a00748e" />


**Diagrama de Classes Rotinas, Medico, Medicamento e suas relações**
<img width="1310" height="861" alt="image" src="https://github.com/user-attachments/assets/2da356ac-c167-4b21-a8fc-ee2be7593551" />

**Diagrama de Entidade de Relacionamento**
<img width="725" height="375" alt="image" src="https://github.com/user-attachments/assets/71a9401e-6e5e-4052-b131-2b287bec5b7b" />


🏦 **Banco de Dados** 
 CREATE DATABASE IF NOT EXISTS safedose22;
USE safedose22;


CREATE TABLE usuarios (
    usuario_id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL, 
    tipo VARCHAR(20) NOT NULL, 
    data_nascimento VARCHAR(20) NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(200),
    criado_em DATETIME DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE medicos (
    medico_id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100),
    crm VARCHAR(20) UNIQUE,
    telefone VARCHAR(20),
    email VARCHAR(150)
);


CREATE TABLE medicamentos (
    medicamento_id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL, 
    medico_id INT,           
    nome VARCHAR(150) NOT NULL, 
    observacoes VARCHAR(255),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id),
    FOREIGN KEY (medico_id) REFERENCES medicos(medico_id)
);


CREATE TABLE rotinas (
    rotina_id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,  
    medicamento_id INT NOT NULL, 
    horario TIME NOT NULL,
    dias_semana VARCHAR(50) DEFAULT 'TODOS', 
    FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id),
    FOREIGN KEY (medicamento_id) REFERENCES medicamentos(medicamento_id)
);

## 🏫 Contexto Acadêmico

O **SafeDose** foi desenvolvido como parte do **Curso Técnico em Informática** do
**Colégio São Lucas**, com o objetivo de aplicar conceitos de:

* **Programação Orientada a Objetos (POO)**
* **Banco de Dados e DAO**
* **Interface Gráfica (Java Swing)**
* **Usabilidade e Acessibilidade Digital**

---

## 💡 Ideia Central

O **SafeDose** nasceu com a missão de **aumentar a segurança e a autonomia dos usuários na administração de medicamentos**, oferecendo uma solução simples, confiável e acessível para o cuidado diário com a saúde.
