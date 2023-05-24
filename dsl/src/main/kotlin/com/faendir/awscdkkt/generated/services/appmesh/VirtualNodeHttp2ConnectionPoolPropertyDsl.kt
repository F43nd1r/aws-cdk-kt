package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun buildVirtualNodeHttp2ConnectionPoolProperty(initializer: @AwsCdkDsl
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder().apply(initializer).build()
