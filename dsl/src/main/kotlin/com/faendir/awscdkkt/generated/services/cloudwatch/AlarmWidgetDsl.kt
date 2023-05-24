package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmWidget
import software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps

@Generated
public fun alarmWidget(props: AlarmWidgetProps): AlarmWidget = AlarmWidget(props)

@Generated
public fun buildAlarmWidget(initializer: @AwsCdkDsl AlarmWidget.Builder.() -> Unit): AlarmWidget =
    AlarmWidget.Builder.create().apply(initializer).build()
