package dao;

import java.util.List;

import vo.AirdndHomePictureVO;
import vo.AirdndUserResInfoVO;

public interface AirdndUserResInfoDAOI {
	//Select user's reservation home list
	List<AirdndUserResInfoVO> selectUserResInfo();
	//Select user's reservation home's main picture
	List<AirdndHomePictureVO> selectHomeMainPicture(int home_idx);
}