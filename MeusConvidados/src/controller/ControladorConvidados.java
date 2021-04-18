package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Convidados;
import modelo.Evento;


public class ControladorConvidados extends AbstractTableModel{
	
		private List<Convidados> dados = new ArrayList<>();
//		private List<Evento> dadosEvento = new ArrayList<>();
		
		private String[] colunas = {"Nome", "Tipo", "Idade", "Telefone"};
		
		@Override
		public String getColumnName(int column) {
			return colunas[column];
		}
		
		@Override
		public int getRowCount() {
			return dados.size();
		}

		@Override
		public int getColumnCount() {
			return colunas.length;
		}

		@Override
		public Object getValueAt(int linha, int coluna) {
			
			switch(coluna) {
				case 0:
					return dados.get(linha).getNome();
				case 1:
					return dados.get(linha).getTipoConvidado();
				case 2:
					return dados.get(linha).getIdade();
				case 3:
					return dados.get(linha).getNumTelefone();	
/*				case 4:
					return dadosEvento.get(linha).getNomeEvento();
*/			}			
			return null;
		}
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setNome((String) valor);
				break;
			case 1:
				dados.get(linha).setTipoConvidado((String) valor);
				break;
			case 2:
				dados.get(linha).setIdade(Integer.parseInt((String) valor));
				break;
			case 3:
				dados.get(linha).setNumTelefone(Long.parseLong((String) valor));		
				break;
	/*		case 4:
				dadosEvento.get(linha).setNomeEvento((String) valor);
				break;
*/
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		public void addLinha(Convidados c) {			
			this.dados.add(c);
			this.fireTableDataChanged();
		}		
				
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}
