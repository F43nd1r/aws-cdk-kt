package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceDefinitionVersion(
  id: String,
  props: CfnDeviceDefinitionVersionProps,
  initializer: CfnDeviceDefinitionVersion.() -> Unit = {},
): CfnDeviceDefinitionVersion = CfnDeviceDefinitionVersion(this, id, props).apply(initializer)
