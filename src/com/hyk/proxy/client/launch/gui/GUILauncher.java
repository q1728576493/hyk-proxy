/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Apr 9, 2010, 1:57:22 PM
 */

package com.hyk.proxy.client.launch.gui;

//import com.hyk.proxy.gae.client.httpserver.HttpServer;
import com.hyk.proxy.client.launch.LocalProxyServer;
import com.hyk.proxy.common.Constants;
import com.hyk.proxy.common.Version;
import com.hyk.rpc.core.RpcException;
import java.awt.Desktop;

import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * 
 * @author qiying.wang
 */
public class GUILauncher extends javax.swing.JFrame
{

	/** Creates new form NewJFrame */
	public GUILauncher() throws Exception
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		initComponents();
		setIconImage(new ImageIcon(getClass().getResource("/image/idle.png")).getImage());
		setTitle("hyk-proxy-client V" + Version.value);
		// jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("hyk-proxy-client V"
		// + Version.value));
		statusLable.setText("Idle");
		tray = new SysTray(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		jPanel1 = new javax.swing.JPanel();
		executeButton = new javax.swing.JButton();
		configButton = new javax.swing.JButton();
		aboutButton = new javax.swing.JButton();
		exitButton = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		mainPanel = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		statusLable = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		helpButton = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setLocationByPlatform(true);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosed(java.awt.event.WindowEvent evt)
			{
				formWindowClosed(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

		executeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/player_play.png"))); // NOI18N
		executeButton.setText("Start");
		executeButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				executeButtonActionPerformed(evt);
			}
		});

		configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/configure.png"))); // NOI18N
		configButton.setText("Config");
		configButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				configButtonActionPerformed(evt);
			}
		});

		aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/about.png"))); // NOI18N
		aboutButton.setText("About");
		aboutButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				aboutButtonActionPerformed(evt);
			}
		});

		exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
		exitButton.setText("Exit");
		exitButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				exitButtonActionPerformed(evt);
			}
		});

		jLabel1.setText("<html>Twitter: <font color=\"Blue\"> <u>@yinqiwen</u></font></html>");

		mainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Berlinermauer.jpg"))); // NOI18N

		javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				mainPanelLayout.createSequentialGroup().addContainerGap().addComponent(jLabel2).addContainerGap(390, Short.MAX_VALUE)).addComponent(
				jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				mainPanelLayout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
						javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(
						jLabel2).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		statusLable.setText("jLabel3");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Update.png"))); // NOI18N
		jButton1.setText("Upgrade");
		jButton1.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton1ActionPerformed(evt);
			}
		});

		helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help.png"))); // NOI18N
		helpButton.setText("Help");
		helpButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				helpButtonActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/share.png"))); // NOI18N
		jButton2.setText("Share");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(
										statusLable, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(
								mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(26, 26, 26).addGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(helpButton,
								javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(executeButton,
								javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(exitButton,
								javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(
								aboutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(
								configButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addComponent(
								jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								jPanel1Layout.createSequentialGroup().addComponent(executeButton).addGap(18, 18, 18).addComponent(configButton).addGap(
										27, 27, 27).addComponent(jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
										Short.MAX_VALUE).addComponent(jButton1).addGap(18, 18, 18).addComponent(helpButton).addGap(18, 18, 18).addComponent(
										aboutButton).addGap(18, 18, 18).addComponent(exitButton).addGap(41, 41, 41)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 306,
										javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										10, Short.MAX_VALUE).addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(statusLable)).addContainerGap()))));

		jLabel1.getAccessibleContext().setAccessibleName(
				"<html>This is html text that includes a <font color=\"Blue\"> <u>hyperlink</u></font></html>");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public void exit()
	{
		try
		{
			if(null != server)
			{
				getHttpServer().stop();
			}
		}
		catch(Exception ex)
		{
			Logger.getLogger(GUILauncher.class.getName()).log(Level.SEVERE, null, ex);
		}
		finally
		{
			System.exit(1);
		}
	}

	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_exitButtonActionPerformed
		exit();
	}// GEN-LAST:event_exitButtonActionPerformed

	private void configButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_configButtonActionPerformed
		try
		{
			getConfigDialog().start();
		}
		catch(IOException ex)
		{
			Logger.getLogger(GUILauncher.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_configButtonActionPerformed

	private void executeButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_executeButtonActionPerformed
		updateExeucteButton();
	}// GEN-LAST:event_executeButtonActionPerformed

	private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_aboutButtonActionPerformed
		getAboutDialog().setVisible(true);
	}// GEN-LAST:event_aboutButtonActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton1ActionPerformed
		JOptionPane.showMessageDialog(null, "Not support in this version!");
	}// GEN-LAST:event_jButton1ActionPerformed

	private void formWindowClosed(java.awt.event.WindowEvent evt)
	{// GEN-FIRST:event_formWindowClosed
		setVisible(false);
	}// GEN-LAST:event_formWindowClosed

	private void helpButtonActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_helpButtonActionPerformed

		try
		{
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(new URI(Constants.OFFICIAL_SITE));
		}
		catch(Exception ex)
		{
			Logger.getLogger(GUILauncher.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_helpButtonActionPerformed

	protected LocalProxyServer getHttpServer() throws RpcException, Exception
	{
		if(null == server)
		{
			server = new LocalProxyServer();
		}
		return server;
	}

	protected void updateExeucteButton()
	{
		try
		{
			hasStart = !hasStart;
			if(hasStart)
			{
				final LocalProxyServer temp = getHttpServer();
				statusLable.setText("Starting...");
				new Thread(new Runnable()
				{
					public void run()
					{
						try
						{
							statusLable.setText(temp.launch());
						}
						catch(Exception ex)
						{
							JOptionPane.showMessageDialog(null, ex.getMessage());
						}
					}
				}).start();

				executeButton.setIcon(ImageUtil.STOP); // NOI18N
				executeButton.setText("Stop");
			}
			else
			{
				getHttpServer().stop();
				statusLable.setText("Stoped");
				executeButton.setIcon(ImageUtil.START); // NOI18N
				executeButton.setText("Start");
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					new GUILauncher().setVisible(true);
				}
				catch(Exception ex)
				{
					Logger.getLogger(GUILauncher.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

	protected ConfigDialog getConfigDialog()
	{
		if(null == config)
		{
			final ConfigDialog dialog = new ConfigDialog(new javax.swing.JFrame(), true);
			config = dialog;
			java.awt.EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					dialog.addWindowListener(new java.awt.event.WindowAdapter()
					{
						public void windowClosing(java.awt.event.WindowEvent e)
						{
							dialog.setVisible(false);
						}
					});
					dialog.setVisible(true);
				}
			});
		}
		return config;
	}

	protected AboutDialog getAboutDialog()
	{
		if(null == about)
		{
			about = new AboutDialog(new javax.swing.JFrame(), true);
			about.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent e)
				{
					about.setVisible(false);
				}
			});
		}
		return about;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton	aboutButton;
	private javax.swing.JButton	configButton;
	private javax.swing.JButton	executeButton;
	private javax.swing.JButton	exitButton;
	private javax.swing.JButton	helpButton;
	private javax.swing.JButton	jButton1;
	private javax.swing.JButton	jButton2;
	private javax.swing.JLabel	jLabel1;
	private javax.swing.JLabel	jLabel2;
	private javax.swing.JLabel	jLabel3;
	private javax.swing.JPanel	jPanel1;
	private javax.swing.JPanel	mainPanel;
	private javax.swing.JLabel	statusLable;
	// End of variables declaration//GEN-END:variables

	private ConfigDialog		config		= null;

	private AboutDialog			about		= null;

	private boolean				hasStart	= false;

	private LocalProxyServer	server;

	private SysTray				tray;

}
