package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun scaleInPolicyProperty(initializer: CfnConnector.ScaleInPolicyProperty.Builder.() -> Unit
    = {}): CfnConnector.ScaleInPolicyProperty =
    CfnConnector.ScaleInPolicyProperty.builder().apply(initializer).build()
