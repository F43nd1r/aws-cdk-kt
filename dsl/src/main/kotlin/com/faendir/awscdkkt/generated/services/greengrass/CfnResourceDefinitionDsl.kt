package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefinition(
  id: String,
  props: CfnResourceDefinitionProps,
  initializer: @AwsCdkDsl CfnResourceDefinition.() -> Unit = {},
): CfnResourceDefinition = CfnResourceDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceDefinition(id: String, initializer: @AwsCdkDsl
    CfnResourceDefinition.Builder.() -> Unit = {}): CfnResourceDefinition =
    CfnResourceDefinition.Builder.create(this, id).apply(initializer).build()
