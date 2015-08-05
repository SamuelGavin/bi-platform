package com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.common.jdbc.datasource;

import java.util.List;

import com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.common.jdbc.SqlExpression;
import com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.model.QuestionModelTransformationException;
import com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.model.SqlColumn;
import com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.model.SqlConstants;
import com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.model.SqlQuery;

public class PaloSqlExpression extends SqlExpression {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3617385716589467950L;
    
    /**
     * palo Id
     */
    private static final String ID = "id";
    
    /**
     * @param driver
     *            jdbc driver
     * @param facttableAlias
     *            facttableAlias facttableAlias
     */
    public PaloSqlExpression(String driver) {
        super(driver);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * com.baidu.rigel.biplatform.queryrouter.queryplugin.plugins.common.jdbc
     * .SqlExpression
     * #generateSelectExpression(com.baidu.rigel.biplatform.queryrouter
     * .queryplugin.plugins.model.SqlQuery, java.util.List, boolean)
     */
    @Override
    public String generateSelectExpression(SqlQuery sqlQuery, List<SqlColumn> needColums,
            boolean contentJoinSelect) throws QuestionModelTransformationException {
        String selectSql = super.generateSelectExpression(sqlQuery, needColums, contentJoinSelect);
        String idSql = SqlConstants.SPACE + SqlConstants.SOURCE_TABLE_ALIAS_NAME + SqlConstants.DOT
                + ID + SqlConstants.SPACE;
        if (selectSql.indexOf(idSql) < 0) {
            selectSql = selectSql + SqlConstants.COMMA + idSql;
        }
        return selectSql;
    }
    
}