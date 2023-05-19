@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AsgCapacityProvider
import software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
import software.constructs.Construct

public fun Construct.asgCapacityProvider(
  id: String,
  props: AsgCapacityProviderProps,
  initializer: AsgCapacityProvider.() -> Unit = {},
): AsgCapacityProvider = AsgCapacityProvider(this, id, props).apply(initializer)
