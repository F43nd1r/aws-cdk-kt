package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public fun alarmProperty(initializer: CfnEndpoint.AlarmProperty.Builder.() -> Unit = {}):
    CfnEndpoint.AlarmProperty = CfnEndpoint.AlarmProperty.builder().apply(initializer).build()
