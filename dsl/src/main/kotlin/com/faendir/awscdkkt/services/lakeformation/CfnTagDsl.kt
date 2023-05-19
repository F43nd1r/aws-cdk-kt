@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
