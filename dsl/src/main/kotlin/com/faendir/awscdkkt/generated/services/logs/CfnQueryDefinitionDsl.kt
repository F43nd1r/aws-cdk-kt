package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueryDefinition(
  id: String,
  props: CfnQueryDefinitionProps,
  initializer: @AwsCdkDsl CfnQueryDefinition.() -> Unit = {},
): CfnQueryDefinition = CfnQueryDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueryDefinition(id: String, initializer: @AwsCdkDsl
    CfnQueryDefinition.Builder.() -> Unit = {}): CfnQueryDefinition =
    CfnQueryDefinition.Builder.create(this, id).apply(initializer).build()
