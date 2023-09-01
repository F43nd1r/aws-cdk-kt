package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeProps
import software.constructs.Construct

@Generated
public fun Construct.virtualNode(
  id: String,
  props: VirtualNodeProps,
  initializer: @AwsCdkDsl VirtualNode.() -> Unit = {},
): VirtualNode = VirtualNode(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVirtualNode(id: String, initializer: @AwsCdkDsl
    VirtualNode.Builder.() -> Unit = {}): VirtualNode = VirtualNode.Builder.create(this,
    id).apply(initializer).build()
