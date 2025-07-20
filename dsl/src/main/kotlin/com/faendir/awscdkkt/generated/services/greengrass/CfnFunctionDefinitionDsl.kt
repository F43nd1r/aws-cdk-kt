package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunctionDefinition(
  id: String,
  props: CfnFunctionDefinitionProps,
  initializer: @AwsCdkDsl CfnFunctionDefinition.() -> Unit = {},
): CfnFunctionDefinition = CfnFunctionDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFunctionDefinition(id: String, initializer: @AwsCdkDsl CfnFunctionDefinition.Builder.() -> Unit = {}): CfnFunctionDefinition = CfnFunctionDefinition.Builder.create(this, id).apply(initializer).build()
