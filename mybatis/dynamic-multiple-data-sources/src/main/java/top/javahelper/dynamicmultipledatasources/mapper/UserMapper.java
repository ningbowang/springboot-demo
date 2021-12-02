package top.javahelper.dynamicmultipledatasources.mapper;

import java.util.List;

import top.javahelper.dynamicmultipledatasources.model.User;

public interface UserMapper {

    void init();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Wed Dec 01 17:53:40 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Wed Dec 01 17:53:40 CST 2021
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Wed Dec 01 17:53:40 CST 2021
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Wed Dec 01 17:53:40 CST 2021
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Wed Dec 01 17:53:40 CST 2021
     */
    int updateByPrimaryKey(User record);
}