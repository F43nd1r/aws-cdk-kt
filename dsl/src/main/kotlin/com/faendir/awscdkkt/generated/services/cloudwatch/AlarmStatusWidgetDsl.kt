package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps

@Generated
public fun alarmStatusWidget(props: AlarmStatusWidgetProps): AlarmStatusWidget =
    AlarmStatusWidget(props)

@Generated
public fun buildAlarmStatusWidget(initializer: @AwsCdkDsl AlarmStatusWidget.Builder.() -> Unit):
    AlarmStatusWidget = AlarmStatusWidget.Builder.create().apply(initializer).build()
