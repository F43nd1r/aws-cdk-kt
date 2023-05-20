@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
