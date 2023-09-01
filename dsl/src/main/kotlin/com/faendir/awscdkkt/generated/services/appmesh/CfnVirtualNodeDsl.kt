package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualNode(
  id: String,
  props: CfnVirtualNodeProps,
  initializer: @AwsCdkDsl CfnVirtualNode.() -> Unit = {},
): CfnVirtualNode = CfnVirtualNode(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualNode(id: String, initializer: @AwsCdkDsl
    CfnVirtualNode.Builder.() -> Unit = {}): CfnVirtualNode = CfnVirtualNode.Builder.create(this,
    id).apply(initializer).build()
