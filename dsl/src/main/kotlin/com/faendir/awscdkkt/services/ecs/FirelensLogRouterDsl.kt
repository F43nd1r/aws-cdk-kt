@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
