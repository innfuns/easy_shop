package com.microsoft.easyshop.service.impl;

import com.microsoft.easyshop.entity.Product;
import com.microsoft.easyshop.mapper.ProductMapper;
import com.microsoft.easyshop.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-07-28
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
