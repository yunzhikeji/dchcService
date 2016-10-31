package com.yz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.LocateMapper;
import com.yz.mapper.LocateMapperCustom;
import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.po.Relperson;
import com.yz.service.LocateService;
import com.yz.vo.CountVO;

public class LocateServiceImpl implements LocateService {

	@Autowired
	private LocateMapper locateMapper;

	@Autowired
	private LocateMapperCustom locateMapperCustom;

	@Override
	public void insert(Locate locate) {
		// TODO Auto-generated method stub
		locateMapper.insert(locate);
	}

	@Override
	public List<Locate> findLocateList() {
		// TODO Auto-generated method stub
		return locateMapperCustom.findLocateList();
	}

	@Override
	public void deleteLocateById(Integer id) {
		// TODO Auto-generated method stub
		locateMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateLocateById(Integer id, Locate locate) {
		// TODO Auto-generated method stub
		locate.setId(id);
		locateMapper.updateByPrimaryKeySelective(locate);
	}

	@Override
	public Locate findLocateById(Integer id) {
		// TODO Auto-generated method stub
		return locateMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Locate> findLocateListByQueryMessage(LocateQuery locateQuery) {
		// TODO Auto-generated method stub
		return locateMapperCustom.findLocateListByQueryMessage(locateQuery);
	}

	@Override
	public Locate getRealLocate(Integer addressType, String addressMsg) {
		// TODO Auto-generated method stub

		Locate locate = null;

		if (addressMsg != null && !addressMsg.trim().equals("")) {
			Relperson relperson = new Relperson();
			if (addressType == 1) {
				relperson.setCurrentaddress(addressMsg);
			} else {
				relperson.setWorkdunitaddress(addressMsg);
			}
			List<Locate> locates = locateMapperCustom.findLocateListByRelperson(relperson);
			if (locates != null && locates.size() > 0) {
				locate = locates.get(0);
			}
		}
		return locate;
	}

	@Override
	public List<CountVO> handleCountByCountType(Integer countType) {
		
		List<CountVO> countVOs = new ArrayList<CountVO>();
		for (int i = 1; i <=countType; i++) {
			CountVO countVO = new CountVO();
			LocateQuery locateQuery = new LocateQuery();
			switch (countType) {
			case 2:
				locateQuery.setIslethouse(i-1);
				switch (i) {
				case 1:
					countVO.setCountTypeName("非出租房");
					break;
				case 2:
					countVO.setCountTypeName("出租房");
					break;
				default:
					countVO.setCountTypeName("非出租房");
					break;
				}
				break;
			case 6:
				locateQuery.setPlacetype(i-1);
				switch (i-1) {
				case 0:
					countVO.setCountTypeName("未选择场所");
					break;
				case 1:
					countVO.setCountTypeName("娱乐场所");
					break;
				case 2:
					countVO.setCountTypeName("服务场所");
					break;
				case 3:
					countVO.setCountTypeName("特种行业");
					break;
				case 4:
					countVO.setCountTypeName("九小场所");
					break;
				case 5:
					countVO.setCountTypeName("物流快递");
					break;
				default:
					countVO.setCountTypeName("娱乐场所");
					break;
				}
				break;
			case 10:
				locateQuery.setBelongplace(i);
				switch (i) {
				case 1:
					countVO.setCountTypeName("剪子股派出所");
					break;
				case 2:
					countVO.setCountTypeName("黄河涯派出所");
					break;
				case 3:
					countVO.setCountTypeName("东地派出所");
					break;
				case 4:
					countVO.setCountTypeName("新河东路派出所");
					break;
				case 5:
					countVO.setCountTypeName("于官屯派出所");
					break;
				case 6:
					countVO.setCountTypeName("建设街派出所");
					break;
				case 7:
					countVO.setCountTypeName("车站街派出所");
					break;
				case 8:
					countVO.setCountTypeName("湖滨北路派出所");
					break;
				case 9:
					countVO.setCountTypeName("二屯派出所");
					break;
				case 10:
					countVO.setCountTypeName("长庄派出所");
					break;
				default:
					countVO.setCountTypeName("未选择派出所");
					break;
				}
				break;
			default:
				break;
			}
			List<Locate> locates = locateMapperCustom.findLocateListByQueryMessage(locateQuery);
			if (locates != null) {
				countVO.setNumber(locates.size());
			}
			countVOs.add(countVO);
		}

		return countVOs;
	}

}
