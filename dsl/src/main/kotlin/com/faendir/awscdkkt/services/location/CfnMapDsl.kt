package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMap(
  id: String,
  props: CfnMapProps,
  initializer: CfnMap.() -> Unit = {},
): CfnMap = CfnMap(this, id, props).apply(initializer)
