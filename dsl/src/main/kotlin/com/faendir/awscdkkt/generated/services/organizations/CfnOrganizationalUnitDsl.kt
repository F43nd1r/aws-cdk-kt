package com.faendir.awscdkkt.generated.services.organizations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationalUnit(
  id: String,
  props: CfnOrganizationalUnitProps,
  initializer: @AwsCdkDsl CfnOrganizationalUnit.() -> Unit = {},
): CfnOrganizationalUnit = CfnOrganizationalUnit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationalUnit(id: String, initializer: @AwsCdkDsl
    CfnOrganizationalUnit.Builder.() -> Unit = {}): CfnOrganizationalUnit =
    CfnOrganizationalUnit.Builder.create(this, id).apply(initializer).build()
