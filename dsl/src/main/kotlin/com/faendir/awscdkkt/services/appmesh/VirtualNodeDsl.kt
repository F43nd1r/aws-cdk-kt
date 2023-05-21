package com.faendir.awscdkkt.services.appmesh

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
  initializer: VirtualNode.() -> Unit = {},
): VirtualNode = VirtualNode(this, id, props).apply(initializer)
