package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalService
import software.amazon.awscdk.services.ecs.ExternalServiceProps
import software.constructs.Construct

@Generated
public fun Construct.externalService(
  id: String,
  props: ExternalServiceProps,
  initializer: ExternalService.() -> Unit = {},
): ExternalService = ExternalService(this, id, props).apply(initializer)
