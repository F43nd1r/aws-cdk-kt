@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun scaleInPolicyProperty(initializer: CfnConnector.ScaleInPolicyProperty.Builder.() -> Unit):
    CfnConnector.ScaleInPolicyProperty =
    CfnConnector.ScaleInPolicyProperty.builder().apply(initializer).build()
