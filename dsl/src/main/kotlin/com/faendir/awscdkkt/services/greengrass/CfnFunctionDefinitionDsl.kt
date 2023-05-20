@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
import software.constructs.Construct

public fun Construct.cfnFunctionDefinition(
  id: String,
  props: CfnFunctionDefinitionProps,
  initializer: CfnFunctionDefinition.() -> Unit = {},
): CfnFunctionDefinition = CfnFunctionDefinition(this, id, props).apply(initializer)
