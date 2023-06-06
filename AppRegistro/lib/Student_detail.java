package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_detail {
    public String rno;
    private String batch;
    public String dep;
    private String address;
    public String name;

    public Student_detail(String name1, String rn, String b, String d, String add) {
        name = name1;
        rno = rn;
        batch = b;
        dep = d;
        address = add;
    }

    public Student_detail() {}

    public int add_detail() {
        try  {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BaseDados", "root", "teste123");
            String query1 = "INSERT INTO Student (RA, Nome, Turma, Curso, Endereço) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement mystmt = conn.prepareStatement(query1);
            mystmt.setString(1, rno);
            mystmt.setString(2, name);
            mystmt.setString(3, batch);
            mystmt.setString(4, dep);
            mystmt.setString(5, address);
            mystmt.executeUpdate();
            conn.close();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int check(String id) {
        try  {
            rno = id;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BaseDados", "root", "teste123");
            PreparedStatement stmt = conn.prepareStatement("SELECT Nome FROM Student WHERE RA=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                name = rs.getString("Nome");
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int update(String add) {
        try  {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BaseDados", "root", "teste123");
            PreparedStatement stmt = conn.prepareStatement("UPDATE Student SET Endereço=? WHERE RA=?");
            stmt.setString(1, add);
            stmt.setString(2, rno);
            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleted(String id) {
        try  {           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BaseDados", "root", "teste123");
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Student WHERE RA=?");
            stmt.setString(1, id);
            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Student_detail getByReg(String string) {
        return null;
    }

    public int insert(String name, String rno, String batch, String dep, String address) {
        this.name = name;
        this.rno = rno;
        this.batch = batch;
        this.dep = dep;
        this.address = address;
        return add_detail();
    }
}