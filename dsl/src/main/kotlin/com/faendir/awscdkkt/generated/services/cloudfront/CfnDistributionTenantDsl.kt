package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistributionTenant
import software.amazon.awscdk.services.cloudfront.CfnDistributionTenantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDistributionTenant(
  id: String,
  props: CfnDistributionTenantProps,
  initializer: @AwsCdkDsl CfnDistributionTenant.() -> Unit = {},
): CfnDistributionTenant = CfnDistributionTenant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDistributionTenant(id: String, initializer: @AwsCdkDsl CfnDistributionTenant.Builder.() -> Unit = {}): CfnDistributionTenant = CfnDistributionTenant.Builder.create(this, id).apply(initializer).build()
