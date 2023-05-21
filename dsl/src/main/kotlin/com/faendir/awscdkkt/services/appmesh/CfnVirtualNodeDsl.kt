package com.faendir.awscdkkt.services.appmesh

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
  initializer: CfnVirtualNode.() -> Unit = {},
): CfnVirtualNode = CfnVirtualNode(this, id, props).apply(initializer)
