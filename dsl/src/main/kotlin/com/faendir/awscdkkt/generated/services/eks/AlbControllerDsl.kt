package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbController
import software.amazon.awscdk.services.eks.AlbControllerProps
import software.constructs.Construct

@Generated
public fun Construct.albController(id: String, props: AlbControllerProps): AlbController =
    AlbController(this, id, props)

@Generated
public fun Construct.albController(
  id: String,
  props: AlbControllerProps,
  initializer: @AwsCdkDsl AlbController.() -> Unit,
): AlbController = AlbController(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAlbController(id: String, initializer: @AwsCdkDsl
    AlbController.Builder.() -> Unit): AlbController = AlbController.Builder.create(this,
    id).apply(initializer).build()
