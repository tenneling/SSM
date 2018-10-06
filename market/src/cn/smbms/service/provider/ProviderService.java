package cn.smbms.service.provider;

import java.util.List;
import cn.smbms.pojo.Provider;

public interface ProviderService {

	/**
	 * 通过供应商名称、编码获取供应商列表-模糊查询-providerList
	 * @param proName
	 * @param proCode
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 */
	public List<Provider> getProviderList(String proName,String proCode,int currentPageNo, int pageSize);

	
	/**
	 * 通过条件查询-供应商表记录数
	 * @param proName
	 * @param proCode
	 * @return
	 * @throws Exception
	 */
	public int getproviderCount(String proName,String proCode);
	
	/**
	 * 增加供应商
	 * @param provider
	 * @return
	 */
	public boolean add(Provider provider);
	
	/**
	 * 通过proId获取Provider
	 * @param id
	 * @return
	 */
	public Provider getProviderById(String id);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean modify(Provider provider);
}
