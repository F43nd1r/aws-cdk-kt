@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public
    fun eventSourceProperty(initializer: CfnLifecyclePolicy.EventSourceProperty.Builder.() -> Unit):
    CfnLifecyclePolicy.EventSourceProperty =
    CfnLifecyclePolicy.EventSourceProperty.builder().apply(initializer).build()
