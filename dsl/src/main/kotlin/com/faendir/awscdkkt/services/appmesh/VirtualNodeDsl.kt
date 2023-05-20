@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeProps
import software.constructs.Construct

public fun Construct.virtualNode(
  id: String,
  props: VirtualNodeProps,
  initializer: VirtualNode.() -> Unit = {},
): VirtualNode = VirtualNode(this, id, props).apply(initializer)
