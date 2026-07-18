package com.shancj.cloudpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shancj.cloudpicturebackend.model.dto.picture.PictureQueryRequest;
import com.shancj.cloudpicturebackend.model.dto.picture.PictureReviewRequest;
import com.shancj.cloudpicturebackend.model.dto.picture.PictureUploadByBatchRequest;
import com.shancj.cloudpicturebackend.model.dto.picture.PictureUploadRequest;
import com.shancj.cloudpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shancj.cloudpicturebackend.model.entity.User;
import com.shancj.cloudpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 28950
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2026-07-16 21:51:42
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 获取查询的queruWrapper
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 获取单个图片的 VO 对象
     *
     * @param picture picture 对象
     * @param request request 请求
     * @return 对应图片的 VO
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片 VO 对象
     *
     * @param picturePage page 对象
     * @param request     request 请求
     * @return 分页的 VO
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 校验参数
     *
     * @param picture 需要校验的 picture 对象
     */
    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 填充审核参数，方便其他方法使用
     *
     * @param picture   picture
     * @param loginUser 登录的用户
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
