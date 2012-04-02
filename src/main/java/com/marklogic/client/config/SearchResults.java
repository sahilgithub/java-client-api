/*
 * Copyright 2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.config;

/**
 * Created by IntelliJ IDEA.
 * User: ndw
 * Date: 3/14/12
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SearchResults {
    public QueryDefinition getQueryCriteria();
    public long getTotalResults();

    public SearchMetrics          getMetrics();
    public MatchDocumentSummary[] getMatchResults();

    public FacetResult[]          getFacetResults();
    public FacetResult            getFacetResult(String name);
    public String[]               getFacetNames();
}

