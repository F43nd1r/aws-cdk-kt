package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainConfiguration(id: String, initializer: @AwsCdkDsl
    CfnDomainConfiguration.() -> Unit = {}): CfnDomainConfiguration = CfnDomainConfiguration(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnDomainConfiguration(
  id: String,
  props: CfnDomainConfigurationProps,
  initializer: @AwsCdkDsl CfnDomainConfiguration.() -> Unit = {},
): CfnDomainConfiguration = CfnDomainConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainConfiguration(id: String, initializer: @AwsCdkDsl
    CfnDomainConfiguration.Builder.() -> Unit = {}): CfnDomainConfiguration =
    CfnDomainConfiguration.Builder.create(this, id).apply(initializer).build()
