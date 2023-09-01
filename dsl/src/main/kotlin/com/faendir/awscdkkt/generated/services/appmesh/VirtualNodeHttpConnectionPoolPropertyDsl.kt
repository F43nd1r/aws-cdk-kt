package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun buildVirtualNodeHttpConnectionPoolProperty(initializer: @AwsCdkDsl
    CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty.Builder().apply(initializer).build()
