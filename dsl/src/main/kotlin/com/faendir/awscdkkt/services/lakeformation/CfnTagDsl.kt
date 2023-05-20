@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnTag
import software.amazon.awscdk.services.lakeformation.CfnTagProps
import software.constructs.Construct

public fun Construct.cfnTag(
  id: String,
  props: CfnTagProps,
  initializer: CfnTag.() -> Unit = {},
): CfnTag = CfnTag(this, id, props).apply(initializer)
