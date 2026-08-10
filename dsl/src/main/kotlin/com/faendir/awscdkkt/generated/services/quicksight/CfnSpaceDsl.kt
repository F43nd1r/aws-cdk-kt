package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnSpace
import software.amazon.awscdk.services.quicksight.CfnSpaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSpace(
  id: String,
  props: CfnSpaceProps,
  initializer: @AwsCdkDsl CfnSpace.() -> Unit = {},
): CfnSpace = CfnSpace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSpace(id: String, initializer: @AwsCdkDsl CfnSpace.Builder.() -> Unit = {}): CfnSpace = CfnSpace.Builder.create(this, id).apply(initializer).build()
