/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * resource user relation
 */
@TableName("t_ds_relation_resources_user")
public class ResourcesUser {

  /**
   * id
   */
  @TableId(value="id", type=IdType.AUTO)
  private int id;

  /**
   * user id
   */
  private int userId;

  /**
   * resource id
   */
  private int resourcesId;

  /**
   * permission
   */
  private int perm;

  /**
   * create time
   */
  private Date createTime;

  /**
   * update time
   */
  private Date updateTime;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getResourcesId() {
    return resourcesId;
  }

  public void setResourcesId(int resourcesId) {
    this.resourcesId = resourcesId;
  }

  public int getPerm() {
    return perm;
  }

  public void setPerm(int perm) {
    this.perm = perm;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "ResourcesUser{" +
            "id=" + id +
            ", userId=" + userId +
            ", resourcesId=" + resourcesId +
            ", perm=" + perm +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            '}';
  }
}
