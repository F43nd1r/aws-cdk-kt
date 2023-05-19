@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import software.constructs.Construct

public fun Construct.cfnLoggerDefinition(
  id: String,
  props: CfnLoggerDefinitionProps,
  initializer: CfnLoggerDefinition.() -> Unit = {},
): CfnLoggerDefinition = CfnLoggerDefinition(this, id, props).apply(initializer)
