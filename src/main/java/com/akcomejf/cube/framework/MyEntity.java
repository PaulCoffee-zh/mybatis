 

package com.akcomejf.cube.framework;

import java.io.Serializable;

import javax.persistence.Transient;

 
public class MyEntity  implements Serializable{
    

    /**
	 * 
	 */
	private static final long serialVersionUID = 7225085748894246514L;

	@Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    
    /**
	 * 查询字段
	 */
	@Transient
	private String query;
	
	

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
