package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomActionType(
  id: String,
  props: CfnCustomActionTypeProps,
  initializer: @AwsCdkDsl CfnCustomActionType.() -> Unit = {},
): CfnCustomActionType = CfnCustomActionType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomActionType(id: String, initializer: @AwsCdkDsl
    CfnCustomActionType.Builder.() -> Unit = {}): CfnCustomActionType =
    CfnCustomActionType.Builder.create(this, id).apply(initializer).build()
