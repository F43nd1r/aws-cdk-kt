@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.amazon.awscdk.services.sagemaker.CfnImageProps
import software.constructs.Construct

public fun Construct.cfnImage(
  id: String,
  props: CfnImageProps,
  initializer: CfnImage.() -> Unit = {},
): CfnImage = CfnImage(this, id, props).apply(initializer)
