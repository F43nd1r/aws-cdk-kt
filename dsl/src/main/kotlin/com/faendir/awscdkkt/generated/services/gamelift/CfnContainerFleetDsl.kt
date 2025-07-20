package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnContainerFleet
import software.amazon.awscdk.services.gamelift.CfnContainerFleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContainerFleet(
  id: String,
  props: CfnContainerFleetProps,
  initializer: @AwsCdkDsl CfnContainerFleet.() -> Unit = {},
): CfnContainerFleet = CfnContainerFleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContainerFleet(id: String, initializer: @AwsCdkDsl CfnContainerFleet.Builder.() -> Unit = {}): CfnContainerFleet = CfnContainerFleet.Builder.create(this, id).apply(initializer).build()
