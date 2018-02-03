package com.pay.national.agent.core.dao.wx;

import com.pay.national.agent.model.entity.ApiTicketManager;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface ApiTicketManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    int insert(ApiTicketManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    int insertSelective(ApiTicketManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    ApiTicketManager selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(ApiTicketManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api_ticket_manager
     *
     * @mbggenerated Tue Jan 30 09:41:27 GMT+08:00 2018
     */
    int updateByPrimaryKey(ApiTicketManager record);

    /**
     * 通过时间查询当前生效的apiTicket
     * @param date
     * @return
     */
    ApiTicketManager findApiTicektByTime(@Param("date") Date date);
}