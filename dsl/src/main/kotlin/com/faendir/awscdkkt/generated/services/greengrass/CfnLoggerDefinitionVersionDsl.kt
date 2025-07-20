package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoggerDefinitionVersion(
  id: String,
  props: CfnLoggerDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnLoggerDefinitionVersion.() -> Unit = {},
): CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoggerDefinitionVersion(id: String, initializer: @AwsCdkDsl CfnLoggerDefinitionVersion.Builder.() -> Unit = {}): CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion.Builder.create(this, id).apply(initializer).build()
