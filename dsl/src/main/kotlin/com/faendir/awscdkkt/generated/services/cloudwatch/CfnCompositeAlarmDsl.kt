package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCompositeAlarm(id: String, props: CfnCompositeAlarmProps): CfnCompositeAlarm
    = CfnCompositeAlarm(this, id, props)

@Generated
public fun Construct.cfnCompositeAlarm(
  id: String,
  props: CfnCompositeAlarmProps,
  initializer: @AwsCdkDsl CfnCompositeAlarm.() -> Unit,
): CfnCompositeAlarm = CfnCompositeAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCompositeAlarm(id: String, initializer: @AwsCdkDsl
    CfnCompositeAlarm.Builder.() -> Unit): CfnCompositeAlarm =
    CfnCompositeAlarm.Builder.create(this, id).apply(initializer).build()
