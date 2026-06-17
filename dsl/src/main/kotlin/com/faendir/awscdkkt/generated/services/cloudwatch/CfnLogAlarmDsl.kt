package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnLogAlarm
import software.amazon.awscdk.services.cloudwatch.CfnLogAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogAlarm(
  id: String,
  props: CfnLogAlarmProps,
  initializer: @AwsCdkDsl CfnLogAlarm.() -> Unit = {},
): CfnLogAlarm = CfnLogAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogAlarm(id: String, initializer: @AwsCdkDsl CfnLogAlarm.Builder.() -> Unit = {}): CfnLogAlarm = CfnLogAlarm.Builder.create(this, id).apply(initializer).build()
