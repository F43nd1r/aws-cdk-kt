package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnStage
import software.amazon.awscdk.services.ivs.CfnStageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStage(id: String, initializer: @AwsCdkDsl CfnStage.() -> Unit = {}):
    CfnStage = CfnStage(this, id).apply(initializer)

@Generated
public fun Construct.cfnStage(
  id: String,
  props: CfnStageProps,
  initializer: @AwsCdkDsl CfnStage.() -> Unit = {},
): CfnStage = CfnStage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStage(id: String, initializer: @AwsCdkDsl CfnStage.Builder.() -> Unit =
    {}): CfnStage = CfnStage.Builder.create(this, id).apply(initializer).build()
