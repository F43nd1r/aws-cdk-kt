package com.faendir.awscdkkt.generated.services.robomaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRobotApplicationVersion(
  id: String,
  props: CfnRobotApplicationVersionProps,
  initializer: @AwsCdkDsl CfnRobotApplicationVersion.() -> Unit = {},
): CfnRobotApplicationVersion = CfnRobotApplicationVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRobotApplicationVersion(id: String, initializer: @AwsCdkDsl
    CfnRobotApplicationVersion.Builder.() -> Unit = {}): CfnRobotApplicationVersion =
    CfnRobotApplicationVersion.Builder.create(this, id).apply(initializer).build()
