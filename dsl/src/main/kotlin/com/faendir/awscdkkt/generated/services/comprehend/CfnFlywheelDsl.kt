package com.faendir.awscdkkt.generated.services.comprehend

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnFlywheel.() -> Unit = {},
): CfnFlywheel = CfnFlywheel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlywheel(id: String, initializer: @AwsCdkDsl
    CfnFlywheel.Builder.() -> Unit = {}): CfnFlywheel = CfnFlywheel.Builder.create(this,
    id).apply(initializer).build()
