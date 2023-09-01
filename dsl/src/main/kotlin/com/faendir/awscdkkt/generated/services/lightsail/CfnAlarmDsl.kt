package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnAlarm
import software.amazon.awscdk.services.lightsail.CfnAlarmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlarm(
  id: String,
  props: CfnAlarmProps,
  initializer: @AwsCdkDsl CfnAlarm.() -> Unit = {},
): CfnAlarm = CfnAlarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlarm(id: String, initializer: @AwsCdkDsl CfnAlarm.Builder.() -> Unit =
    {}): CfnAlarm = CfnAlarm.Builder.create(this, id).apply(initializer).build()
