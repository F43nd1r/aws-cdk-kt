package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.fargateService(
  id: String,
  props: FargateServiceProps,
  initializer: FargateService.() -> Unit = {},
): FargateService = FargateService(this, id, props).apply(initializer)
