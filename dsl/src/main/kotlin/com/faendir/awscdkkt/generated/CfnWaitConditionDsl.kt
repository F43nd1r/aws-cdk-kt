package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWaitCondition(id: String, initializer: @AwsCdkDsl
    CfnWaitCondition.() -> Unit = {}): CfnWaitCondition = CfnWaitCondition(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnWaitCondition(
  id: String,
  props: CfnWaitConditionProps,
  initializer: @AwsCdkDsl CfnWaitCondition.() -> Unit = {},
): CfnWaitCondition = CfnWaitCondition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWaitCondition(id: String, initializer: @AwsCdkDsl
    CfnWaitCondition.Builder.() -> Unit = {}): CfnWaitCondition =
    CfnWaitCondition.Builder.create(this, id).apply(initializer).build()
