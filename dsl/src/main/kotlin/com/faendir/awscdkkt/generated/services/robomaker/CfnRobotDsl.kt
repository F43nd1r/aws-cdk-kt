package com.faendir.awscdkkt.generated.services.robomaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRobot(
  id: String,
  props: CfnRobotProps,
  initializer: @AwsCdkDsl CfnRobot.() -> Unit = {},
): CfnRobot = CfnRobot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRobot(id: String, initializer: @AwsCdkDsl CfnRobot.Builder.() -> Unit =
    {}): CfnRobot = CfnRobot.Builder.create(this, id).apply(initializer).build()
