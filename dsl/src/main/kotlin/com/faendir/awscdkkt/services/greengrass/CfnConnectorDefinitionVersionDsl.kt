@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
import software.constructs.Construct

public fun Construct.cfnConnectorDefinitionVersion(
  id: String,
  props: CfnConnectorDefinitionVersionProps,
  initializer: CfnConnectorDefinitionVersion.() -> Unit = {},
): CfnConnectorDefinitionVersion = CfnConnectorDefinitionVersion(this, id, props).apply(initializer)
