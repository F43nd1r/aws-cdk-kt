package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnTenant
import software.amazon.awscdk.services.ses.CfnTenantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTenant(
  id: String,
  props: CfnTenantProps,
  initializer: @AwsCdkDsl CfnTenant.() -> Unit = {},
): CfnTenant = CfnTenant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTenant(id: String, initializer: @AwsCdkDsl CfnTenant.Builder.() -> Unit = {}): CfnTenant = CfnTenant.Builder.create(this, id).apply(initializer).build()
