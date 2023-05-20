@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mediaconvert

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps
import software.constructs.Construct

public fun Construct.cfnPreset(
  id: String,
  props: CfnPresetProps,
  initializer: CfnPreset.() -> Unit = {},
): CfnPreset = CfnPreset(this, id, props).apply(initializer)
