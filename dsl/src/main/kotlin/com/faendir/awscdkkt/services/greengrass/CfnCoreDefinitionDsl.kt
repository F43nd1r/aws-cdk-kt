@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
import software.constructs.Construct

public fun Construct.cfnCoreDefinition(
  id: String,
  props: CfnCoreDefinitionProps,
  initializer: CfnCoreDefinition.() -> Unit = {},
): CfnCoreDefinition = CfnCoreDefinition(this, id, props).apply(initializer)
