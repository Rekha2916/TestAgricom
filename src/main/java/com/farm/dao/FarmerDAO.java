package com.farm.dao;
import java.util.List; 
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.farm.model.FarmerCrop;


public class FarmerDAO {
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveData(FarmerCrop e)
	{
		System.out.println("in save data..");
		String query="insert into g3_crops (cId,cType,cName,cFertilizerType,cQuantity)  values(crops_seq.nextval,'"+e.getcType()+"','"+e.getcName()+"','"+e.getcFertilizerType()+"','"+e.getcQuantity()+"')";
		return jdbcTemplate.update(query);
	}

	public List<FarmerCrop> getCrops(){    
		return jdbcTemplate.query( "select * from g3_crops", new ResultSetExtractor<List<FarmerCrop>>(){  
			public List<FarmerCrop> extractData(ResultSet rs) throws SQLException, DataAccessException {    
				List<FarmerCrop> list=new ArrayList<FarmerCrop>();  
				while(rs.next()){  
					FarmerCrop f=new FarmerCrop();
					f.setcId(rs.getInt(1));
					f.setcType(rs.getString(2));
					f.setcName(rs.getString(3));
					f.setcFertilizerType(rs.getString(4));
					f.setcQuantity(rs.getInt(5));
					f.setcStatus(rs.getInt(6));
					f.setcBasePrice(rs.getInt(7));

					list.add(f);  
				}  
				return list;  
			}  
		});
	}
}
