@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnConformancePackProps
import software.constructs.Construct

public fun Construct.cfnConformancePack(
  id: String,
  props: CfnConformancePackProps,
  initializer: CfnConformancePack.() -> Unit = {},
): CfnConformancePack = CfnConformancePack(this, id, props).apply(initializer)
