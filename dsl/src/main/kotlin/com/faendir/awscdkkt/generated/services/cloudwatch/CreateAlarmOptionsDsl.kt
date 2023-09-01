package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions

@Generated
public fun buildCreateAlarmOptions(initializer: @AwsCdkDsl CreateAlarmOptions.Builder.() -> Unit =
    {}): CreateAlarmOptions = CreateAlarmOptions.Builder().apply(initializer).build()
