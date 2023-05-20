@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalService
import software.amazon.awscdk.services.ecs.ExternalServiceProps
import software.constructs.Construct

public fun Construct.externalService(
  id: String,
  props: ExternalServiceProps,
  initializer: ExternalService.() -> Unit = {},
): ExternalService = ExternalService(this, id, props).apply(initializer)
