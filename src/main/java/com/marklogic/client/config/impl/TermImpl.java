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
package com.marklogic.client.config.impl;

import java.util.List;

import javax.xml.namespace.QName;

import com.marklogic.client.config.FunctionRef;
import com.marklogic.client.config.Term;
import com.marklogic.client.config.search.jaxb.Empty;

public class TermImpl extends AbstractQueryOption<com.marklogic.client.config.search.jaxb.Term> implements Term {


	TermImpl(com.marklogic.client.config.search.jaxb.Term ot) {
		jaxbObject = ot;
	}

	@Override
	public Object asJAXB() {
		return jaxbObject;
	}

	@Override
	public List<Object> getJAXBChildren() {
		return jaxbObject.getTermOptionOrEmpty();
	}

	@Override
	public FunctionRef getTermFunction() {
		if (jaxbObject.getAt() == null) {
			return null;
		} else {
			FunctionRef f = new FunctionRefImpl(new QName("", "dummyname"));
			f.setApply(jaxbObject.getApply());
			f.setNs(jaxbObject.getNs());
			f.setAt(jaxbObject.getAt());
			return f;
		}
	}

	@Override
	public void setTermFunction(FunctionRef function) {
		jaxbObject.setNs(function.getNs());
		jaxbObject.setApply(function.getApply());
		jaxbObject.setAt(function.getAt());
	}

	@Override
	public FunctionRef getEmpty() {
		FunctionRef f = new FunctionRefImpl(new QName("dummy"));

		List<Object> children = getJAXBChildren();
		for (Object o : children) {
			if (o instanceof Empty) {
				Empty empty = (Empty) o;
				f.setApply(empty.getApply());
				f.setNs(empty.getNs());
				f.setAt(empty.getAt());
				return f;
			}
		}
		return null;
	}

	@Override
	public void setEmpty(FunctionRef function) {
		List<Object> children = getJAXBChildren();
		for (Object o : children) {
			if (o instanceof Empty) {
				children.remove(o);
			}
		}
		Empty e = new Empty();
		e.setApply(function.getApply());
		e.setNs(function.getNs());
		e.setAt(function.getAt());
		getJAXBChildren().add(e);
	}

	@Override
	public void setEmpty(EmptyApply apply) {
		List<Object> children = getJAXBChildren();
		for (Object o : children) {
			if (o instanceof Empty) {
				children.remove(o);
			}
		}
		Empty e = new Empty();
		e.setApply(apply.toString().toLowerCase().replace("_", "-"));
		getJAXBChildren().add(e);
	}

	@Override
	public Double getWeight() {
		return JAXBHelper.getOneSimpleByElementName(this ,"weight");
	}
	
	@Override
	public void setWeight(Double weight) {
		JAXBHelper.setOneSimpleByElementName(this, "weight", weight);
	}

}
