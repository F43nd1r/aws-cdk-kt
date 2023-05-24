package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoggerDefinition(id: String, props: CfnLoggerDefinitionProps):
    CfnLoggerDefinition = CfnLoggerDefinition(this, id, props)

@Generated
public fun Construct.cfnLoggerDefinition(
  id: String,
  props: CfnLoggerDefinitionProps,
  initializer: @AwsCdkDsl CfnLoggerDefinition.() -> Unit,
): CfnLoggerDefinition = CfnLoggerDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoggerDefinition(id: String, initializer: @AwsCdkDsl
    CfnLoggerDefinition.Builder.() -> Unit): CfnLoggerDefinition =
    CfnLoggerDefinition.Builder.create(this, id).apply(initializer).build()
