@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
import software.constructs.Construct

public fun Construct.cfnResourceDefinition(
  id: String,
  props: CfnResourceDefinitionProps,
  initializer: CfnResourceDefinition.() -> Unit = {},
): CfnResourceDefinition = CfnResourceDefinition(this, id, props).apply(initializer)
