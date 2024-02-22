package com.faendir.awscdkkt.generated.services.controltower

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledBaseline
import software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnabledBaseline(
  id: String,
  props: CfnEnabledBaselineProps,
  initializer: @AwsCdkDsl CfnEnabledBaseline.() -> Unit = {},
): CfnEnabledBaseline = CfnEnabledBaseline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnabledBaseline(id: String, initializer: @AwsCdkDsl
    CfnEnabledBaseline.Builder.() -> Unit = {}): CfnEnabledBaseline =
    CfnEnabledBaseline.Builder.create(this, id).apply(initializer).build()
