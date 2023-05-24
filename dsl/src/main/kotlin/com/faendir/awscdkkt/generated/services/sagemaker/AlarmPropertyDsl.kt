package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public fun buildAlarmProperty(initializer: @AwsCdkDsl CfnEndpoint.AlarmProperty.Builder.() -> Unit):
    CfnEndpoint.AlarmProperty = CfnEndpoint.AlarmProperty.Builder().apply(initializer).build()
