package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnImage.() -> Unit = {},
): CfnImage = CfnImage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnImage(id: String, initializer: @AwsCdkDsl CfnImage.Builder.() -> Unit =
    {}): CfnImage = CfnImage.Builder.create(this, id).apply(initializer).build()
