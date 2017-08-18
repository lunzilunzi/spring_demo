package com.zx.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zx.mapper.StaffMapper;
import com.zx.model.Staff;
import com.zx.service.IStaffService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2017-08-18
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {
	
}
