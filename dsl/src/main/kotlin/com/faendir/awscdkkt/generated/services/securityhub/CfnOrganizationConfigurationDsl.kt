package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnOrganizationConfiguration
import software.amazon.awscdk.services.securityhub.CfnOrganizationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationConfiguration(
  id: String,
  props: CfnOrganizationConfigurationProps,
  initializer: @AwsCdkDsl CfnOrganizationConfiguration.() -> Unit = {},
): CfnOrganizationConfiguration = CfnOrganizationConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationConfiguration(id: String, initializer: @AwsCdkDsl
    CfnOrganizationConfiguration.Builder.() -> Unit = {}): CfnOrganizationConfiguration =
    CfnOrganizationConfiguration.Builder.create(this, id).apply(initializer).build()
