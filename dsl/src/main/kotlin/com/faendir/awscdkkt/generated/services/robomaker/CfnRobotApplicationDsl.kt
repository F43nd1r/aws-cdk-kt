package com.faendir.awscdkkt.generated.services.robomaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRobotApplication(
  id: String,
  props: CfnRobotApplicationProps,
  initializer: @AwsCdkDsl CfnRobotApplication.() -> Unit = {},
): CfnRobotApplication = CfnRobotApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRobotApplication(id: String, initializer: @AwsCdkDsl CfnRobotApplication.Builder.() -> Unit = {}): CfnRobotApplication = CfnRobotApplication.Builder.create(this, id).apply(initializer).build()
