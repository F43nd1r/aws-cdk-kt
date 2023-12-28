package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTLSInspectionConfiguration(
  id: String,
  props: CfnTLSInspectionConfigurationProps,
  initializer: @AwsCdkDsl CfnTLSInspectionConfiguration.() -> Unit = {},
): CfnTLSInspectionConfiguration = CfnTLSInspectionConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTLSInspectionConfiguration(id: String, initializer: @AwsCdkDsl
    CfnTLSInspectionConfiguration.Builder.() -> Unit = {}): CfnTLSInspectionConfiguration =
    CfnTLSInspectionConfiguration.Builder.create(this, id).apply(initializer).build()
