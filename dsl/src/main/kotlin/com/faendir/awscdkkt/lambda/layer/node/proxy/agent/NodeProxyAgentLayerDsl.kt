@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.lambda.layer.node.proxy.agent

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer
import software.constructs.Construct

public fun Construct.nodeProxyAgentLayer(id: String, initializer: NodeProxyAgentLayer.() -> Unit =
    {}): NodeProxyAgentLayer = NodeProxyAgentLayer(this, id).apply(initializer)
