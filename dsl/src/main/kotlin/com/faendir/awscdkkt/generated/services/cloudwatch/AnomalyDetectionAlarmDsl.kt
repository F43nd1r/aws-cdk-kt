package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarm
import software.amazon.awscdk.services.cloudwatch.AnomalyDetectionAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.anomalyDetectionAlarm(
  id: String,
  props: AnomalyDetectionAlarmProps,
  initializer: @AwsCdkDsl AnomalyDetectionAlarm.() -> Unit = {},
): AnomalyDetectionAlarm = AnomalyDetectionAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAnomalyDetectionAlarm(id: String, initializer: @AwsCdkDsl AnomalyDetectionAlarm.Builder.() -> Unit = {}): AnomalyDetectionAlarm = AnomalyDetectionAlarm.Builder.create(this, id).apply(initializer).build()
