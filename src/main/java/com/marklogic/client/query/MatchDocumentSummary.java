/*
 * Copyright 2012-2013 MarkLogic Corporation
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
package com.marklogic.client.query;

import java.util.Iterator;

import org.w3c.dom.Document;

import com.marklogic.client.io.Format;
import com.marklogic.client.io.marker.XMLReadHandle;

/**
 * A MatchDocumentSummary is the information returned for each document found by a search.
 */
public interface MatchDocumentSummary {
    /**
     * Returns the URI of the document.
     * @return The uri.
     */
    public String getUri();

    /**
     * Returns the score associated with the document.
     * @return The score.
     */
    public int    getScore();

    /**
     * Returns the confidence messsure associated with the document.
     * @return The confidence.
     */
    public double getConfidence();

    /**
     * Returns the fitness of the document.
     * @return The fitness.
     */
    public double getFitness();

    /**
     * Returns the path of the match.
     * @return The path.
     */
    public String getPath();

    /**
     * Returns an array of match locations.
     *
     * Match locations (and snippets) can be represented as Java objects or DOM Documents, depending
     * on the nature of the snippet and the configuration of the SearchHandle. If they are
     * DOM documents, getMatchLocations() will return null and getSnippets() will
     * return the documents.
     *
     * @return The array of match locations.
     */
    public MatchLocation[] getMatchLocations();

    /**
     * Returns an array of snippets.
     *
     * Match locations (and snippets) can be represented as Java objects or DOM Documents, depending
     * on the nature of the snippet and the configuration of the SearchHandle. If they are
     * DOM documents, getMatchLocations() will return null and getSnippets() will
     * return the documents.
     *
     * @return The array of snippet documents.
     */
    public Document[] getSnippets();

	/**
     * Returns an iterator over the snippets matched for the result.
     * @param handle	An XML handle for reading the snippets.
     * @return	An iterator that populates the handle with each snippet.
	 */
	public <T extends XMLReadHandle> Iterator<T> getSnippetIterator(T handle);

    /**
     * Returns the metadata associated with this document.
     *
     * @return the metadata
     */
    public Document getMetadata();
    
	/**
     * Returns the metadata for the result.
     * @param handle	An XML handle for reading the metadata.
     * @return	The handle on the metadata.
	 */
	public <T extends XMLReadHandle> T getMetadata(T handle);

    /**
     * Returns the mime type associated with this document.
     */
    public String getMimeType();
     
    /**
     * Returns the format associated with this document
     */
    public Format getFormat();

    /**
     * Get relevance info for a particular result.
     * Includes data only if a query was sent with the 'relevance-trace' search option.
     * @return A DOM Element containing relevance trace info.  In the absence of the 'relevance-trace' option, returns null.
     */
	public Document getRelevanceInfo();

	/**
     * Returns the relevance information for the result.
     * @param handle	An XML handle for reading the relevance information.
     * @return	The handle on the relevance information.
	 */
	public <T extends XMLReadHandle> T getRelevanceInfo(T handle);

	/**
	 * Returns the uris for documents similar to the result (if requested).
	 * @return	The document uris.
	 */
	public String[] getSimilarDocumentUris();
}
