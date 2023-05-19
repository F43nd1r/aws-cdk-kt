@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
import software.constructs.Construct

public fun Construct.cfnSubscriptionDefinitionVersion(
  id: String,
  props: CfnSubscriptionDefinitionVersionProps,
  initializer: CfnSubscriptionDefinitionVersion.() -> Unit = {},
): CfnSubscriptionDefinitionVersion = CfnSubscriptionDefinitionVersion(this, id,
    props).apply(initializer)
