@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.FirelensLogRouterProps
import software.constructs.Construct

public fun Construct.firelensLogRouter(
  id: String,
  props: FirelensLogRouterProps,
  initializer: FirelensLogRouter.() -> Unit = {},
): FirelensLogRouter = FirelensLogRouter(this, id, props).apply(initializer)
