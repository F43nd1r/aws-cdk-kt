package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameterGroup(
  id: String,
  props: CfnParameterGroupProps,
  initializer: @AwsCdkDsl CfnParameterGroup.() -> Unit = {},
): CfnParameterGroup = CfnParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnParameterGroup(id: String, initializer: @AwsCdkDsl
    CfnParameterGroup.Builder.() -> Unit = {}): CfnParameterGroup =
    CfnParameterGroup.Builder.create(this, id).apply(initializer).build()
