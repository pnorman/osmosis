package com.bretth.osmosis.change.impl;

import com.bretth.osmosis.data.Element;
import com.bretth.osmosis.data.Node;
import com.bretth.osmosis.task.ChangeAction;
import com.bretth.osmosis.task.ChangeSink;
import com.bretth.osmosis.task.Sink;


/**
 * Element container implementation for nodes.
 * 
 * @author Brett Henderson
 */
public class NodeContainer extends ElementContainer {
	private Node node;
	
	
	/**
	 * Creates a new instance.
	 * 
	 * @param node
	 *            The node to wrap.
	 */
	public NodeContainer(Node node) {
		this.node = node;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Sink sink) {
		sink.processNode(node);
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void processChange(ChangeSink changeSink, ChangeAction action) {
		changeSink.processNode(node, action);
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Element getElement() {
		return node;
	}
}