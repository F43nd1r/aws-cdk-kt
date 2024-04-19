package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnEncoderConfiguration
import software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEncoderConfiguration(id: String, initializer: @AwsCdkDsl
    CfnEncoderConfiguration.() -> Unit = {}): CfnEncoderConfiguration =
    CfnEncoderConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnEncoderConfiguration(
  id: String,
  props: CfnEncoderConfigurationProps,
  initializer: @AwsCdkDsl CfnEncoderConfiguration.() -> Unit = {},
): CfnEncoderConfiguration = CfnEncoderConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEncoderConfiguration(id: String, initializer: @AwsCdkDsl
    CfnEncoderConfiguration.Builder.() -> Unit = {}): CfnEncoderConfiguration =
    CfnEncoderConfiguration.Builder.create(this, id).apply(initializer).build()
