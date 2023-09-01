package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnConditionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCondition(id: String, initializer: @AwsCdkDsl CfnCondition.() -> Unit = {}):
    CfnCondition = CfnCondition(this, id).apply(initializer)

@Generated
public fun Construct.cfnCondition(
  id: String,
  props: CfnConditionProps,
  initializer: @AwsCdkDsl CfnCondition.() -> Unit = {},
): CfnCondition = CfnCondition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCondition(id: String, initializer: @AwsCdkDsl
    CfnCondition.Builder.() -> Unit = {}): CfnCondition = CfnCondition.Builder.create(this,
    id).apply(initializer).build()
