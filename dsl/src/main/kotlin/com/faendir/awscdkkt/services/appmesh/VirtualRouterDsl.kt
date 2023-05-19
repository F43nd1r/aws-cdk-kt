@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterProps
import software.constructs.Construct

public fun Construct.virtualRouter(
  id: String,
  props: VirtualRouterProps,
  initializer: VirtualRouter.() -> Unit = {},
): VirtualRouter = VirtualRouter(this, id, props).apply(initializer)
