package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CrossAccountDestination.() -> Unit = {},
): CrossAccountDestination = CrossAccountDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCrossAccountDestination(id: String, initializer: @AwsCdkDsl CrossAccountDestination.Builder.() -> Unit = {}): CrossAccountDestination = CrossAccountDestination.Builder.create(this, id).apply(initializer).build()
