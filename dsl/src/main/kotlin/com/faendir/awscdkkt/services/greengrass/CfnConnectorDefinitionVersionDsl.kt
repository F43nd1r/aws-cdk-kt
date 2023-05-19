@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
