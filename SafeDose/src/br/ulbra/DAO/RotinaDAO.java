package br.ulbra.DAO;

import br.ulbra.Model.Rotina;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RotinaDAO extends AbstractDAO {

    public List<Rotina> listarNaoTomados(int usuarioId) {
        List<Rotina> lista = new ArrayList<>();

        String sql = "SELECT m.medicamento_id, m.nome AS nome_medicamento, med.nome AS nome_medico, m.observacoes "
                + "FROM medicamentos m "
                + "JOIN medicos med ON m.medico_id = med.medico_id "
                + "WHERE m.usuario_id = ? AND (m.tomado = 'NAO' OR m.tomado IS NULL)";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Rotina r = new Rotina();
                r.setIdMedicamento(rs.getInt("medicamento_id"));
                r.setNomeMedicamento(rs.getString("nome_medicamento"));
                r.setNomeMedico(rs.getString("nome_medico"));
                r.setObservacoes(rs.getString("observacoes"));
                lista.add(r);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar medicamentos não tomados: " + e.getMessage());
        }

        return lista;
    }

    public List<Rotina> listarTomados(int usuarioId) {
        List<Rotina> lista = new ArrayList<>();

        String sql = "SELECT m.medicamento_id, m.nome AS nome_medicamento, med.nome AS nome_medico, m.observacoes "
                + "FROM medicamentos m "
                + "JOIN medicos med ON m.medico_id = med.medico_id "
                + "WHERE m.usuario_id = ? AND m.tomado = 'SIM'";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Rotina r = new Rotina();
                r.setIdMedicamento(rs.getInt("medicamento_id"));
                r.setNomeMedicamento(rs.getString("nome_medicamento"));
                r.setNomeMedico(rs.getString("nome_medico"));
                r.setObservacoes(rs.getString("observacoes"));
                lista.add(r);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar medicamentos tomados: " + e.getMessage());
        }

        return lista;
    }

    public void marcarComoTomado(int idMedicamento) {
        String sql = "UPDATE medicamentos SET tomado = 'SIM' WHERE medicamento_id = ?";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idMedicamento);
            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao marcar como tomado: " + e.getMessage());
        }
    }

}
