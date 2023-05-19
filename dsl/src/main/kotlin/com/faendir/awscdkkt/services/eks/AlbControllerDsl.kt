@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbController
import software.amazon.awscdk.services.eks.AlbControllerProps
import software.constructs.Construct

public fun Construct.albController(
  id: String,
  props: AlbControllerProps,
  initializer: AlbController.() -> Unit = {},
): AlbController = AlbController(this, id, props).apply(initializer)
