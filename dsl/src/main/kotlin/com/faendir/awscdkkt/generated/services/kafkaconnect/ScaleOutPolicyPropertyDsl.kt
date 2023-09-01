package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun buildScaleOutPolicyProperty(initializer: @AwsCdkDsl
    CfnConnector.ScaleOutPolicyProperty.Builder.() -> Unit = {}):
    CfnConnector.ScaleOutPolicyProperty =
    CfnConnector.ScaleOutPolicyProperty.Builder().apply(initializer).build()
