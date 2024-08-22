package com.faendir.awscdkkt.generated.services.inspectorv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCisScanConfiguration(
  id: String,
  props: CfnCisScanConfigurationProps,
  initializer: @AwsCdkDsl CfnCisScanConfiguration.() -> Unit = {},
): CfnCisScanConfiguration = CfnCisScanConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCisScanConfiguration(id: String, initializer: @AwsCdkDsl
    CfnCisScanConfiguration.Builder.() -> Unit = {}): CfnCisScanConfiguration =
    CfnCisScanConfiguration.Builder.create(this, id).apply(initializer).build()
