package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayer(
  id: String,
  props: CfnLayerProps,
  initializer: CfnLayer.() -> Unit = {},
): CfnLayer = CfnLayer(this, id, props).apply(initializer)
