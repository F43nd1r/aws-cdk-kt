@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public
    fun policyDetailsProperty(initializer: CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit):
    CfnLifecyclePolicy.PolicyDetailsProperty =
    CfnLifecyclePolicy.PolicyDetailsProperty.builder().apply(initializer).build()
