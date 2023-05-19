@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
