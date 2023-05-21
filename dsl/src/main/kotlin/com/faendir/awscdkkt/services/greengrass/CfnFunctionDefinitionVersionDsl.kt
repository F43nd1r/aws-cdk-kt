package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunctionDefinitionVersion(
  id: String,
  props: CfnFunctionDefinitionVersionProps,
  initializer: CfnFunctionDefinitionVersion.() -> Unit = {},
): CfnFunctionDefinitionVersion = CfnFunctionDefinitionVersion(this, id, props).apply(initializer)
