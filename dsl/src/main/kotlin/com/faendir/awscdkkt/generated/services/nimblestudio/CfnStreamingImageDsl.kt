package com.faendir.awscdkkt.generated.services.nimblestudio

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamingImage(
  id: String,
  props: CfnStreamingImageProps,
  initializer: @AwsCdkDsl CfnStreamingImage.() -> Unit = {},
): CfnStreamingImage = CfnStreamingImage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamingImage(id: String, initializer: @AwsCdkDsl
    CfnStreamingImage.Builder.() -> Unit = {}): CfnStreamingImage =
    CfnStreamingImage.Builder.create(this, id).apply(initializer).build()
