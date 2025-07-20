package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCoreDefinition.() -> Unit = {},
): CfnCoreDefinition = CfnCoreDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCoreDefinition(id: String, initializer: @AwsCdkDsl CfnCoreDefinition.Builder.() -> Unit = {}): CfnCoreDefinition = CfnCoreDefinition.Builder.create(this, id).apply(initializer).build()
