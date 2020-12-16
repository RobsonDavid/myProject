package br.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "mtb310_ag_financeiro") // ligar com tabela
public class Agente {
      // Atributos

      @Id // ligar com coluna e chave primária
      @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
      @Column(name = "id_agente") // nome da coluna
      private int id;
  
      // correspondencia tipo JAVA com tipo Banco Dados
      @Column(name = "nome_agente", length = 100, nullable = false)
      private String nome;
  
      @Column(name = "volume_financeiro",  nullable = false)
      private float volume;


      
      // Métodos
      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public float getVolume() {
          return volume;
      }

      public void setVolume(float volume) {
          this.volume = volume;
      }

  
    
}
