package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaceIndex(
  id: String,
  props: CfnPlaceIndexProps,
  initializer: CfnPlaceIndex.() -> Unit = {},
): CfnPlaceIndex = CfnPlaceIndex(this, id, props).apply(initializer)
