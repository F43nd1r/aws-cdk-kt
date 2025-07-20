package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnActivity(
  id: String,
  props: CfnActivityProps,
  initializer: @AwsCdkDsl CfnActivity.() -> Unit = {},
): CfnActivity = CfnActivity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnActivity(id: String, initializer: @AwsCdkDsl CfnActivity.Builder.() -> Unit = {}): CfnActivity = CfnActivity.Builder.create(this, id).apply(initializer).build()
