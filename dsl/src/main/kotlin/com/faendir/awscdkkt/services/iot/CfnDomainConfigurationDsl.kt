package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainConfiguration(id: String,
    initializer: CfnDomainConfiguration.() -> Unit = {}): CfnDomainConfiguration =
    CfnDomainConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnDomainConfiguration(
  id: String,
  props: CfnDomainConfigurationProps,
  initializer: CfnDomainConfiguration.() -> Unit = {},
): CfnDomainConfiguration = CfnDomainConfiguration(this, id, props).apply(initializer)
