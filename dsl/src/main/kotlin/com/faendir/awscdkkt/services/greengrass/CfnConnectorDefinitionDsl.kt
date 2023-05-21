package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectorDefinition(
  id: String,
  props: CfnConnectorDefinitionProps,
  initializer: CfnConnectorDefinition.() -> Unit = {},
): CfnConnectorDefinition = CfnConnectorDefinition(this, id, props).apply(initializer)
