@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
