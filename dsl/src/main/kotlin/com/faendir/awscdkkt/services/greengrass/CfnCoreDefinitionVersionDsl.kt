@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import software.constructs.Construct

public fun Construct.cfnCoreDefinitionVersion(
  id: String,
  props: CfnCoreDefinitionVersionProps,
  initializer: CfnCoreDefinitionVersion.() -> Unit = {},
): CfnCoreDefinitionVersion = CfnCoreDefinitionVersion(this, id, props).apply(initializer)
