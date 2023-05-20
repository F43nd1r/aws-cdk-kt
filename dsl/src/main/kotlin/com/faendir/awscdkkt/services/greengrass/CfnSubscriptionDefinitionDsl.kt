@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.constructs.Construct

public fun Construct.cfnSubscriptionDefinition(
  id: String,
  props: CfnSubscriptionDefinitionProps,
  initializer: CfnSubscriptionDefinition.() -> Unit = {},
): CfnSubscriptionDefinition = CfnSubscriptionDefinition(this, id, props).apply(initializer)
