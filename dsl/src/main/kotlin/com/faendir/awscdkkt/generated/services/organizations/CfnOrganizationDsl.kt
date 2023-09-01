package com.faendir.awscdkkt.generated.services.organizations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnOrganization
import software.amazon.awscdk.services.organizations.CfnOrganizationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganization(id: String, initializer: @AwsCdkDsl CfnOrganization.() -> Unit
    = {}): CfnOrganization = CfnOrganization(this, id).apply(initializer)

@Generated
public fun Construct.cfnOrganization(
  id: String,
  props: CfnOrganizationProps,
  initializer: @AwsCdkDsl CfnOrganization.() -> Unit = {},
): CfnOrganization = CfnOrganization(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganization(id: String, initializer: @AwsCdkDsl
    CfnOrganization.Builder.() -> Unit = {}): CfnOrganization = CfnOrganization.Builder.create(this,
    id).apply(initializer).build()
