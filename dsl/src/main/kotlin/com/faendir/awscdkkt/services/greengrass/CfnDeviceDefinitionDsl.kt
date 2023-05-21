package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceDefinition(
  id: String,
  props: CfnDeviceDefinitionProps,
  initializer: CfnDeviceDefinition.() -> Unit = {},
): CfnDeviceDefinition = CfnDeviceDefinition(this, id, props).apply(initializer)
