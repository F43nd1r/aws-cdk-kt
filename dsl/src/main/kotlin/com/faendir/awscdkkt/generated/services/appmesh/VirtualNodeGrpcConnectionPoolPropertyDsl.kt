package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun buildVirtualNodeGrpcConnectionPoolProperty(initializer: @AwsCdkDsl
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder().apply(initializer).build()
