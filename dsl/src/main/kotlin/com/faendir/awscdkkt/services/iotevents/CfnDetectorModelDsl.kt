package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDetectorModel(
  id: String,
  props: CfnDetectorModelProps,
  initializer: CfnDetectorModel.() -> Unit = {},
): CfnDetectorModel = CfnDetectorModel(this, id, props).apply(initializer)
