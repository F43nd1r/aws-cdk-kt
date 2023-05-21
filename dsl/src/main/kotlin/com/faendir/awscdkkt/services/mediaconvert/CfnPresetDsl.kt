package com.faendir.awscdkkt.services.mediaconvert

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
  initializer: CfnPreset.() -> Unit = {},
): CfnPreset = CfnPreset(this, id, props).apply(initializer)
