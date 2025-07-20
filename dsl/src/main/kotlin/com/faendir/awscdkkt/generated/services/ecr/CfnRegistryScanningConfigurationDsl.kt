package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration
import software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegistryScanningConfiguration(
  id: String,
  props: CfnRegistryScanningConfigurationProps,
  initializer: @AwsCdkDsl CfnRegistryScanningConfiguration.() -> Unit = {},
): CfnRegistryScanningConfiguration = CfnRegistryScanningConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRegistryScanningConfiguration(id: String, initializer: @AwsCdkDsl CfnRegistryScanningConfiguration.Builder.() -> Unit = {}): CfnRegistryScanningConfiguration = CfnRegistryScanningConfiguration.Builder.create(this, id).apply(initializer).build()
