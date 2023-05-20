@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.amazon.awscdk.services.ecs.CfnCapacityProviderProps
import software.constructs.Construct

public fun Construct.cfnCapacityProvider(
  id: String,
  props: CfnCapacityProviderProps,
  initializer: CfnCapacityProvider.() -> Unit = {},
): CfnCapacityProvider = CfnCapacityProvider(this, id, props).apply(initializer)
