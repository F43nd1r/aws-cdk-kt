package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnSigningConfiguration
import software.amazon.awscdk.services.ecr.CfnSigningConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSigningConfiguration(
  id: String,
  props: CfnSigningConfigurationProps,
  initializer: @AwsCdkDsl CfnSigningConfiguration.() -> Unit = {},
): CfnSigningConfiguration = CfnSigningConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSigningConfiguration(id: String, initializer: @AwsCdkDsl CfnSigningConfiguration.Builder.() -> Unit = {}): CfnSigningConfiguration = CfnSigningConfiguration.Builder.create(this, id).apply(initializer).build()
