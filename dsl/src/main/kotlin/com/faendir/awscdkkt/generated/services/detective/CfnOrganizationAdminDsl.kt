package com.faendir.awscdkkt.generated.services.detective

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnOrganizationAdmin
import software.amazon.awscdk.services.detective.CfnOrganizationAdminProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationAdmin(id: String, props: CfnOrganizationAdminProps):
    CfnOrganizationAdmin = CfnOrganizationAdmin(this, id, props)

@Generated
public fun Construct.cfnOrganizationAdmin(
  id: String,
  props: CfnOrganizationAdminProps,
  initializer: @AwsCdkDsl CfnOrganizationAdmin.() -> Unit,
): CfnOrganizationAdmin = CfnOrganizationAdmin(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationAdmin(id: String, initializer: @AwsCdkDsl
    CfnOrganizationAdmin.Builder.() -> Unit): CfnOrganizationAdmin =
    CfnOrganizationAdmin.Builder.create(this, id).apply(initializer).build()
