package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.amazon.awscdk.services.sagemaker.CfnImageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImage(
  id: String,
  props: CfnImageProps,
  initializer: CfnImage.() -> Unit = {},
): CfnImage = CfnImage(this, id, props).apply(initializer)
