package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWaitConditionHandle(id: String, initializer: @AwsCdkDsl
    CfnWaitConditionHandle.() -> Unit = {}): CfnWaitConditionHandle = CfnWaitConditionHandle(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnWaitConditionHandle(
  id: String,
  props: CfnWaitConditionHandleProps,
  initializer: @AwsCdkDsl CfnWaitConditionHandle.() -> Unit = {},
): CfnWaitConditionHandle = CfnWaitConditionHandle(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWaitConditionHandle(id: String, initializer: @AwsCdkDsl
    CfnWaitConditionHandle.Builder.() -> Unit = {}): CfnWaitConditionHandle =
    CfnWaitConditionHandle.Builder.create(this, id).apply(initializer).build()
