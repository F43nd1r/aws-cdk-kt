package com.faendir.awscdkkt.generated.services.mediapackage

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPackagingConfiguration(
  id: String,
  props: CfnPackagingConfigurationProps,
  initializer: @AwsCdkDsl CfnPackagingConfiguration.() -> Unit = {},
): CfnPackagingConfiguration = CfnPackagingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPackagingConfiguration(id: String, initializer: @AwsCdkDsl
    CfnPackagingConfiguration.Builder.() -> Unit = {}): CfnPackagingConfiguration =
    CfnPackagingConfiguration.Builder.create(this, id).apply(initializer).build()
