package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnFleet
import software.amazon.awscdk.services.deadline.CfnFleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFleet(
  id: String,
  props: CfnFleetProps,
  initializer: @AwsCdkDsl CfnFleet.() -> Unit = {},
): CfnFleet = CfnFleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFleet(id: String, initializer: @AwsCdkDsl CfnFleet.Builder.() -> Unit = {}): CfnFleet = CfnFleet.Builder.create(this, id).apply(initializer).build()
