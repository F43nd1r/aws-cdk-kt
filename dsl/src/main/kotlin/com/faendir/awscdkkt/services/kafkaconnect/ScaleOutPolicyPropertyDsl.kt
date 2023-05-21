package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun scaleOutPolicyProperty(initializer: CfnConnector.ScaleOutPolicyProperty.Builder.() -> Unit =
    {}): CfnConnector.ScaleOutPolicyProperty =
    CfnConnector.ScaleOutPolicyProperty.builder().apply(initializer).build()
