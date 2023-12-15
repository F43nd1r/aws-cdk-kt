package com.faendir.awscdkkt.generated.services.fis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration
import software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTargetAccountConfiguration(
  id: String,
  props: CfnTargetAccountConfigurationProps,
  initializer: @AwsCdkDsl CfnTargetAccountConfiguration.() -> Unit = {},
): CfnTargetAccountConfiguration = CfnTargetAccountConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTargetAccountConfiguration(id: String, initializer: @AwsCdkDsl
    CfnTargetAccountConfiguration.Builder.() -> Unit = {}): CfnTargetAccountConfiguration =
    CfnTargetAccountConfiguration.Builder.create(this, id).apply(initializer).build()
