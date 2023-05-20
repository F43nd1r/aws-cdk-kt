@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.constructs.Construct

public fun Construct.fargateService(
  id: String,
  props: FargateServiceProps,
  initializer: FargateService.() -> Unit = {},
): FargateService = FargateService(this, id, props).apply(initializer)
