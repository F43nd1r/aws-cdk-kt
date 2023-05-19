@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps
import software.constructs.Construct

public fun Construct.cfnVirtualRouter(
  id: String,
  props: CfnVirtualRouterProps,
  initializer: CfnVirtualRouter.() -> Unit = {},
): CfnVirtualRouter = CfnVirtualRouter(this, id, props).apply(initializer)
