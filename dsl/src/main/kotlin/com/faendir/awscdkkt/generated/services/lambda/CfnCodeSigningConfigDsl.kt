package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeSigningConfig(
  id: String,
  props: CfnCodeSigningConfigProps,
  initializer: @AwsCdkDsl CfnCodeSigningConfig.() -> Unit = {},
): CfnCodeSigningConfig = CfnCodeSigningConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeSigningConfig(id: String, initializer: @AwsCdkDsl
    CfnCodeSigningConfig.Builder.() -> Unit = {}): CfnCodeSigningConfig =
    CfnCodeSigningConfig.Builder.create(this, id).apply(initializer).build()
