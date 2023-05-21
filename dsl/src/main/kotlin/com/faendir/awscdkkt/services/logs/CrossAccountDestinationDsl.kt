package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.crossAccountDestination(
  id: String,
  props: CrossAccountDestinationProps,
  initializer: CrossAccountDestination.() -> Unit = {},
): CrossAccountDestination = CrossAccountDestination(this, id, props).apply(initializer)
