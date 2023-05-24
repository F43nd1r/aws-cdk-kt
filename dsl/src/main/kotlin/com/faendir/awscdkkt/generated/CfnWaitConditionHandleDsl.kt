package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitConditionHandle
import software.constructs.Construct

@Generated
public fun Construct.cfnWaitConditionHandle(id: String): CfnWaitConditionHandle =
    CfnWaitConditionHandle(this, id)

@Generated
public fun Construct.cfnWaitConditionHandle(id: String, initializer: @AwsCdkDsl
    CfnWaitConditionHandle.() -> Unit): CfnWaitConditionHandle = CfnWaitConditionHandle(this,
    id).apply(initializer)
