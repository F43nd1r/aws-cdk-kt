package com.faendir.awscdkkt.generated.services.inspectorv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnCodeSecurityIntegration
import software.amazon.awscdk.services.inspectorv2.CfnCodeSecurityIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeSecurityIntegration(id: String, initializer: @AwsCdkDsl CfnCodeSecurityIntegration.() -> Unit = {}): CfnCodeSecurityIntegration = CfnCodeSecurityIntegration(this, id).apply(initializer)

@Generated
public fun Construct.cfnCodeSecurityIntegration(
  id: String,
  props: CfnCodeSecurityIntegrationProps,
  initializer: @AwsCdkDsl CfnCodeSecurityIntegration.() -> Unit = {},
): CfnCodeSecurityIntegration = CfnCodeSecurityIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeSecurityIntegration(id: String, initializer: @AwsCdkDsl CfnCodeSecurityIntegration.Builder.() -> Unit = {}): CfnCodeSecurityIntegration = CfnCodeSecurityIntegration.Builder.create(this, id).apply(initializer).build()
