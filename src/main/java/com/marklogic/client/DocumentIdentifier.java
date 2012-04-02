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
package com.marklogic.client;

/**
 * A Document Identifier identifies a document for database read, write, and delete operations.
 */
public interface DocumentIdentifier {
	final static public long UNKNOWN_LENGTH = -1;

	public String getUri();
	public void setUri(String uri);
	public DocumentIdentifier withUri(String uri);

	public String getMimetype();
	public void setMimetype(String mimetype);
	public DocumentIdentifier withMimetype(String mimetype);

	public long getByteLength();
	public void setByteLength(long length);
}
