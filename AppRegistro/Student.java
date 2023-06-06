import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import lib.*;


class Frame implements ActionListener
{
    JFrame f1,f2,f3,f4;
    JButton breg,bedit,bdel,back1,bregister,breset,bcheck,back2,bupdate,bcheck1,bdelelte,back3;
    JLabel head1,head2,head3,head4;
    JLabel subtitle;
    JLabel lid,lname,lbatch,ldep,ladd,lmes,lstep1,lstep2,lsuccess;
    JLabel lid1,lcheck,lname1,ladd1,lupdate,lid2,lcheck1,lstate;
    JTextField tid1,tname1,tadd1,tid2;
    JTextField tid,tname,tbatch,tdep,tadd;
    Student_detail ob;

    // Método que cria a janela inical da interface gráfica
    void mainframe()
    {

        f1=new JFrame("Registro de Estudantes - Mauá"); // cria janela inicial

        head1=new JLabel("Registro de Estudantes");
        head1.setBounds(109, 70, 300, 50);
        head1.setFont(new Font("Arial Black",Font.PLAIN,22));
        head1.setForeground(Color.WHITE);


        breg=new JButton("Criar Estudante");
        breg.setBounds(140,150,200,50);
        breg.addActionListener(this);

        bedit=new JButton("Editar Informações");
        bedit.setBounds(140, 230, 200,50);
        bedit.addActionListener(this);

        bdel=new JButton("Deletar Estudante");
        bdel.setBounds(140,320,200,50);
        bdel.addActionListener(this);
        
        
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.getContentPane().setBackground(Color.DARK_GRAY);




        f1.add(head1);
        f1.add(breg);
        f1.add(bedit);
        f1.add(bdel); 
    }

    // Método que cria a janela para registrar um novo estudante
    void reg_frame()
    {
        f2=new JFrame("Criar Estudante");
        f2.getContentPane().setBackground(Color.DARK_GRAY);

        head2=new JLabel("Formulário de Registro");
        head2.setBounds(110, 40, 300, 50);
        head2.setFont(new Font("Arial Black",Font.PLAIN,22));
        head2.setForeground(Color.WHITE);

        lid=new JLabel("RA : ");
        lid.setBounds(120,90,100,50);
        lid.setForeground(Color.WHITE);
        tid=new JTextField();
        tid.setBounds(250, 110, 100, 17);

        lname=new JLabel("Nome Aluno: ");
        lname.setBounds(120,130,100,50);
        lname.setForeground(Color.WHITE);
        tname=new JTextField();
        tname.setBounds(250,150,100,17);

        lbatch=new JLabel("Turma : ");
        lbatch.setBounds(120,170,100,50);
        lbatch.setForeground(Color.WHITE);
        tbatch=new JTextField();
        tbatch.setBounds(250,190,100,17);

        ldep=new JLabel("Curso : ");
        ldep.setBounds(120,210,120,50);
        ldep.setForeground(Color.WHITE);
        tdep=new JTextField();
        tdep.setBounds(250,230,100,17);

        ladd=new JLabel("Endereço : ");
        ladd.setBounds(120,250,120,50);
        ladd.setForeground(Color.WHITE);

        tadd=new JTextField();
        tadd.setBounds(250,270,100,17);

        bregister=new JButton("Registrar");
        bregister.setBounds(260,320,100,40);
        bregister.addActionListener(this);

        breset=new JButton("Reset");
        breset.setBounds(110,320,100,40);
        breset.addActionListener(this);



        back1=new JButton("Back");
        back1.setBounds(10,410,100,40);
        back1.addActionListener(this);

        lmes=new JLabel();
        lmes.setBounds(200,360,150,50);

        f2.setLayout(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(500,500);

        f2.add(head2);
        f2.add(lid);
        f2.add(tid);
        f2.add(lname);
        f2.add(tname);
        f2.add(lbatch);
        f2.add(tbatch);
        f2.add(tadd);
        f2.add(ladd);
        f2.add(bregister);
        f2.add(breset);
        f2.add(back1);
        f2.add(lmes);
        f2.add(tdep);
        f2.add(ldep);
    }


    // Método que cria a janela para editar as informações de um estudante
    void edit_frame()

    {

        f3=new JFrame("Editar Informações");
        f3.getContentPane().setBackground(Color.DARK_GRAY);
        head3=new JLabel("Editar Informações");
        head3.setBounds(110, 30, 300, 50);
        head3.setFont(new Font("Arial Black",Font.PLAIN,22));
        head3.setForeground(Color.WHITE);
        lstep1=new JLabel("1º Passo");
        lstep1.setBounds(50,90,100,30);
        lstep1.setForeground(Color.WHITE);
        lid1=new JLabel("RA : ");
        lid1.setBounds(70,120,100,30);
        lid1.setForeground(Color.WHITE);
        tid1=new JTextField();
        tid1.setBounds(200,130,100,17);

        
        bcheck=new JButton("Check");
        bcheck.setBounds(320,120,100,30);
        bcheck.addActionListener(this);

        lcheck=new JLabel();
        lcheck.setBounds(150,150,200,30);

        lstep2=new JLabel("2º Passo");
        lstep2.setBounds(50,200,100,30);
        lstep2.setForeground(Color.WHITE);
        lname1=new JLabel("Nome do Estudante : ");
        lname1.setBounds(70,230,200,30);
        lname1.setForeground(Color.WHITE);
        tname1=new JTextField();
        tname1.setBounds(250,240,100,17);
        tname1.setEditable(false);

        ladd1=new JLabel("Mudança de Endereço : ");
        ladd1.setBounds(70,270,200,30);
        ladd1.setForeground(Color.WHITE);
        tadd1=new JTextField();
        tadd1.setBounds(250,280,100,17);
        tadd1.setEditable(false);

        bupdate=new JButton("Update");
        bupdate.setBounds(170,320,100,30);
        bupdate.setEnabled(false);
        bupdate.addActionListener(this);

        lupdate=new JLabel("");
        lupdate.setBounds(150,350,200,30);

        back2=new JButton("Back");
        back2.setBounds(10,410,100,40);
        back2.addActionListener(this);
        
        bupdate=new JButton("Atualizar");
        bupdate.setBounds(170,320,100,30);
        bupdate.setEnabled(false);
        bupdate.addActionListener(this);

        f3.add(bcheck);
        f3.add(head3);
        f3.add(lstep1);
        f3.add(lid1);
        f3.add(tid1);
        f3.add(lcheck);
        f3.add(lstep2);
        f3.add(tadd1);
        f3.add(ladd1);
        f3.add(tname1);
        f3.add(lname1);
        f3.add(bupdate);
        f3.add(lupdate);
        f3.add(back2);

        f3.setLayout(null);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setSize(500,500);
    }
    // Método que cria a janela para excluir um estudante do sistema
    void del_frame()
    {
        f4=new JFrame("Deletar Estudante");
        f4.getContentPane().setBackground(Color.DARK_GRAY);
        head4=new JLabel("Deletar Estudante");
        head4.setBounds(150, 60, 300, 50);
        head4.setFont(new Font("Arial Black",Font.PLAIN,22));
        head4.setForeground(Color.WHITE);
        lid2=new JLabel("RA : ");
        lid2.setBounds(70,120,100,30);
        lid2.setForeground(Color.WHITE);
        tid2=new JTextField();
        tid2.setBounds(200,130,100,17);

        bcheck1=new JButton("Check");
        bcheck1.setBounds(320,120,100,30);
        bcheck1.addActionListener(this);

        lcheck1=new JLabel();
        lcheck1.setBounds(150,150,200,30);

        lstate=new JLabel();
        lstate.setBounds(150,220,230,30);
        lstate.setVisible(false);

        bdelelte=new JButton("Deletar");
        bdelelte.setBounds(160,270,100,30);
        bdelelte.addActionListener(this);
        bdelelte.setVisible(false);

        lsuccess=new JLabel("");
        lsuccess.setBounds(150,350,200,30);

        back3=new JButton("Back");
        back3.setBounds(10,410,100,40);
        back3.addActionListener(this);

        f4.add(head4);
        f4.add(lid2);
        f4.add(tid2);
        f4.add(bcheck1);
        f4.add(lcheck1);
        f4.add(lstate);
        f4.add(bdelelte);
        f4.add(back3);
        f4.add(lsuccess);

        f4.setLayout(null);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setSize(500,500);
    }
    Frame()
    {
        mainframe();
        reg_frame();
        edit_frame();
        del_frame();
    }

     // Método que executa as ações quando um botão é clicado
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("Criar Estudante"))
        {
            f1.setVisible(false);
            f2.setVisible(true);
        }
        if(s.equals("Editar Informações"))
        {
            f1.setVisible(false);
            f3.setVisible(true);
        }
        if(s.equals("Deletar Estudante"))
        {
            f1.setVisible(false);
            f4.setVisible(true);
        }
        if(s.equals("Back"))
        {
            if(f2.isVisible())
            {
                f2.setVisible(false);
                tname.setText("");
                tid.setText("");
                tbatch.setText("");
                tdep.setText("");
                tadd.setText("");
                lmes.setText("");
                f1.setVisible(true);
            }
            if(f3.isVisible())
            {
                f3.setVisible(false);
                tid1.setText("");
                lcheck.setText("");
                tname1.setText("");
                tadd1.setText("");
                tadd1.setEditable(false);
                bupdate.setEnabled(false);
                lupdate.setText("");
                f1.setVisible(true);
            }
            if(f4.isVisible())
            {
                f4.setVisible(false);
                tid2.setText("");
                bdelelte.setVisible(false);
                lstate.setVisible(false);
                lcheck1.setText("");
                lsuccess.setText("");
                f1.setVisible(true);
            }
        }
        // Verifica qual botão foi clicado
        if(s.equals("Registrar"))
        {
            if(tname.getText().equals("")||tid.getText().equals("")||tbatch.getText().equals("")||tdep.getText().equals("")||tadd.getText().equals(""))
            {
                lmes.setText("Campos Vazios!");
                lmes.setForeground(Color.RED);
            }
            else
            {
                ob=new Student_detail(tname.getText(),tid.getText(),tbatch.getText(),tdep.getText(),tadd.getText());
                if(ob.add_detail()==1)
                {
                    lmes.setText("Registrado!");
                    lmes.setForeground(Color.GREEN);
                }
                else
                {
                   lmes.setText("Erro no Registro!");
                   lmes.setForeground(Color.RED);
                }
            }
        }
        if(s.equals("Reset"))
        {
            tname.setText("");
            tid.setText("");
            tbatch.setText("");
            tdep.setText("");
            tadd.setText("");
            lmes.setText("");
        }
        if(s.equals("Check"))
        {
            ob=new Student_detail();
            if(f3.isVisible())
            {
                if(ob.check(tid1.getText())==1)
                {
                    lcheck.setText("Estudante Existente");
                    lcheck.setForeground(Color.green);
                    tname1.setText(ob.name);
                    tadd1.setEditable(true);
                    bupdate.setEnabled(true);
                }
                else    
                {
                    lcheck.setText("Estudante Inexistente");
                    lcheck.setForeground(Color.orange);
                }
            }
            if(f4.isVisible())
            {
                if(ob.check(tid2.getText())==1)
                {
                    lcheck1.setText("Estudante Existente");
                    lcheck1.setForeground(Color.green);
                    lstate.setText("Você tem certeza que deseja deletar?");
                    lstate.setForeground(Color.orange);
                    lstate.setVisible(true);
                    bdelelte.setVisible(true);
                }
                else    
                {
                    lcheck1.setText("Estudante Inexistente");
                    lcheck1.setForeground(Color.orange);
                }
            }
        }
        if(s.equals("Atualizar"))
        {
            if(tadd1.getText().equals(""))
            {
                lupdate.setText("Campos Vazios!");
                lupdate.setForeground(Color.RED);
            }
            else if(ob.update(tadd1.getText())==1)
            {
                lupdate.setText("Atualizado!");
                lupdate.setForeground(Color.GREEN);
            }
            else
            {
                lupdate.setText("Erro no Registro!");
                lupdate.setForeground(Color.RED);
            }
        }
        if(s.equals("Deletar"))
        {
            if(ob.deleted(tid2.getText())==1)
            {
                lsuccess.setText("Deletado com Sucesso!");
                lsuccess.setForeground(Color.GREEN);
            }
            else
            {
                lsuccess.setText("Erro no Registro!");
                lsuccess.setForeground(Color.RED);
            }
        }
    }
}
class Student 
{
    public static void main(String[] args) {
        new Frame();
    }
}