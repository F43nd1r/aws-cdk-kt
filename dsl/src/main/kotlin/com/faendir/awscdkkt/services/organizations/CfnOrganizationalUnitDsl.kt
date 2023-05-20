@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.organizations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
import software.constructs.Construct

public fun Construct.cfnOrganizationalUnit(
  id: String,
  props: CfnOrganizationalUnitProps,
  initializer: CfnOrganizationalUnit.() -> Unit = {},
): CfnOrganizationalUnit = CfnOrganizationalUnit(this, id, props).apply(initializer)
