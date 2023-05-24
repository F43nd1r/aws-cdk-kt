package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectorDefinition(id: String, props: CfnConnectorDefinitionProps):
    CfnConnectorDefinition = CfnConnectorDefinition(this, id, props)

@Generated
public fun Construct.cfnConnectorDefinition(
  id: String,
  props: CfnConnectorDefinitionProps,
  initializer: @AwsCdkDsl CfnConnectorDefinition.() -> Unit,
): CfnConnectorDefinition = CfnConnectorDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectorDefinition(id: String, initializer: @AwsCdkDsl
    CfnConnectorDefinition.Builder.() -> Unit): CfnConnectorDefinition =
    CfnConnectorDefinition.Builder.create(this, id).apply(initializer).build()
