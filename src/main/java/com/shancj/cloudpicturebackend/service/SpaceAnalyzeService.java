package com.shancj.cloudpicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shancj.cloudpicturebackend.model.dto.space.analyze.*;
import com.shancj.cloudpicturebackend.model.entity.Space;
import com.shancj.cloudpicturebackend.model.entity.User;
import com.shancj.cloudpicturebackend.model.vo.space.analyze.*;

import java.util.List;

/**
 * @author 28950
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2026-07-24 19:02:21
 */
public interface SpaceAnalyzeService extends IService<Space> {

    /**
     * 获取空间使用分析数据
     *
     * @param spaceUsageAnalyzeRequest SpaceUsageAnalyzeRequest 请求参数
     * @param loginUser                当前登录用户
     * @return SpaceUsageAnalyzeResponse 分析结果
     */
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    /**
     * 分析空间 category
     *
     * @param spaceCategoryAnalyzeRequest SpaceCategoryAnalyzeRequests
     * @param loginUser                   当前登录用户
     * @return List<SpaceCategoryAnalyzeResponse>
     */
    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    /**
     * 获取空间标签分析
     *
     * @param spaceTagAnalyzeRequest  SpaceTagAnalyzeRequests
     * @param loginUser 登录用户
     * @return  List<SpaceTagAnalyzeResponse>
     */
    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    /**
     * 获取空间大小分析
     *
     * @param spaceSizeAnalyzeRequest SpaceSizeAnalyzeRequests
     * @param loginUser               当前登录用户
     * @return List<SpaceSizeAnalyzeResponse>
     */
    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    /**
     * 用户上传时间分析
     *
     * @param spaceUserAnalyzeRequest  spaceUserAnalyzeRequest
     * @param loginUser 当前登录的用户
     * @return List<SpaceUserAnalyzeResponse>
     */
    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    /**
     * 空间使用排行 仅管理员可用
     *
     * @param spaceRankAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);


}
