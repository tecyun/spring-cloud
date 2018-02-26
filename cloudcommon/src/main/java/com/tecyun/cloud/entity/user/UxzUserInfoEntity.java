package com.tecyun.cloud.entity.user;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * TODO
 *
 * @author <a href="tecyun@foxmail.com">tecyun</a>
 * @version 1.0.0, 2018-02-26 15:14
 */
@Entity
@Table(name = "uxz_user_info")
public class UxzUserInfoEntity {
  private String userid;
  private String phone;
  private String nickname;
  private String name;
  private String avatar;
  private Integer sex;
  private String duties;
  private Date brithday;
  private Date createtime;

  @Id
  @Column(name = "userid")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  @Basic
  @Column(name = "phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  @Basic
  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  @Basic
  @Column(name = "sex")
  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  @Basic
  @Column(name = "duties")
  public String getDuties() {
    return duties;
  }

  public void setDuties(String duties) {
    this.duties = duties;
  }

  @Basic
  @Column(name = "brithday")
  public Date getBrithday() {
    return brithday;
  }

  public void setBrithday(Date brithday) {
    this.brithday = brithday;
  }

  @Basic
  @Column(name = "createtime")
  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    UxzUserInfoEntity that = (UxzUserInfoEntity) o;

    if (userid != null ? !userid.equals(that.userid) : that.userid != null)
      return false;
    if (phone != null ? !phone.equals(that.phone) : that.phone != null)
      return false;
    if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null)
      return false;
    if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null)
      return false;
    if (sex != null ? !sex.equals(that.sex) : that.sex != null)
      return false;
    if (duties != null ? !duties.equals(that.duties) : that.duties != null)
      return false;
    if (brithday != null ? !brithday.equals(that.brithday) : that.brithday != null)
      return false;
    if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = userid != null ? userid.hashCode() : 0;
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
    result = 31 * result + (sex != null ? sex.hashCode() : 0);
    result = 31 * result + (duties != null ? duties.hashCode() : 0);
    result = 31 * result + (brithday != null ? brithday.hashCode() : 0);
    result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
    return result;
  }
}
