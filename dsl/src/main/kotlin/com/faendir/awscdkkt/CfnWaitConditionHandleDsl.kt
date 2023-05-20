@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitConditionHandle
import software.constructs.Construct

public fun Construct.cfnWaitConditionHandle(id: String,
    initializer: CfnWaitConditionHandle.() -> Unit = {}): CfnWaitConditionHandle =
    CfnWaitConditionHandle(this, id).apply(initializer)
