package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoggerDefinitionVersion(
  id: String,
  props: CfnLoggerDefinitionVersionProps,
  initializer: CfnLoggerDefinitionVersion.() -> Unit = {},
): CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion(this, id, props).apply(initializer)
