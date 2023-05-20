@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
