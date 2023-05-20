@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
import software.constructs.Construct

public fun Construct.cfnOrganizationConformancePack(
  id: String,
  props: CfnOrganizationConformancePackProps,
  initializer: CfnOrganizationConformancePack.() -> Unit = {},
): CfnOrganizationConformancePack = CfnOrganizationConformancePack(this, id,
    props).apply(initializer)
