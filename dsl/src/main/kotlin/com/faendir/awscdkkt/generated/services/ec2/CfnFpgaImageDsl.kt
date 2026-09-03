package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnFpgaImage
import software.amazon.awscdk.services.ec2.CfnFpgaImageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFpgaImage(id: String, initializer: @AwsCdkDsl CfnFpgaImage.() -> Unit = {}): CfnFpgaImage = CfnFpgaImage(this, id).apply(initializer)

@Generated
public fun Construct.cfnFpgaImage(
  id: String,
  props: CfnFpgaImageProps,
  initializer: @AwsCdkDsl CfnFpgaImage.() -> Unit = {},
): CfnFpgaImage = CfnFpgaImage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFpgaImage(id: String, initializer: @AwsCdkDsl CfnFpgaImage.Builder.() -> Unit = {}): CfnFpgaImage = CfnFpgaImage.Builder.create(this, id).apply(initializer).build()
