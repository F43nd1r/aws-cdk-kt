package com.faendir.awscdkkt.generated.lambda.layer.node.proxy.agent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.lambda.layer.node.proxy.agent.NodeProxyAgentLayer
import software.constructs.Construct

@Generated
public fun Construct.nodeProxyAgentLayer(id: String, initializer: @AwsCdkDsl
    NodeProxyAgentLayer.() -> Unit = {}): NodeProxyAgentLayer = NodeProxyAgentLayer(this,
    id).apply(initializer)
