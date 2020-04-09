package Views;

import Models.Team;
import Models.TeamHash;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neal Nisbet B00380762
 */
public class TeamsUI extends javax.swing.JFrame {
    private Team[] teams;
    private HashMap<Integer, Team> teamMap;
    
    public TeamsUI(){
       TeamHash teamHash = new TeamHash();
       teamMap = teamHash.AllTeamsHash();
       teams = teamHash.AllTeamsArray();
       
       initComponents();
       
       teams = teamHash.AllTeamsArray();
       
       JComboBox teams_cmbo = new JComboBox(teams);
       menu_holder.add(teams_cmbo);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left_panel = new javax.swing.JPanel();
        menu_holder = new javax.swing.JPanel();
        menu_title_holder = new javax.swing.JPanel();
        compare_lbl = new javax.swing.JLabel();
        shadow_btn1 = new javax.swing.JPanel();
        teams_btn = new javax.swing.JPanel();
        teams_lbl = new javax.swing.JLabel();
        teams_rdo = new javax.swing.JRadioButton();
        shadow_btn2 = new javax.swing.JPanel();
        team1_cmbo = new javax.swing.JComboBox<>();
        team2_cmbo = new javax.swing.JComboBox<>();
        players_holder = new javax.swing.JPanel();
        players_lbl = new javax.swing.JLabel();
        players_rdo = new javax.swing.JRadioButton();
        shadow_btn3 = new javax.swing.JPanel();
        go_btn = new javax.swing.JButton();
        error_lbl = new javax.swing.JLabel();
        logo_holder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shadow = new javax.swing.JLabel();
        right_panel = new javax.swing.JPanel();
        right_top_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        team1_title_lbl = new javax.swing.JLabel();
        team1_lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        team2_title_lbl = new javax.swing.JLabel();
        team2_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teams_tbl = new javax.swing.JTable();
        clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        left_panel.setBackground(new java.awt.Color(3, 101, 100));
        left_panel.setToolTipText("left-panel");
        left_panel.setAlignmentX(0.0F);
        left_panel.setAlignmentY(0.0F);
        left_panel.setMaximumSize(new java.awt.Dimension(300, 900));
        left_panel.setMinimumSize(new java.awt.Dimension(300, 900));
        left_panel.setName("left-panel"); // NOI18N
        left_panel.setPreferredSize(new java.awt.Dimension(300, 900));

        menu_holder.setBackground(left_panel.getBackground());
        menu_holder.setMaximumSize(new java.awt.Dimension(300, 500));
        menu_holder.setMinimumSize(new java.awt.Dimension(300, 500));
        menu_holder.setPreferredSize(new java.awt.Dimension(300, 500));

        menu_title_holder.setBackground(new java.awt.Color(3, 22, 52));
        menu_title_holder.setMaximumSize(new java.awt.Dimension(300, 80));
        menu_title_holder.setMinimumSize(new java.awt.Dimension(300, 80));

        compare_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compare.png"))); // NOI18N

        javax.swing.GroupLayout menu_title_holderLayout = new javax.swing.GroupLayout(menu_title_holder);
        menu_title_holder.setLayout(menu_title_holderLayout);
        menu_title_holderLayout.setHorizontalGroup(
            menu_title_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_title_holderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compare_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_title_holderLayout.setVerticalGroup(
            menu_title_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_title_holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compare_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        shadow_btn1.setBackground(new java.awt.Color(3, 54, 73));
        shadow_btn1.setMaximumSize(new java.awt.Dimension(300, 5));
        shadow_btn1.setMinimumSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout shadow_btn1Layout = new javax.swing.GroupLayout(shadow_btn1);
        shadow_btn1.setLayout(shadow_btn1Layout);
        shadow_btn1Layout.setHorizontalGroup(
            shadow_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadow_btn1Layout.setVerticalGroup(
            shadow_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        teams_btn.setBackground(new java.awt.Color(3, 54, 73));

        teams_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teams.png"))); // NOI18N
        teams_lbl.setMaximumSize(new java.awt.Dimension(145, 33));
        teams_lbl.setMinimumSize(new java.awt.Dimension(145, 33));
        teams_lbl.setPreferredSize(new java.awt.Dimension(145, 33));

        teams_rdo.setBackground(teams_btn.getBackground());
        teams_rdo.setSelected(true);
        teams_rdo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout teams_btnLayout = new javax.swing.GroupLayout(teams_btn);
        teams_btn.setLayout(teams_btnLayout);
        teams_btnLayout.setHorizontalGroup(
            teams_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teams_btnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(teams_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teams_rdo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teams_btnLayout.setVerticalGroup(
            teams_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teams_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teams_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(teams_btnLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(teams_rdo)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        shadow_btn2.setBackground(menu_title_holder.getBackground());
        shadow_btn2.setMaximumSize(new java.awt.Dimension(300, 5));
        shadow_btn2.setMinimumSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout shadow_btn2Layout = new javax.swing.GroupLayout(shadow_btn2);
        shadow_btn2.setLayout(shadow_btn2Layout);
        shadow_btn2Layout.setHorizontalGroup(
            shadow_btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadow_btn2Layout.setVerticalGroup(
            shadow_btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        team1_cmbo.setBackground(new java.awt.Color(3, 54, 73));
        team1_cmbo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        team1_cmbo.setForeground(new java.awt.Color(255, 255, 255));
        team1_cmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Team1", "All Teams", "Glasgow Clan", "Sheffield Steelers" }));
        team1_cmbo.setAlignmentX(0.0F);
        team1_cmbo.setAlignmentY(0.0F);
        team1_cmbo.setBorder(null);
        team1_cmbo.setMaximumSize(new java.awt.Dimension(300, 50));
        team1_cmbo.setMinimumSize(new java.awt.Dimension(300, 50));
        team1_cmbo.setPreferredSize(new java.awt.Dimension(300, 50));
        team1_cmbo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                team1_cmboItemStateChanged(evt);
            }
        });

        team2_cmbo.setBackground(team1_cmbo.getBackground());
        team2_cmbo.setFont(team1_cmbo.getFont());
        team2_cmbo.setForeground(new java.awt.Color(255, 255, 255));
        team2_cmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Team2", "Glasgow Clan", "Sheffield Steelers" }));
        team2_cmbo.setAlignmentX(0.0F);
        team2_cmbo.setAlignmentY(0.0F);
        team2_cmbo.setBorder(null);
        team2_cmbo.setMaximumSize(new java.awt.Dimension(300, 50));
        team2_cmbo.setMinimumSize(new java.awt.Dimension(300, 50));
        team2_cmbo.setPreferredSize(new java.awt.Dimension(300, 50));
        team2_cmbo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                team2_cmboItemStateChanged(evt);
            }
        });

        players_holder.setBackground(teams_btn.getBackground());
        players_holder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                players_holderMousePressed(evt);
            }
        });

        players_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/players.png"))); // NOI18N

        players_rdo.setBackground(teams_btn.getBackground());
        players_rdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players_rdoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout players_holderLayout = new javax.swing.GroupLayout(players_holder);
        players_holder.setLayout(players_holderLayout);
        players_holderLayout.setHorizontalGroup(
            players_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(players_holderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(players_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(players_rdo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        players_holderLayout.setVerticalGroup(
            players_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(players_holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(players_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(players_holderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(players_rdo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shadow_btn3.setBackground(menu_title_holder.getBackground());
        shadow_btn3.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout shadow_btn3Layout = new javax.swing.GroupLayout(shadow_btn3);
        shadow_btn3.setLayout(shadow_btn3Layout);
        shadow_btn3Layout.setHorizontalGroup(
            shadow_btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shadow_btn3Layout.setVerticalGroup(
            shadow_btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        go_btn.setBackground(new java.awt.Color(3, 22, 52));
        go_btn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        go_btn.setForeground(new java.awt.Color(255, 255, 255));
        go_btn.setText("GO");
        go_btn.setAlignmentY(0.0F);
        go_btn.setMargin(new java.awt.Insets(5, 0, 0, 0));
        go_btn.setMaximumSize(new java.awt.Dimension(300, 50));
        go_btn.setMinimumSize(new java.awt.Dimension(300, 50));
        go_btn.setPreferredSize(new java.awt.Dimension(300, 50));
        go_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_btnMouseClicked(evt);
            }
        });

        error_lbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        error_lbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menu_holderLayout = new javax.swing.GroupLayout(menu_holder);
        menu_holder.setLayout(menu_holderLayout);
        menu_holderLayout.setHorizontalGroup(
            menu_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_title_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shadow_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(teams_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shadow_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(players_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shadow_btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(menu_holderLayout.createSequentialGroup()
                .addGroup(menu_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(team1_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(team2_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menu_holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_holderLayout.setVerticalGroup(
            menu_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_holderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(menu_title_holder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shadow_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teams_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shadow_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(team1_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(team2_cmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(players_holder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shadow_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(go_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        logo_holder.setBackground(left_panel.getBackground());

        jLabel1.setFont(new java.awt.Font("Titillium Web Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 54, 73));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("19/20 statistics provided by www.eliteleague.co.uk");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout logo_holderLayout = new javax.swing.GroupLayout(logo_holder);
        logo_holder.setLayout(logo_holderLayout);
        logo_holderLayout.setHorizontalGroup(
            logo_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logo_holderLayout.setVerticalGroup(
            logo_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logo_holderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addComponent(menu_holder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_panelLayout.createSequentialGroup()
                .addComponent(menu_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo_holder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shadow.png"))); // NOI18N
        shadow.setAlignmentY(0.0F);
        shadow.setMinimumSize(new java.awt.Dimension(20, 900));
        shadow.setName("shadow"); // NOI18N

        right_panel.setToolTipText("right-panel");
        right_panel.setMaximumSize(new java.awt.Dimension(1180, 900));
        right_panel.setMinimumSize(new java.awt.Dimension(1180, 900));
        right_panel.setPreferredSize(new java.awt.Dimension(1180, 900));

        right_top_panel.setMaximumSize(new java.awt.Dimension(700, 100));
        right_top_panel.setMinimumSize(new java.awt.Dimension(700, 100));
        right_top_panel.setPreferredSize(new java.awt.Dimension(700, 100));

        team1_title_lbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        team1_title_lbl.setForeground(new java.awt.Color(3, 22, 52));
        team1_title_lbl.setText("Team 1:");

        team1_lbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        team1_lbl.setForeground(new java.awt.Color(3, 54, 73));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(team1_title_lbl)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(team1_lbl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(team1_lbl)
                        .addComponent(team1_title_lbl))
                    .addGap(0, 0, 0)))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(250, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 100));

        team2_title_lbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        team2_title_lbl.setForeground(new java.awt.Color(3, 22, 52));
        team2_title_lbl.setText("Team 2:");

        team2_lbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        team2_lbl.setForeground(new java.awt.Color(3, 54, 73));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(team2_title_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(team2_lbl)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(team2_title_lbl)
                    .addComponent(team2_lbl))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout right_top_panelLayout = new javax.swing.GroupLayout(right_top_panel);
        right_top_panel.setLayout(right_top_panelLayout);
        right_top_panelLayout.setHorizontalGroup(
            right_top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_top_panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        right_top_panelLayout.setVerticalGroup(
            right_top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_top_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(right_top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(700, 800));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(700, 700));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 800));

        teams_tbl.setBackground(right_panel.getBackground());
        teams_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team Name", "Games played ", "Wins", "Losses", "O/T Wins", "O/T Losses", "Win %", "Points", "Goals Scored", "Goals Against", "Avg Goals For", "Avg Goals Against", "Avg Attendance", "Shots on Goal For", "Shots on Goal Against", "Face off Win %", "Face off Total", "Power Play Win %", "Power Play Total", "Penalty Kills %", "Penalty Kills Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teams_tbl.setAlignmentX(0.0F);
        teams_tbl.setAlignmentY(0.0F);
        jScrollPane1.setViewportView(teams_tbl);

        clear_btn.setText("clear");
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout right_panelLayout = new javax.swing.GroupLayout(right_panel);
        right_panel.setLayout(right_panelLayout);
        right_panelLayout.setHorizontalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(right_top_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clear_btn)))
                .addContainerGap())
        );
        right_panelLayout.setVerticalGroup(
            right_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_panelLayout.createSequentialGroup()
                .addComponent(right_top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear_btn)
                .addGap(0, 153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1516, 939));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void players_rdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players_rdoActionPerformed
        //create new instance of teams ui    
        PlayersUI playersUI = new PlayersUI();
        //close this view
        this.dispose();
        //open the teams view & set it to visible
        playersUI.setVisible(true);
    }//GEN-LAST:event_players_rdoActionPerformed

    private void players_holderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_players_holderMousePressed
        //create new instance of teams ui    
        PlayersUI playersUI = new PlayersUI();
        //close this view
        this.dispose();
        //open the teams view & set it to visible
        playersUI.setVisible(true);
    }//GEN-LAST:event_players_holderMousePressed

    private void go_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_btnMouseClicked
        String selectedTeam1 = (String)team1_cmbo.getSelectedItem();
        String selectedTeam2 = (String)team2_cmbo.getSelectedItem();
        DefaultTableModel tableModel = (DefaultTableModel) teams_tbl.getModel();
        
        for(Map.Entry<Integer, Team> entry : teamMap.entrySet()) {
            if(entry.getValue().getTeamName().equals(selectedTeam1)){
                for(int i = 0; i < teamMap.size(); i++){
                    Object[] teamData = new Object[21];
                    teamData[0] = teamMap.get(i).getTeamName();
                    teamData[1] = teamMap.get(i).getGamesPlayed();
                    teamData[2] = teamMap.get(i).getWins();
                    teamData[3] = teamMap.get(i).getLosses();
                    teamData[4] = teamMap.get(i).getOvertimeWins();
                    teamData[5] = teamMap.get(i).getOvertimeLosses();
                    teamData[6] = teamMap.get(i).getWinPct();
                    teamData[7] = teamMap.get(i).getPoints();
                    teamData[8] = teamMap.get(i).getGoalsScored();
                    teamData[9] = teamMap.get(i).getGoalsAgainst();
                    teamData[10] = teamMap.get(i).getAvgGoalsFor();
                    teamData[11] = teamMap.get(i).getAvgGoalsAgainst();
                    teamData[12] = teamMap.get(i).getAvgAttendance();
                    teamData[13] = teamMap.get(i).getShotsOnGoalFor();
                    teamData[14] = teamMap.get(i).getShotsOnGoalAgainst();
                    teamData[15] = teamMap.get(i).getFaceoffWinPct();
                    teamData[16] = teamMap.get(i).getFaceoffWinTotal();
                    teamData[17] = teamMap.get(i).getPowerplayPct();
                    teamData[18] = teamMap.get(i).getPowerplayTotal();
                    teamData[19] = teamMap.get(i).getPenaltyKillsPct();
                    teamData[20] = teamMap.get(i).getPenaltyKillsTotal();                    
                    
                    tableModel.addRow(teamData);
                }
            }
        }
        
    }//GEN-LAST:event_go_btnMouseClicked

    private void team1_cmboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_team1_cmboItemStateChanged
        String selectedTeam = (String)team1_cmbo.getSelectedItem();
        
        //check if the selected team is all
        if(selectedTeam.equalsIgnoreCase("all teams")){
            //if it is we dont need a second team
            team2_cmbo.setVisible(false);
            team1_lbl.setText(selectedTeam);
            team2_title_lbl.setVisible(false);
        }
        else{
            //if not we do
            team2_cmbo.setVisible(true);
        }
        
        team1_lbl.setText(selectedTeam);
    }//GEN-LAST:event_team1_cmboItemStateChanged

    private void team2_cmboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_team2_cmboItemStateChanged
        String selectedTeam1 = (String)team1_cmbo.getSelectedItem();
        String selectedTeam2 = (String)team2_cmbo.getSelectedItem();
        
        //make sure the teams selected are different
        if(selectedTeam1 == selectedTeam2){
            error_lbl.setText("Error: please select different teams");
        }
        
        team2_lbl.setText(selectedTeam2);
    }//GEN-LAST:event_team2_cmboItemStateChanged

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        //clear the table
        DefaultTableModel tableModel = (DefaultTableModel) teams_tbl.getModel();
        tableModel.setRowCount(0);
    }//GEN-LAST:event_clear_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeamsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new TeamsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel compare_lbl;
    private javax.swing.JLabel error_lbl;
    private javax.swing.JButton go_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel left_panel;
    private javax.swing.JPanel logo_holder;
    private javax.swing.JPanel menu_holder;
    private javax.swing.JPanel menu_title_holder;
    private javax.swing.JPanel players_holder;
    private javax.swing.JLabel players_lbl;
    private javax.swing.JRadioButton players_rdo;
    private javax.swing.JPanel right_panel;
    private javax.swing.JPanel right_top_panel;
    private javax.swing.JLabel shadow;
    private javax.swing.JPanel shadow_btn1;
    private javax.swing.JPanel shadow_btn2;
    private javax.swing.JPanel shadow_btn3;
    private javax.swing.JComboBox<String> team1_cmbo;
    private javax.swing.JLabel team1_lbl;
    private javax.swing.JLabel team1_title_lbl;
    private javax.swing.JComboBox<String> team2_cmbo;
    private javax.swing.JLabel team2_lbl;
    private javax.swing.JLabel team2_title_lbl;
    private javax.swing.JPanel teams_btn;
    private javax.swing.JLabel teams_lbl;
    private javax.swing.JRadioButton teams_rdo;
    private javax.swing.JTable teams_tbl;
    // End of variables declaration//GEN-END:variables
}
