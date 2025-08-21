package com.faendir.awscdkkt.generated.services.inspectorv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnCodeSecurityScanConfiguration
import software.amazon.awscdk.services.inspectorv2.CfnCodeSecurityScanConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeSecurityScanConfiguration(id: String, initializer: @AwsCdkDsl CfnCodeSecurityScanConfiguration.() -> Unit = {}): CfnCodeSecurityScanConfiguration = CfnCodeSecurityScanConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnCodeSecurityScanConfiguration(
  id: String,
  props: CfnCodeSecurityScanConfigurationProps,
  initializer: @AwsCdkDsl CfnCodeSecurityScanConfiguration.() -> Unit = {},
): CfnCodeSecurityScanConfiguration = CfnCodeSecurityScanConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeSecurityScanConfiguration(id: String, initializer: @AwsCdkDsl CfnCodeSecurityScanConfiguration.Builder.() -> Unit = {}): CfnCodeSecurityScanConfiguration = CfnCodeSecurityScanConfiguration.Builder.create(this, id).apply(initializer).build()
