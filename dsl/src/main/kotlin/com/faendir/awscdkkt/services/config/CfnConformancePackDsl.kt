package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnConformancePackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConformancePack(
  id: String,
  props: CfnConformancePackProps,
  initializer: CfnConformancePack.() -> Unit = {},
): CfnConformancePack = CfnConformancePack(this, id, props).apply(initializer)
