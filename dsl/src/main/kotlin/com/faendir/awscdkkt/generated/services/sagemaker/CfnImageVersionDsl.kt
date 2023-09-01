package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImageVersion(
  id: String,
  props: CfnImageVersionProps,
  initializer: @AwsCdkDsl CfnImageVersion.() -> Unit = {},
): CfnImageVersion = CfnImageVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnImageVersion(id: String, initializer: @AwsCdkDsl
    CfnImageVersion.Builder.() -> Unit = {}): CfnImageVersion = CfnImageVersion.Builder.create(this,
    id).apply(initializer).build()
