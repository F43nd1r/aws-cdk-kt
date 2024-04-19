package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin
import software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDelegatedAdmin(
  id: String,
  props: CfnDelegatedAdminProps,
  initializer: @AwsCdkDsl CfnDelegatedAdmin.() -> Unit = {},
): CfnDelegatedAdmin = CfnDelegatedAdmin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDelegatedAdmin(id: String, initializer: @AwsCdkDsl
    CfnDelegatedAdmin.Builder.() -> Unit = {}): CfnDelegatedAdmin =
    CfnDelegatedAdmin.Builder.create(this, id).apply(initializer).build()
