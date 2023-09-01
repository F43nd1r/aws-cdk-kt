package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppImageConfig(
  id: String,
  props: CfnAppImageConfigProps,
  initializer: @AwsCdkDsl CfnAppImageConfig.() -> Unit = {},
): CfnAppImageConfig = CfnAppImageConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppImageConfig(id: String, initializer: @AwsCdkDsl
    CfnAppImageConfig.Builder.() -> Unit = {}): CfnAppImageConfig =
    CfnAppImageConfig.Builder.create(this, id).apply(initializer).build()
