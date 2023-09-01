package com.faendir.awscdkkt.generated.services.mediaconvert

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPreset(
  id: String,
  props: CfnPresetProps,
  initializer: @AwsCdkDsl CfnPreset.() -> Unit = {},
): CfnPreset = CfnPreset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPreset(id: String, initializer: @AwsCdkDsl CfnPreset.Builder.() -> Unit
    = {}): CfnPreset = CfnPreset.Builder.create(this, id).apply(initializer).build()
