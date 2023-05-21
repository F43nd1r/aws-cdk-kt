package com.faendir.awscdkkt.services.comprehend

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import software.amazon.awscdk.services.comprehend.CfnFlywheelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlywheel(
  id: String,
  props: CfnFlywheelProps,
  initializer: CfnFlywheel.() -> Unit = {},
): CfnFlywheel = CfnFlywheel(this, id, props).apply(initializer)
