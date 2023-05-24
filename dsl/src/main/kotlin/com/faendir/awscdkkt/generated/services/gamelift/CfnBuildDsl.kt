package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBuild(id: String): CfnBuild = CfnBuild(this, id)

@Generated
public fun Construct.cfnBuild(id: String, initializer: @AwsCdkDsl CfnBuild.() -> Unit): CfnBuild =
    CfnBuild(this, id).apply(initializer)

@Generated
public fun Construct.cfnBuild(id: String, props: CfnBuildProps): CfnBuild = CfnBuild(this, id,
    props)

@Generated
public fun Construct.cfnBuild(
  id: String,
  props: CfnBuildProps,
  initializer: @AwsCdkDsl CfnBuild.() -> Unit,
): CfnBuild = CfnBuild(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBuild(id: String, initializer: @AwsCdkDsl CfnBuild.Builder.() -> Unit):
    CfnBuild = CfnBuild.Builder.create(this, id).apply(initializer).build()
