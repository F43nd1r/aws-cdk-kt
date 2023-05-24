package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunctionDefinitionVersion(id: String,
    props: CfnFunctionDefinitionVersionProps): CfnFunctionDefinitionVersion =
    CfnFunctionDefinitionVersion(this, id, props)

@Generated
public fun Construct.cfnFunctionDefinitionVersion(
  id: String,
  props: CfnFunctionDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnFunctionDefinitionVersion.() -> Unit,
): CfnFunctionDefinitionVersion = CfnFunctionDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFunctionDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnFunctionDefinitionVersion.Builder.() -> Unit): CfnFunctionDefinitionVersion =
    CfnFunctionDefinitionVersion.Builder.create(this, id).apply(initializer).build()
