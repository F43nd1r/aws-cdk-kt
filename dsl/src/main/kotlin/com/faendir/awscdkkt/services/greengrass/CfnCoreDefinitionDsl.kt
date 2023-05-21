package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCoreDefinition(
  id: String,
  props: CfnCoreDefinitionProps,
  initializer: CfnCoreDefinition.() -> Unit = {},
): CfnCoreDefinition = CfnCoreDefinition(this, id, props).apply(initializer)
