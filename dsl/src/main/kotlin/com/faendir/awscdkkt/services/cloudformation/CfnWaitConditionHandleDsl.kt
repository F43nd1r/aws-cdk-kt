@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle
import software.constructs.Construct

public fun Construct.cfnWaitConditionHandle(id: String,
    initializer: CfnWaitConditionHandle.() -> Unit = {}): CfnWaitConditionHandle =
    CfnWaitConditionHandle(this, id).apply(initializer)
