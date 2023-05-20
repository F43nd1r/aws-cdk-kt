@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.constructs.Construct

public fun Construct.cfnFunctionDefinitionVersion(
  id: String,
  props: CfnFunctionDefinitionVersionProps,
  initializer: CfnFunctionDefinitionVersion.() -> Unit = {},
): CfnFunctionDefinitionVersion = CfnFunctionDefinitionVersion(this, id, props).apply(initializer)
