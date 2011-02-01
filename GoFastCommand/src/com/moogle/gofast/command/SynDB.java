package com.moogle.gofast.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ResourceBundle;

import com.moogle.gofast.command.domain.GoFastArea;
import com.moogle.gofast.command.domain.GoFastCat;
import com.moogle.gofast.command.domain.GoFastCustomer;
import com.moogle.gofast.command.domain.GoFastItem;
import com.moogle.gofast.command.domain.GoFastLocation;

/**
 * @author Chatchai
 * 
 */
public class SynDB {
	private static final long serialVersionUID = 1L;
	private static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/GOFASTDB";
	private static String USER = "root";
	private static String PASSWORD = "";
	private static final SimpleDateFormat format = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	private static final int MAX_STATMENT = 20;
	public static final ResourceBundle myResources = ResourceBundle
			.getBundle("db");

	static {
		DRIVER_CLASS = myResources.getString("db.driverClassName");
		URL = myResources.getString("db.url");
		USER = myResources.getString("db.username");
		PASSWORD = myResources.getString("db.password");
		// System.out.println("root_user="+root_user);
	}

	public SynDB() {
		super();

		// TODO Auto-generated constructor stub
	}

	private Connection createConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			/*
			 * if (con != null) {
			 * System.out.println(" connection obj = "+con.toString()); }
			 */
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

	private void closeStatement(PreparedStatement pst) {
		// System.out.println("closeStatement");
		if (pst != null) {
			try {
				pst.close();
				pst = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private int queryStatement(PreparedStatement pst) {
		int recodeCount = 0;
		try {
			recodeCount = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pst = null;
			}
		}
		return recodeCount;
	}

	public void insertCatalog(List catalogs) {
		Connection connection = null;
		PreparedStatement pst2 = null;
		try {
			connection = createConnection();
			String query = " ";
			if (connection != null) {

				query = " INSERT INTO  GO_FAST_CAT (GFCA_NAME, GFCA_DETAIL,GFCA_ICON_NAME,GFCA_ICON_PATH" +
						",GFCA_LEVEL,GFCA_PARENT)"
						+ " VALUES (?,?,?,?,?,?)";
				try {
					if (catalogs != null && catalogs.size() > 0) {
						int size = catalogs.size();
						for (int i = 0; i < size; i++) {
							GoFastCat goFastCat = (GoFastCat) catalogs.get(i);
							pst2 = connection
									.prepareStatement(query.toString());
							pst2.setString(1, goFastCat.getGfcaName());
							pst2.setString(2, goFastCat.getGfcaDetail());
							pst2.setString(3, goFastCat.getGfcaIconName());
							pst2.setString(4, goFastCat.getGfcaIconPath());
							if(goFastCat.getGfcaLevel()!=null)
								pst2.setInt(5, goFastCat.getGfcaLevel());
							else
								pst2.setNull(5, java.sql.Types.INTEGER);
							 
							if(goFastCat.getGfcaParent()!=null)
								pst2.setInt(6, goFastCat.getGfcaParent());
							else
								pst2.setNull(6, java.sql.Types.INTEGER);
							
							pst2.executeUpdate();
							if (i % MAX_STATMENT == 0)
								closeStatement(pst2);
						}

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				closeStatement(pst2);
				if (connection != null) {
					if (!connection.isClosed())
						connection.close();
					connection = null;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// e.printStackTrace();
			}
		}

	}
	public void insertCustomer(List customers) {
		Connection connection = null;
		PreparedStatement pst2 = null;
		try {
			connection = createConnection();
			String query = " ";
			if (connection != null) {

				query = " INSERT INTO  GO_FAST_CUSTOMER (GFC_NAME,GFC_DETAIL,GFC_LAT,GFC_LONG,GFC_ICON_NAME,GFC_ICON_PATH" +
						",GFC_PHONE,GFC_EMAIL,GFC_STATUS)"
						+ " VALUES (?,?,?,?,?,?,?,?,?)";
				try {
					if (customers != null && customers.size() > 0) {
						int size = customers.size();
						for (int i = 0; i < size; i++) {
							System.out.println(" index "+i);
							GoFastCustomer cust = (GoFastCustomer) customers.get(i);
							pst2 = connection
									.prepareStatement(query.toString());
							pst2.setString(1, cust.getGfcName());
							System.out.println("Detail="+cust.getGfcDetail());
							pst2.setString(2, cust.getGfcDetail());
							pst2.setDouble(3, cust.getGfcLat());
							pst2.setDouble(4, cust.getGfcLong());
							pst2.setString(5, cust.getGfcIconName());
							pst2.setString(6, cust.getGfcIconPath());
							pst2.setString(7, cust.getGfcPhone());
							pst2.setString(8, cust.getGfcEmail());
							pst2.setString(9, cust.getGfcStatus());
							
							pst2.executeUpdate();
							if (i % MAX_STATMENT == 0)
								closeStatement(pst2);
						}

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				closeStatement(pst2);
				if (connection != null) {
					if (!connection.isClosed())
						connection.close();
					connection = null;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// e.printStackTrace();
			}
		}

	}
	public void insertLocation(List locations) {
		Connection connection = null;
		PreparedStatement pst2 = null;
		try {
			connection = createConnection();
			String query = " ";
			if (connection != null) {

				query = " INSERT INTO  GO_FAST_LOCATION (GFL_NAME, GFL_DETAIL)"
						+ " VALUES (?,?)";
				try {
					if (locations != null && locations.size() > 0) {
						int size = locations.size();
						for (int i = 0; i < size; i++) {
							GoFastLocation goFastLocation = (GoFastLocation) locations.get(i);
							pst2 = connection
									.prepareStatement(query.toString());
							pst2.setString(1, goFastLocation.getGflName());
							pst2.setString(2, goFastLocation.getGflDetail());
							pst2.executeUpdate();
							if (i % MAX_STATMENT == 0)
								closeStatement(pst2);
						}

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				closeStatement(pst2);
				if (connection != null) {
					if (!connection.isClosed())
						connection.close();
					connection = null;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// e.printStackTrace();
			}
		}

	}
	public void insertArea(List areas) {
		Connection connection = null;
		PreparedStatement pst2 = null;
		try {
			connection = createConnection();
			String query = " ";
			if (connection != null) {

				query = " INSERT INTO  GO_FAST_AREA (GFA_NAME, GFA_DETAIL,GFL_ID)"
						+ " VALUES (?,?,?)";
				try {
					if (areas != null && areas.size() > 0) {
						int size = areas.size();
						for (int i = 0; i < size; i++) {
							GoFastArea area = (GoFastArea) areas.get(i);
							pst2 = connection
									.prepareStatement(query.toString());
							pst2.setString(1, area.getGfaName());
							pst2.setString(2, area.getGfaDetail());
							if(area.getGflId()!=null)
								pst2.setInt(3, area.getGflId());
							else
								pst2.setNull(3, java.sql.Types.INTEGER);
							 
							pst2.executeUpdate();
							if (i % MAX_STATMENT == 0)
								closeStatement(pst2);
						}

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				closeStatement(pst2);
				if (connection != null) {
					if (!connection.isClosed())
						connection.close();
					connection = null;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// e.printStackTrace();
			}
		}

	}
	public void insertItem(List items) {
		Connection connection = null;
		PreparedStatement pst2 = null;
		try {
			connection = createConnection();
			String query = " ";
			if (connection != null) {

				query = " INSERT INTO  GO_FAST_ITEM (GFI_NAME,GFI_DETAIL,GFI_DISCOUNT,GFI_STATUS,GFC_ID,GFCA_ID,GFA_ID)"
						+ " VALUES (?,?,?,?,?,?,?)";
				try {
					if (items != null && items.size() > 0) {
						int size = items.size();
						for (int i = 0; i < size; i++) {
							GoFastItem item = (GoFastItem) items.get(i);
							pst2 = connection
									.prepareStatement(query.toString());
							pst2.setString(1, item.getGfiName());
							pst2.setString(2, item.getGfiDetail());
							pst2.setString(3, item.getGfiDiscount());
							pst2.setString(4, item.getGfiStatus());
							System.out.println("item.getGfcId()=>"+item.getGfcId());
							if(item.getGfcId()!=null)
								pst2.setInt(5, item.getGfcId());
							else
								pst2.setNull(5, java.sql.Types.INTEGER);
							
							if(item.getGfcaId()!=null)
								pst2.setInt(6, item.getGfcaId());
							else
								pst2.setNull(6, java.sql.Types.INTEGER);
							
							if( item.getGfaId()!=null)
								pst2.setInt(7,  item.getGfaId());
							else
								pst2.setNull(7, java.sql.Types.INTEGER);
							 
							pst2.executeUpdate();
							if (i % MAX_STATMENT == 0)
								closeStatement(pst2);
						}

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				closeStatement(pst2);
				if (connection != null) {
					if (!connection.isClosed())
						connection.close();
					connection = null;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// e.printStackTrace();
			}
		}

	}
}
