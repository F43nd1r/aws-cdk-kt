package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationConformancePack(
  id: String,
  props: CfnOrganizationConformancePackProps,
  initializer: @AwsCdkDsl CfnOrganizationConformancePack.() -> Unit = {},
): CfnOrganizationConformancePack = CfnOrganizationConformancePack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationConformancePack(id: String, initializer: @AwsCdkDsl CfnOrganizationConformancePack.Builder.() -> Unit = {}): CfnOrganizationConformancePack = CfnOrganizationConformancePack.Builder.create(this, id).apply(initializer).build()
