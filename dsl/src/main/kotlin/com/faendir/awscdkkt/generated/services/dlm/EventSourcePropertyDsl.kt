package com.faendir.awscdkkt.generated.services.dlm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@Generated
public fun buildEventSourceProperty(initializer: @AwsCdkDsl
    CfnLifecyclePolicy.EventSourceProperty.Builder.() -> Unit = {}):
    CfnLifecyclePolicy.EventSourceProperty =
    CfnLifecyclePolicy.EventSourceProperty.Builder().apply(initializer).build()
