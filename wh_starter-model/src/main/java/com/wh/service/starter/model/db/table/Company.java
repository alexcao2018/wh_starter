	package com.wh.service.starter.model.db.table;
	import javax.persistence.*;
	import java.io.Serializable;
	import java.util.Date;
	import com.project.base.model.IEntity;
	import io.swagger.annotations.ApiModelProperty;

	/// <summary>
	/// 
	/// </summary>
	@Table(name = "company")
	public class  Company implements IEntity<Company, Integer>
	{
					@Id
			@GeneratedValue
			@Column(name="id")
			@ApiModelProperty("")
			private Integer id;

													/// <summary>
			/// 公司名
			/// Length : 200
			/// </summary>
			@ApiModelProperty("公司名")
			@Column(name="name")
			private String name;

								/// <summary>
			/// 
			/// Length : 255
			/// </summary>
			@ApiModelProperty("")
			@Column(name="owner")
			private String owner;

								/// <summary>
			/// 工商编号
			/// Length : 255
			/// </summary>
			@ApiModelProperty("工商编号")
			@Column(name="company_number")
			private String companyNumber;

								/// <summary>
			/// 
			/// Length : 255
			/// </summary>
			@ApiModelProperty("")
			@Column(name="tel_number")
			private String telNumber;

								/// <summary>
			/// 
			/// Length : 255
			/// </summary>
			@ApiModelProperty("")
			@Column(name="address")
			private String address;

								/// <summary>
			/// 1 正常 0 异常
			/// Length : 
			/// </summary>
			@ApiModelProperty("1 正常 0 异常")
			@Column(name="status")
			private Integer status;

								/// <summary>
			/// 0 中小微 1 大型
			/// Length : 
			/// </summary>
			@ApiModelProperty("0 中小微 1 大型")
			@Column(name="level")
			private Integer level;

								/// <summary>
			/// 
			/// Length : 
			/// </summary>
			@ApiModelProperty("")
			@Column(name="created_dt")
			private Date createdDt;

								/// <summary>
			/// 
			/// Length : 255
			/// </summary>
			@ApiModelProperty("")
			@Column(name="created_by")
			private String createdBy;

								/// <summary>
			/// 
			/// Length : 
			/// </summary>
			@ApiModelProperty("")
			@Column(name="updated_dt")
			private Date updatedDt;

								/// <summary>
			/// 
			/// Length : 255
			/// </summary>
			@ApiModelProperty("")
			@Column(name="updated_by")
			private String updatedBy;

							
public static final String _id = "id";
													
public static final String _name = "name";
								
public static final String _owner = "owner";
								
public static final String _companyNumber = "company_number";
								
public static final String _telNumber = "tel_number";
								
public static final String _address = "address";
								
public static final String _status = "status";
								
public static final String _level = "level";
								
public static final String _createdDt = "created_dt";
								
public static final String _createdBy = "created_by";
								
public static final String _updatedDt = "updated_dt";
								
public static final String _updatedBy = "updated_by";
							public Integer getId(){
									return id;
								}
public void setId(Integer id){
									this.id=id;
								}

													public String getName(){
									return name;
								}
public void setName(String name){
									this.name=name;
								}

								public String getOwner(){
									return owner;
								}
public void setOwner(String owner){
									this.owner=owner;
								}

								public String getCompanyNumber(){
									return companyNumber;
								}
public void setCompanyNumber(String companyNumber){
									this.companyNumber=companyNumber;
								}

								public String getTelNumber(){
									return telNumber;
								}
public void setTelNumber(String telNumber){
									this.telNumber=telNumber;
								}

								public String getAddress(){
									return address;
								}
public void setAddress(String address){
									this.address=address;
								}

								public Integer getStatus(){
									return status;
								}
public void setStatus(Integer status){
									this.status=status;
								}

								public Integer getLevel(){
									return level;
								}
public void setLevel(Integer level){
									this.level=level;
								}

								public Date getCreatedDt(){
									return createdDt;
								}
public void setCreatedDt(Date createdDt){
									this.createdDt=createdDt;
								}

								public String getCreatedBy(){
									return createdBy;
								}
public void setCreatedBy(String createdBy){
									this.createdBy=createdBy;
								}

								public Date getUpdatedDt(){
									return updatedDt;
								}
public void setUpdatedDt(Date updatedDt){
									this.updatedDt=updatedDt;
								}

								public String getUpdatedBy(){
									return updatedBy;
								}
public void setUpdatedBy(String updatedBy){
									this.updatedBy=updatedBy;
								}

		
	}
	/* Table Create SQL */
	/*
		
	*/
	