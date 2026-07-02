package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnMicrovmImage
import software.amazon.awscdk.services.lambda.CfnMicrovmImageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMicrovmImage(
  id: String,
  props: CfnMicrovmImageProps,
  initializer: @AwsCdkDsl CfnMicrovmImage.() -> Unit = {},
): CfnMicrovmImage = CfnMicrovmImage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMicrovmImage(id: String, initializer: @AwsCdkDsl CfnMicrovmImage.Builder.() -> Unit = {}): CfnMicrovmImage = CfnMicrovmImage.Builder.create(this, id).apply(initializer).build()
