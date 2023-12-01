package top.kristina.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.kristina.model.entry.Article;
import top.kristina.service.ArticleService;
import top.kristina.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author 24038
* @description 针对表【tb_article】的数据库操作Service实现
* @createDate 2023-11-20 16:30:22
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




