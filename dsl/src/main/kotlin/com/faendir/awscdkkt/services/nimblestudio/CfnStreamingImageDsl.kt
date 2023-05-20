@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.nimblestudio

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps
import software.constructs.Construct

public fun Construct.cfnStreamingImage(
  id: String,
  props: CfnStreamingImageProps,
  initializer: CfnStreamingImage.() -> Unit = {},
): CfnStreamingImage = CfnStreamingImage(this, id, props).apply(initializer)
