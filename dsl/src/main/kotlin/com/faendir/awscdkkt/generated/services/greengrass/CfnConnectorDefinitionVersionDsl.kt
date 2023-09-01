package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectorDefinitionVersion(
  id: String,
  props: CfnConnectorDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnConnectorDefinitionVersion.() -> Unit = {},
): CfnConnectorDefinitionVersion = CfnConnectorDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectorDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnConnectorDefinitionVersion.Builder.() -> Unit = {}): CfnConnectorDefinitionVersion =
    CfnConnectorDefinitionVersion.Builder.create(this, id).apply(initializer).build()
