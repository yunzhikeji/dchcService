package com.yz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yz.mapper.RelpersonMapper;
import com.yz.mapper.RelpersonMapperCustom;
import com.yz.po.Locate;
import com.yz.po.LocateQuery;
import com.yz.po.Relperson;
import com.yz.po.RelpersonQuery;
import com.yz.po.RelpersonVO;
import com.yz.service.RelpersonService;
import com.yz.utils.Page;
import com.yz.vo.CountVO;

public class RelpersonServiceImpl implements RelpersonService {

	@Autowired
	private RelpersonMapper relpersonMapper;

	@Autowired
	private RelpersonMapperCustom relpersonMapperCustom;

	@Override
	public void insert(Relperson relperson) {
		// TODO Auto-generated method stub
		relpersonMapper.insert(relperson);
	}

	@Override
	public List<Relperson> findRelpersonList() {
		// TODO Auto-generated method stub
		return relpersonMapperCustom.findRelpersonList();
	}

	@Override
	public void deleteRelpersonById(Integer id) {
		// TODO Auto-generated method stub
		relpersonMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateRelpersonById(Integer id,Relperson relperson) {
		// TODO Auto-generated method stub
		relperson.setId(id);
		relpersonMapper.updateByPrimaryKeySelective(relperson);
	}

	@Override
	public Relperson findRelpersonById(Integer id) {
		return relpersonMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page findRelpersonListByRelpersonQuery(RelpersonVO relpersonVO) {
		//查询当前条件下的总记录数
		Integer totalCount = relpersonMapperCustom.findRelpersonListByRelpersonQueryCount(relpersonVO);
		
		Page page = new Page();
		
		page.setPageNo(relpersonVO.getPageNo());
		
		page.setTotalCount(totalCount);
		//获得开始行号 
		Integer startNum = page.getStartNum();
		Integer pageSize = page.getPageSize();
		
		relpersonVO.setStartNum(startNum);
		relpersonVO.setPageSize(pageSize);
		List<RelpersonVO> relpersonVOList= relpersonMapperCustom.findRelpersonListByRelpersonQuery(relpersonVO);
		page.setList(relpersonVOList);
		return page;
	}


	@Override
	public List<Relperson> findRelpersonListByAddress(String address) {
		// TODO Auto-generated method stub
		return relpersonMapperCustom.findRelpersonListByAddress(address);
	}
	
	@Override
	public List<CountVO> handleCountByCountType(Integer countType) {
		
		List<CountVO> countVOs = new ArrayList<CountVO>();
		for (int i = 1; i <=countType; i++) {
			CountVO countVO = new CountVO();
			RelpersonQuery relpersonQuery = new RelpersonQuery();
			switch (countType) {
			case 2:
				relpersonQuery.setIspermit(i-1);
				switch (i) {
				case 1:
					countVO.setCountTypeName("未办理居住证");
					break;
				case 2:
					countVO.setCountTypeName("已办理居住证");
					break;
				default:
					countVO.setCountTypeName("未办理居住证");
					break;
				}
				break;
			case 5:
				// 相关人员类别（0:未选择人员类型,1：房东 2：房客 3：业主 4：从业人员）
				relpersonQuery.setRtype(i-1);
				switch (i-1) {
				case 0:
					countVO.setCountTypeName("未选择人员类型");
					break;
				case 1:
					countVO.setCountTypeName("房东");
					break;
				case 2:
					countVO.setCountTypeName("房客");
					break;
				case 3:
					countVO.setCountTypeName("业主");
					break;
				case 4:
					countVO.setCountTypeName("从业人员");
					break;
				default:
					break;
				}
				break;
			case 10:
				relpersonQuery.setBelongplace(i);
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
			List<Relperson> relperson = relpersonMapperCustom.findLocateListByQueryMessage(relpersonQuery);
			if (relperson != null) {
				countVO.setNumber(relperson.size());
			}
			countVOs.add(countVO);
		}

		return countVOs;
	}

}
