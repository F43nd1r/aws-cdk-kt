package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnMapRun
import software.amazon.awscdk.services.stepfunctions.CfnMapRunProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMapRun(id: String, initializer: @AwsCdkDsl CfnMapRun.() -> Unit = {}): CfnMapRun = CfnMapRun(this, id).apply(initializer)

@Generated
public fun Construct.cfnMapRun(
  id: String,
  props: CfnMapRunProps,
  initializer: @AwsCdkDsl CfnMapRun.() -> Unit = {},
): CfnMapRun = CfnMapRun(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMapRun(id: String, initializer: @AwsCdkDsl CfnMapRun.Builder.() -> Unit = {}): CfnMapRun = CfnMapRun.Builder.create(this, id).apply(initializer).build()
