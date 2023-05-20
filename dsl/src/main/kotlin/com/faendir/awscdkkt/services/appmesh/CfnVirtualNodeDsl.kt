@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
import software.constructs.Construct

public fun Construct.cfnVirtualNode(
  id: String,
  props: CfnVirtualNodeProps,
  initializer: CfnVirtualNode.() -> Unit = {},
): CfnVirtualNode = CfnVirtualNode(this, id, props).apply(initializer)
