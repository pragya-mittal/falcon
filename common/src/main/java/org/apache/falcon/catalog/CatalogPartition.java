/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.falcon.catalog;

import java.util.List;

/**
 * The CatalogPartition is a wrapper around org.apache.hcatalog.api.HCatPartition.
 */
public class CatalogPartition {

    private String databaseName;
    private String tableName;
    private List<String> values;
    private int createTime;
    private int lastAccessTime;
    private List<String> tableColumns;
    private String inputFormat;
    private String outputFormat;
    private String location;
    private String serdeInfo;

    protected CatalogPartition() {
    }

    protected void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    protected void setTableName(String tableName) {
        this.tableName = tableName;
    }

    protected void setValues(List<String> values) {
        this.values = values;
    }

    protected void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    protected void setLastAccessTime(int lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    protected void setTableColumns(List<String> tableColumns) {
        this.tableColumns = tableColumns;
    }

    protected void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    protected void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected void setSerdeInfo(String serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    /**
     * Gets the database name.
     *
     * @return the database name
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Gets the table name.
     *
     * @return the table name
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Gets the columns of the table.
     *
     * @return the columns
     */
    public List<String> getColumns() {
        return this.tableColumns;
    }

    /**
     * Gets the input format.
     *
     * @return the input format
     */
    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * Gets the output format.
     *
     * @return the output format
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * Gets the location.
     *
     * @return the location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Gets the serde.
     *
     * @return the serde
     */
    public String getSerDe() {
        return this.serdeInfo;
    }

    /**
     * Gets the last access time.
     *
     * @return the last access time
     */
    public int getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * Gets the creates the time.
     *
     * @return the creates the time
     */
    public int getCreateTime() {
        return this.createTime;
    }

    /**
     * Gets the values.
     *
     * @return the values
     */
    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "HCatPartition ["
            + (tableName != null ? "tableName=" + tableName + ", " : "tableName=null")
            + (databaseName != null ? "dbName=" + databaseName + ", " : "dbName=null")
            + (values != null ? "values=" + values + ", " : "values=null")
            + "createTime=" + createTime + ", lastAccessTime="
            + lastAccessTime + ", " + "]";
    }

}