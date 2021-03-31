package jp.co.internous.dandelion.model.mapper;

import java.util.List;




import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.dandelion.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {

	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();
	
	List<MstProduct> findByProductName(@Param("itemName") String[] itemName);

	List<MstProduct> findByCategoryIdAndProductName(@Param("category") int category, @Param("itemName") String[] itemName);
	
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(@Param("id") int id);

}

