package com.faendir.awscdkkt.generated.services.applicationinsights

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public fun buildAlarmMetricProperty(initializer: @AwsCdkDsl
    CfnApplication.AlarmMetricProperty.Builder.() -> Unit = {}): CfnApplication.AlarmMetricProperty
    = CfnApplication.AlarmMetricProperty.Builder().apply(initializer).build()
