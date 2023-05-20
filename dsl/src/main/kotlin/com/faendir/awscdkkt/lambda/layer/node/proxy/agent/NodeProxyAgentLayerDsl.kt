@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.lambda.layer.node.proxy.agent

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer
import software.constructs.Construct

public fun Construct.nodeProxyAgentLayer(id: String, initializer: NodeProxyAgentLayer.() -> Unit =
    {}): NodeProxyAgentLayer = NodeProxyAgentLayer(this, id).apply(initializer)
