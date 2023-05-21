package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImage(
  id: String,
  props: CfnImageProps,
  initializer: CfnImage.() -> Unit = {},
): CfnImage = CfnImage(this, id, props).apply(initializer)
