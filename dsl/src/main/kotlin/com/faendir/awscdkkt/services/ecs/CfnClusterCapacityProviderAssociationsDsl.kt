@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
