package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitConditionHandle
import software.amazon.awscdk.CfnWaitConditionHandleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWaitConditionHandle(id: String): CfnWaitConditionHandle =
    CfnWaitConditionHandle(this, id)

@Generated
public fun Construct.cfnWaitConditionHandle(id: String, initializer: @AwsCdkDsl
    CfnWaitConditionHandle.() -> Unit): CfnWaitConditionHandle = CfnWaitConditionHandle(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnWaitConditionHandle(id: String, props: CfnWaitConditionHandleProps):
    CfnWaitConditionHandle = CfnWaitConditionHandle(this, id, props)

@Generated
public fun Construct.cfnWaitConditionHandle(
  id: String,
  props: CfnWaitConditionHandleProps,
  initializer: @AwsCdkDsl CfnWaitConditionHandle.() -> Unit,
): CfnWaitConditionHandle = CfnWaitConditionHandle(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWaitConditionHandle(id: String, initializer: @AwsCdkDsl
    CfnWaitConditionHandle.Builder.() -> Unit): CfnWaitConditionHandle =
    CfnWaitConditionHandle.Builder.create(this, id).apply(initializer).build()
