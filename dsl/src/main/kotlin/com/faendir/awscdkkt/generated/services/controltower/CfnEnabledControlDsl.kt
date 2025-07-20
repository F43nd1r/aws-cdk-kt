package com.faendir.awscdkkt.generated.services.controltower

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnabledControl(
  id: String,
  props: CfnEnabledControlProps,
  initializer: @AwsCdkDsl CfnEnabledControl.() -> Unit = {},
): CfnEnabledControl = CfnEnabledControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnabledControl(id: String, initializer: @AwsCdkDsl CfnEnabledControl.Builder.() -> Unit = {}): CfnEnabledControl = CfnEnabledControl.Builder.create(this, id).apply(initializer).build()
