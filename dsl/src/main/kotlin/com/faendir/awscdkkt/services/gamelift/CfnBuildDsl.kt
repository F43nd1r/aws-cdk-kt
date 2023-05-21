package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBuild(id: String, initializer: CfnBuild.() -> Unit = {}): CfnBuild =
    CfnBuild(this, id).apply(initializer)

@Generated
public fun Construct.cfnBuild(
  id: String,
  props: CfnBuildProps,
  initializer: CfnBuild.() -> Unit = {},
): CfnBuild = CfnBuild(this, id, props).apply(initializer)
