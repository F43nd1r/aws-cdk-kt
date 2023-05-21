package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionDefinition(
  id: String,
  props: CfnSubscriptionDefinitionProps,
  initializer: CfnSubscriptionDefinition.() -> Unit = {},
): CfnSubscriptionDefinition = CfnSubscriptionDefinition(this, id, props).apply(initializer)
