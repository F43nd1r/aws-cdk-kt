package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.amazon.awscdk.services.msk.CfnConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfiguration(
  id: String,
  props: CfnConfigurationProps,
  initializer: @AwsCdkDsl CfnConfiguration.() -> Unit = {},
): CfnConfiguration = CfnConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfiguration(id: String, initializer: @AwsCdkDsl
    CfnConfiguration.Builder.() -> Unit = {}): CfnConfiguration =
    CfnConfiguration.Builder.create(this, id).apply(initializer).build()
