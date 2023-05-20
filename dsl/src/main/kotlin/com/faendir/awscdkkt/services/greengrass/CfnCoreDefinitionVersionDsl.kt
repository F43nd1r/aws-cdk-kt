@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
