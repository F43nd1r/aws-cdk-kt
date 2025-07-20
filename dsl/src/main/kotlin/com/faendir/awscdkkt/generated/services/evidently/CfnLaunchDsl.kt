package com.faendir.awscdkkt.generated.services.evidently

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnLaunchProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunch(
  id: String,
  props: CfnLaunchProps,
  initializer: @AwsCdkDsl CfnLaunch.() -> Unit = {},
): CfnLaunch = CfnLaunch(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunch(id: String, initializer: @AwsCdkDsl CfnLaunch.Builder.() -> Unit = {}): CfnLaunch = CfnLaunch.Builder.create(this, id).apply(initializer).build()
