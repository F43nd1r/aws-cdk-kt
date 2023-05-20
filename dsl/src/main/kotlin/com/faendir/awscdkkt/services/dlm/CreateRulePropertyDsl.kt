@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dlm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public
    fun createRuleProperty(initializer: CfnLifecyclePolicy.CreateRuleProperty.Builder.() -> Unit):
    CfnLifecyclePolicy.CreateRuleProperty =
    CfnLifecyclePolicy.CreateRuleProperty.builder().apply(initializer).build()
