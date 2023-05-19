@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps
import software.constructs.Construct

public fun Construct.cfnClusterCapacityProviderAssociations(
  id: String,
  props: CfnClusterCapacityProviderAssociationsProps,
  initializer: CfnClusterCapacityProviderAssociations.() -> Unit = {},
): CfnClusterCapacityProviderAssociations = CfnClusterCapacityProviderAssociations(this, id,
    props).apply(initializer)
