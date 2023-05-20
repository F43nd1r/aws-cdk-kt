@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.constructs.Construct

public fun Construct.cfnDeviceDefinition(
  id: String,
  props: CfnDeviceDefinitionProps,
  initializer: CfnDeviceDefinition.() -> Unit = {},
): CfnDeviceDefinition = CfnDeviceDefinition(this, id, props).apply(initializer)
