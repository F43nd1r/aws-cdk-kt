package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

@Generated
public fun buildSNSConfigurationProperty(initializer: @AwsCdkDsl
    CfnAlert.SNSConfigurationProperty.Builder.() -> Unit = {}): CfnAlert.SNSConfigurationProperty =
    CfnAlert.SNSConfigurationProperty.Builder().apply(initializer).build()
