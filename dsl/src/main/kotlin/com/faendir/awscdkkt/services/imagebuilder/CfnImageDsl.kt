@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImageProps
import software.constructs.Construct

public fun Construct.cfnImage(
  id: String,
  props: CfnImageProps,
  initializer: CfnImage.() -> Unit = {},
): CfnImage = CfnImage(this, id, props).apply(initializer)
