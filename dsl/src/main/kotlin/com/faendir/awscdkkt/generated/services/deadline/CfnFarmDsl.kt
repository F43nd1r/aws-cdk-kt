package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnFarm
import software.amazon.awscdk.services.deadline.CfnFarmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFarm(
  id: String,
  props: CfnFarmProps,
  initializer: @AwsCdkDsl CfnFarm.() -> Unit = {},
): CfnFarm = CfnFarm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFarm(id: String, initializer: @AwsCdkDsl CfnFarm.Builder.() -> Unit = {}): CfnFarm = CfnFarm.Builder.create(this, id).apply(initializer).build()
