package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmActionConfig

@Generated
public fun buildAlarmActionConfig(initializer: @AwsCdkDsl AlarmActionConfig.Builder.() -> Unit):
    AlarmActionConfig = AlarmActionConfig.Builder().apply(initializer).build()
